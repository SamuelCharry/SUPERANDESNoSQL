package uniandes.edu.co.demo.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import uniandes.edu.co.demo.modelo.Producto;
import uniandes.edu.co.demo.repository.CategoriaRepository;
import uniandes.edu.co.demo.repository.ProductoRepository;
import uniandes.edu.co.demo.repository.ProductoRepositoryCustom;


@RestController
@RequestMapping("/productos")
public class ProductoController {

    @Autowired
    private ProductoRepository productoRepository;

    @Autowired
    private CategoriaRepository categoriaRepository;

    @Autowired
    private ProductoRepositoryCustom productoRepositoryCustom;

    

    // RF5 Crear Producto
    @PostMapping("/new")
    public ResponseEntity<String> crearProducto(@RequestBody Producto producto) {
        try {

            //tengo terror skill issue necesito esto
            System.out.println("Código de Barras recibido: " + producto.getCodigoDeBarras());



            if (producto.getCodigoDeBarras() == null || producto.getCodigoDeBarras().isEmpty()) {
                return new ResponseEntity<>("Error: El código de barras no puede ser nulo o vacío", HttpStatus.BAD_REQUEST);
            }
            if (productoRepository.existsById(producto.getCodigoDeBarras())) {
                return new ResponseEntity<>("Error: El producto ya existe", HttpStatus.CONFLICT);
            }
            if (producto.getCategoria_codigo() == null || 
                !categoriaRepository.existsById(producto.getCategoria_codigo().getCodigo())) {
                return new ResponseEntity<>("Error: La categoría asociada no existe", HttpStatus.BAD_REQUEST);
            }
            productoRepository.save(producto);
            return new ResponseEntity<>("Producto creado exitosamente", HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>("Error al crear el producto: " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // RF5 Leer Producto por Código
    @GetMapping("/codigo/{codigo}")
    public ResponseEntity<?> obtenerProductoPorCodigo(@PathVariable String codigo) {
        try {
            Optional<Producto> producto = productoRepository.findById(codigo);
            if (producto.isPresent()) {
                return new ResponseEntity<>(producto.get(), HttpStatus.OK);
            } else {
                return new ResponseEntity<>("Producto no encontrado", HttpStatus.NOT_FOUND);
            }
        } catch (Exception e) {
            return new ResponseEntity<>("Error al buscar el producto: " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // RF5 Leer Producto por Nombre
    @GetMapping("/nombre/{nombre}")
    public ResponseEntity<?> obtenerProductoPorNombre(@PathVariable String nombre) {
        try {
            Optional<Producto> producto = productoRepository.findProductoByNombre(nombre);
            if (producto.isPresent()) {
                return new ResponseEntity<>(producto.get(), HttpStatus.OK);
            } else {
                return new ResponseEntity<>("Producto no encontrado", HttpStatus.NOT_FOUND);
            }
        } catch (Exception e) {
            return new ResponseEntity<>("Error al buscar el producto: " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


    // RF5  Actualizar Producto
    @PutMapping("/update/{codigo}")
    public ResponseEntity<String> actualizarProducto(@PathVariable String codigo, @RequestBody Producto producto) {
        try {
            Optional<Producto> productoExistente = productoRepository.findById(codigo);
            if (productoExistente.isPresent()) {
                Producto productoActualizado = productoExistente.get();

                productoActualizado.setNombre(producto.getNombre());
                productoActualizado.setCostoEnBodega(producto.getCostoEnBodega());
                productoActualizado.setPrecioUnitario(producto.getPrecioUnitario());
                productoActualizado.setPresentacion(producto.getPresentacion());
                productoActualizado.setCantidadPresentacion(producto.getCantidadPresentacion());
                productoActualizado.setUnidadDeMedida(producto.getUnidadDeMedida());
                productoActualizado.setVolumen(producto.getVolumen());
                productoActualizado.setPeso(producto.getPeso());
                productoActualizado.setCategoria_codigo(producto.getCategoria_codigo());


                productoRepository.save(productoActualizado);
                return new ResponseEntity<>("Producto actualizado exitosamente", HttpStatus.OK);
            } else {
                return new ResponseEntity<>("Producto no encontrado", HttpStatus.NOT_FOUND);
            }
        } catch (Exception e) {
            return new ResponseEntity<>("Error al actualizar el producto: " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


    // RFC1 Buscar productos por características
    @GetMapping("/filtrar")
    public ResponseEntity<List<org.bson.Document>> filtrarProductos(
            @RequestParam double precioMin,
            @RequestParam double precioMax,
            @RequestParam String fechaLimite,
            @RequestParam String categoria,
            @RequestParam String sucursal
    ) {
        try {
            Date fecha = new SimpleDateFormat("yyyy-MM-dd").parse(fechaLimite);

            List<org.bson.Document> resultado = productoRepositoryCustom.obtenerProductosPorCondiciones(
                    precioMin, precioMax, fecha, categoria, sucursal
            );

            return ResponseEntity.ok(resultado);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }

}


    





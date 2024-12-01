package uniandes.edu.co.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import uniandes.edu.co.demo.modelo.OrdenDeCompra;
import uniandes.edu.co.demo.repository.OrdenDeCompraRepository;

@RestController
@RequestMapping("/ordenDeCompra")

public class OrdenDeCompraController {

    @Autowired
    private OrdenDeCompraRepository ordenDeCompraRepository;

    //RF6
    @PostMapping("/new")
    public ResponseEntity<String> crearOrden(@RequestBody OrdenDeCompra ordenDeCompra) {
        try {
            if (ordenDeCompraRepository.existsById(ordenDeCompra.getCodigo())) {
                return new ResponseEntity<>("Error: La orden de compra ya existe", HttpStatus.CONFLICT);
            }
            if (ordenDeCompra.getProveedor_nit() == null || 
                !ordenDeCompraRepository.existsById(ordenDeCompra.getProveedor_nit())) {
                return new ResponseEntity<>("Error: El NIT asociado no existe", HttpStatus.BAD_REQUEST);
            }
            if (ordenDeCompra.getSucursal_nombre() == null || ordenDeCompra.getSucursal_nombre().isEmpty()) {
                return new ResponseEntity<>("Error: La sucursal no puede ser nula o vacía", HttpStatus.BAD_REQUEST);
            }
            ordenDeCompraRepository.save(ordenDeCompra);
            return new ResponseEntity<>("Orden de compra creada exitosamente", HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>("Error al crear la orden de compra: " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    //RF7
    @GetMapping("/codigo/{codigo}")
    public ResponseEntity<?> obtenerOrdendeCompra(@PathVariable Integer codigo) {
        try {
            Optional<OrdenDeCompra> ordenDeCompra = ordenDeCompraRepository.findById(codigo);
            if (ordenDeCompra.isPresent()) {
                return new ResponseEntity<>(ordenDeCompra.get(), HttpStatus.OK);
            } else {
                return new ResponseEntity<>("Orden de Compra no encontrado", HttpStatus.NOT_FOUND);
            }
        } catch (Exception e) {
            return new ResponseEntity<>("Error al buscar la orden de Compra: " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}



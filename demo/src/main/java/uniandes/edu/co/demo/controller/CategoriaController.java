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

import uniandes.edu.co.demo.modelo.Categoria;
import uniandes.edu.co.demo.repository.CategoriaRepository;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {

    @Autowired
    private CategoriaRepository categoriaRepository;

    // RF4
    @PostMapping("/new/save")
    public ResponseEntity<String> crearCategoria(@RequestBody Categoria categoria) {
        try {
            if (categoriaRepository.existsById(categoria.getCodigo())) {
                return new ResponseEntity<>("Error: La categoría ya existe", HttpStatus.CONFLICT);
            }
            categoriaRepository.save(categoria);
            return new ResponseEntity<>("Categoría creada exitosamente", HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>("Error al crear la categoría: " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/codigo/{codigo}")
    public ResponseEntity<?> darCategoriaPorCodigo(@PathVariable int codigo) {
        try {
            Optional<Categoria> categoria = categoriaRepository.findCategoriaById(codigo);
            if (categoria.isPresent()) {
                return new ResponseEntity<>(categoria.get(), HttpStatus.OK);
            } else {
                return new ResponseEntity<>("Categoría no encontrada", HttpStatus.NOT_FOUND);
            }
        } catch (Exception e) {
            return new ResponseEntity<>("Error al buscar la categoría: " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    

    @GetMapping("/nombre/{nombre}")
    public ResponseEntity<?> darCategoriaPorNombre(@PathVariable String nombre) {
        try {
            Optional<Categoria> categoria = categoriaRepository.findCategoriaByNombre(nombre);
            return new ResponseEntity<>(categoria.get(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>("Error al leer la categoría: " + e.getMessage(),
                    HttpStatus.INTERNAL_SERVER_ERROR);
        }
}

}

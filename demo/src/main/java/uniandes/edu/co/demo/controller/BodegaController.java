package uniandes.edu.co.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import uniandes.edu.co.demo.modelo.Bodega;
import uniandes.edu.co.demo.repository.BodegaRepository;

@RestController
@RequestMapping("/bodegas")
public class BodegaController {

    @Autowired
    private BodegaRepository bodegaRepository;



    //RF2
    @PostMapping("/new/save")
    public ResponseEntity<String> crearBodega(@RequestBody Bodega bodega) {
        try {
            bodegaRepository.save(bodega);
            return new ResponseEntity<>("Bodega creada exitosamente", HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>("Error al crear la bodega: " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    
    @DeleteMapping("/{nombre}")
    public ResponseEntity<String> eliminarBodega(@PathVariable String nombre) {
        try {
            
            if (bodegaRepository.existsById(nombre)) {
                bodegaRepository.deleteById(nombre);
                return new ResponseEntity<>("Bodega eliminada exitosamente", HttpStatus.OK);
            } else {
                return new ResponseEntity<>("Bodega no encontrada", HttpStatus.NOT_FOUND);
            }
        } catch (Exception e) {
            return new ResponseEntity<>("Error al eliminar la bodega: " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    
    
}

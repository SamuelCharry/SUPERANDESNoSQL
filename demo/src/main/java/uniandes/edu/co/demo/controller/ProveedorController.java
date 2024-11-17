package uniandes.edu.co.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import uniandes.edu.co.demo.modelo.Proveedor;
import uniandes.edu.co.demo.repository.ProveedorRepository;

@RestController
@RequestMapping("/proveedores")
public class ProveedorController {

    @Autowired
    private ProveedorRepository proveedorRepository;

   //RF3
    @PostMapping("/new")
    public ResponseEntity<String> crearProveedor(@RequestBody Proveedor proveedor) {
        try {
            if (proveedorRepository.existsById(proveedor.getNit())) {
                return new ResponseEntity<>("Error: El proveedor ya existe", HttpStatus.CONFLICT);
            }
            proveedorRepository.save(proveedor);
            return new ResponseEntity<>("Proveedor creado exitosamente", HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>("Error al crear el proveedor: " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    
    @PutMapping("/update/{nit}")
    public ResponseEntity<String> actualizarProveedor(@PathVariable Integer nit, @RequestBody Proveedor proveedor) {
        try {
            if (!proveedorRepository.existsById(nit)) {
                return new ResponseEntity<>("Error: El proveedor no existe", HttpStatus.NOT_FOUND);
            }
            proveedor.setNit(nit);
            proveedorRepository.save(proveedor);
            return new ResponseEntity<>("Proveedor actualizado exitosamente", HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>("Error al actualizar el proveedor: " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}

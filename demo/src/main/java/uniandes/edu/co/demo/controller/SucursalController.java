package uniandes.edu.co.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import uniandes.edu.co.demo.modelo.Sucursal;
import uniandes.edu.co.demo.repository.SucursalRepository;

@RestController
@RequestMapping("/sucursales")
public class SucursalController {

    @Autowired
    private SucursalRepository sucursalRepository;

    //RF1
    @PostMapping("/new/save")
    public ResponseEntity<String> crearSucursal(@RequestBody Sucursal sucursal) {
        try {
            if (sucursalRepository.existsById(sucursal.getNombre())) {
                return new ResponseEntity<>("Error: La sucursal ya existe", HttpStatus.BAD_REQUEST);
            }
    
            sucursalRepository.save(sucursal);
            return new ResponseEntity<>("Sucursal creada exitosamente", HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>("Error al crear la sucursal: " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    



}

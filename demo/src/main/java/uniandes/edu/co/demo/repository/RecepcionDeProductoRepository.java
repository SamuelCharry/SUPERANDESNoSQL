package uniandes.edu.co.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import uniandes.edu.co.demo.modelo.RecepcionDeProducto;

public interface RecepcionDeProductoRepository extends MongoRepository<RecepcionDeProducto, Integer> {

   
}

package uniandes.edu.co.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import uniandes.edu.co.demo.modelo.InventarioDeProducto;


public interface InventarioDeProductoRepository extends MongoRepository<InventarioDeProducto, Integer> {

}

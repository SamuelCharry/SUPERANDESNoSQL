
package uniandes.edu.co.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import uniandes.edu.co.demo.modelo.InventarioDeProducto;
import uniandes.edu.co.demo.modelo.InventarioDeProductoPK;


public interface InventarioDeProductoRepository extends MongoRepository<InventarioDeProducto, InventarioDeProductoPK> {

}

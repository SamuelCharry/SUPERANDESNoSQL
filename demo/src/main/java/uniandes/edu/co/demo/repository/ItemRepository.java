
package uniandes.edu.co.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import uniandes.edu.co.demo.modelo.Item;
import uniandes.edu.co.demo.modelo.ItemPK;



public interface ItemRepository extends MongoRepository<Item, ItemPK> {

   
}

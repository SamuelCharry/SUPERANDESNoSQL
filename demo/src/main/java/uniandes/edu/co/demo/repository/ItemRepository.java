
package uniandes.edu.co.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import uniandes.edu.co.demo.modelo.Item;



public interface ItemRepository extends MongoRepository<Item, String> {

   
}

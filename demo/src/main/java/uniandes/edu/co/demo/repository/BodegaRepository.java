package uniandes.edu.co.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import uniandes.edu.co.demo.modelo.Bodega;


public interface BodegaRepository extends MongoRepository<Bodega, String> {

   
}

package uniandes.edu.co.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import uniandes.edu.co.demo.modelo.Categoria;


public interface CategoriaRepository extends MongoRepository<Categoria, Integer> {

} 

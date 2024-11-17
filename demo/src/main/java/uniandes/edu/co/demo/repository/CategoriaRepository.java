package uniandes.edu.co.demo.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import uniandes.edu.co.demo.modelo.Categoria;


public interface CategoriaRepository extends MongoRepository<Categoria, Integer> {

    Optional<Categoria> findByNombre(String nombre);

    @Query("{ '_id': ?0 }")
    Optional<Categoria> findCategoriaById(Integer codigo);

    @Query("{ 'nombre': ?0 }")
    Optional<Categoria> findCategoriaByNombre(String nombre);

} 

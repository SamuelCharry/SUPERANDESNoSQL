package uniandes.edu.co.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import uniandes.edu.co.demo.modelo.Proveedor;



public interface ProveedorRepository extends MongoRepository<Proveedor, Integer> {



}
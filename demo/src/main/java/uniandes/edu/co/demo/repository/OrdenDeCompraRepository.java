package uniandes.edu.co.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import uniandes.edu.co.demo.modelo.OrdenDeCompra;




public interface OrdenDeCompraRepository extends MongoRepository<OrdenDeCompra, Integer> {


}
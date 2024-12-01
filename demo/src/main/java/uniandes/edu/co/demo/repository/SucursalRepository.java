package uniandes.edu.co.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import uniandes.edu.co.demo.modelo.Sucursal;

public interface SucursalRepository extends MongoRepository<Sucursal, String> {

    // @Query(value = "{ 'nombre': :#{#nombreSucursal} }", update = "{ '$push': { 'bodegas': :#{#nuevaBodega} } }")
    // void agregarBodega(@Param("nombreSucursal") String nombreSucursal, @Param("nuevaBodega") Bodega nuevaBodega);


}
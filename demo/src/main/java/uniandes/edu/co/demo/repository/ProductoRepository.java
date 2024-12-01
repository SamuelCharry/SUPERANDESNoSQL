package uniandes.edu.co.demo.repository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import uniandes.edu.co.demo.modelo.Producto;



public interface ProductoRepository extends MongoRepository<Producto, String> {


    @Query("{ 'nombre': ?0 }")
    Optional<Producto> findProductoByNombre(String nombre);


    @Query("{ 'nombre': { $regex: ?0, $options: 'i' } }")
    List<Producto> findProductosByNombreParcial(String nombre);


    //RFC1
    @Query("{ '$and': [ " +
            "{ 'precio_unitario': { '$gte': ?0, '$lte': ?1 } }, " + 
            "{ 'fecha_vencimiento': { '$gte': ?2 } }, " +           
            "{ 'categoria_codigo.nombre': ?3 }, " )             
            //"{ 'disponible_en_sucursal': ?4 } ] }")                
    List<Producto> findProductosPorCaracteristicas(
            Double precioMin, 
            Double precioMax,
            Date fechaVencimiento,
            String categoriaNombre
            //String sucursalNombre
    );
    
}
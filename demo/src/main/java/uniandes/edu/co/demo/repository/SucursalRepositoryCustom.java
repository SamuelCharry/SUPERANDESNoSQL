package uniandes.edu.co.demo.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Component;

import uniandes.edu.co.demo.modelo.Bodega;
import uniandes.edu.co.demo.modelo.Sucursal;

@Component 
public class SucursalRepositoryCustom {

    @Autowired
    private MongoTemplate mongoTemplate;

    public void agregarBodega(String nombreSucursal, Bodega nuevaBodega) {
        Query query = new Query();
        query.addCriteria(Criteria.where("nombre").is(nombreSucursal));
        Update update = new Update();
        update.push("bodegas", nuevaBodega);
        mongoTemplate.updateFirst(query, update, Sucursal.class);
    }


    public void deleteBodega(String nombreSucursal, String nombreBodega) {
        Query query = new Query();
        query.addCriteria(Criteria.where("nombre").is(nombreSucursal));
        Update update = new Update();
        update.pull("bodegas", Query.query(Criteria.where("nombre").is(nombreBodega)));
        mongoTemplate.updateFirst(query, update, Sucursal.class);
    }
}


package uniandes.edu.co.demo.repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.bson.Document;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ProductoRepositoryCustom {

    private final MongoTemplate mongoTemplate;

    public ProductoRepositoryCustom(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    public List<Document> obtenerProductosPorCondiciones(
            double precioMin, double precioMax, Date fecha, String categoria, String sucursal) {

        List<Document> pipeline = List.of(
            new Document("$lookup", new Document()
                .append("from", "inventariodeproducto")
                .append("localField", "_id")
                .append("foreignField", "producto_codigodebarras")
                .append("as", "inventario_info")
            ),
            new Document("$lookup", new Document()
                .append("from", "sucursal")
                .append("localField", "inventario_info.bodega_nombre")
                .append("foreignField", "_id")
                .append("as", "sucursal_info")
            ),
            new Document("$match", new Document()
                .append("precio_unitario", new Document()
                    .append("$gte", precioMin)
                    .append("$lte", precioMax)
                )
                .append("fecha_vencimiento", new Document()
                    .append("$lte", fecha)
                )
                .append("categoria_codigo.nombre", categoria)
                .append("sucursal_info._id", sucursal)
            )
        );

        return mongoTemplate.getCollection("producto").aggregate(pipeline).into(new ArrayList<>());
    }
}

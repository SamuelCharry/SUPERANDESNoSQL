package uniandes.edu.co.demo.modelo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="item")
public class Item {

    // Atributos
    @Id
    private ItemPK pk;
    private Integer cantidad;
    private Integer precio;

    // Constructor
    public Item(OrdenDeCompra ordendecompra_codigo, Producto producto_codigodebarras, Integer cantidad, Integer precio) {
        this.pk = new ItemPK(ordendecompra_codigo, producto_codigodebarras);
        this.cantidad = cantidad;
        this.precio = precio;
    }

    // Constructor vacio
    public Item() {
        ;
    }

    // Getters and Setters
    public ItemPK getPk() {
        return pk;
    }

    public void setPk(ItemPK pk) {
        this.pk = pk;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }
}
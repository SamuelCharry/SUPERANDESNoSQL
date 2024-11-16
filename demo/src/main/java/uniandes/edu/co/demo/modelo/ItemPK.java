package uniandes.edu.co.demo.modelo;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.ToString;

@Document(collection="")//TODO 
@ToString
public class ItemPK {

    // Atributos
   
    private OrdenDeCompra ordendecompra_codigo;

    
    private Producto producto_codigodebarras;

    // Constructor
    public ItemPK(OrdenDeCompra ordendecompra_codigo, Producto producto_codigodebarras) {
        super();
        this.ordendecompra_codigo = ordendecompra_codigo;
        this.producto_codigodebarras = producto_codigodebarras;
    }

    // Constructor vacio
    public ItemPK() {
        super();
    }

    // Getters and Setters
    public OrdenDeCompra getOrdendecompra_codigo() {
        return ordendecompra_codigo;
    }

    public void setOrdendecompra_codigo(OrdenDeCompra ordendecompra_codigo) {
        this.ordendecompra_codigo = ordendecompra_codigo;
    }

    public Producto getProducto_codigodebarras() {
        return producto_codigodebarras;
    }

    public void setProducto_codigodebarras(Producto producto_codigodebarras) {
        this.producto_codigodebarras = producto_codigodebarras;
    }
}
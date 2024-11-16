package uniandes.edu.co.demo.modelo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.ToString;

@Document(collection="")//TODO 
@ToString
public class OfrecenPK {

    
    private Proveedor proveedor_nit;

    
    private Producto producto_codigodebarras;

    public OfrecenPK() {
        super();
    }

    public OfrecenPK(Proveedor proveedor_nit, Producto producto_codigodebarras) {
        super();
        this.proveedor_nit = proveedor_nit;
        this.producto_codigodebarras = producto_codigodebarras;
    }

    public Proveedor getProveedor_nit() {
        return proveedor_nit;
    }

    public void setProveedor_nit(Proveedor proveedor_nit) {
        this.proveedor_nit = proveedor_nit;
    }

    public Producto getProducto_codigodebarras() {
        return producto_codigodebarras;
    }

    public void setProducto_codigodebarras(Producto producto_codigodebarras) {
        this.producto_codigodebarras = producto_codigodebarras;
    }
}

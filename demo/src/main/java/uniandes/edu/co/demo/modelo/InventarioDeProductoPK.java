package uniandes.edu.co.demo.modelo;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.ToString;

@Document(collection="")//TODO  la verdad no se 
@ToString
public class InventarioDeProductoPK {

    // Atributos
    
    private Bodega bodega_nombre;

  
    private Producto producto_codigodebarras;

    // Constructor
    public InventarioDeProductoPK(Bodega bodega_nombre, Producto producto_codigodebarras) {
        super();
        this.bodega_nombre = bodega_nombre;
        this.producto_codigodebarras = producto_codigodebarras;
    }

    // Constructor vacio
    public InventarioDeProductoPK() {
        super();
    }

    // GETTERS
    public Bodega getNombreBodega() {
        return bodega_nombre;
    }

    public Producto getCodigoDeBarras() {
        return producto_codigodebarras;
    }

    // SETTERS
    public void setNombreBodega(Bodega bodega_nombre) {
        this.bodega_nombre = bodega_nombre;
    }

    public void setCodigoDeBarras(Producto producto_codigodebarras) {
        this.producto_codigodebarras = producto_codigodebarras;
    }
}
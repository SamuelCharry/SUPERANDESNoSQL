package uniandes.edu.co.demo.modelo;

import java.util.Date;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.ToString;

@Document(collection="recepciondeproducto")
@ToString
public class RecepcionDeProducto {

    // Atributos
    @Id
    private Integer idrecepcion;
    private Date fecha_ingreso;

    
    private Bodega bodega_nombre;

    
    private OrdenDeCompra ordendecompra_codigo;


    // Constructor
    public RecepcionDeProducto(Integer idrecepcion, Date fecha_ingreso, Bodega bodega_nombre, OrdenDeCompra ordendecompra_codigo) {
        this.idrecepcion = idrecepcion;
        this.fecha_ingreso = fecha_ingreso;
        this.bodega_nombre = bodega_nombre;
        this.ordendecompra_codigo = ordendecompra_codigo;
    }

    // Constructor Vacio
    public RecepcionDeProducto() {;}

    // GETTERS
    public Integer getIdrecepcion() {
        return idrecepcion;
    }
    
    public Date getFecha_ingreso() {
        return fecha_ingreso;
    }

    public Bodega getBodega_nombre() {
        return bodega_nombre;
    }

    public OrdenDeCompra getOrdendecompra_codigo() {
        return ordendecompra_codigo;
    }

    // SETTERS
    public void setIdrecepcion(Integer idrecepcion) {
        this.idrecepcion = idrecepcion;
    }

    public void setFecha_ingreso(Date fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

    public void setBodega_nombre(Bodega bodega_nombre) {
        this.bodega_nombre = bodega_nombre;
    }

    public void setOrdendecompra_codigo(OrdenDeCompra ordendecompra_codigo) {
        this.ordendecompra_codigo = ordendecompra_codigo;
    }
}
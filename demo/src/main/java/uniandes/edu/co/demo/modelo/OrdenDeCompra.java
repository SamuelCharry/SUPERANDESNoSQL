package uniandes.edu.co.demo.modelo;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.ToString;

@Document(collection="ordendecompra")
@ToString
public class OrdenDeCompra {

    //Atributos
    @Id
    private Integer codigo;
    private Date fechaCreacion;
    private Date fechaEntrega;
    private String estado;

   
    private Proveedor proveedor_nit;

    
    private Sucursal sucursal_nombre;

    //Constructor
    public OrdenDeCompra(Date fechaCreacion, Date fechaEntrega, String estado, Proveedor proveedor_nit, Sucursal sucursal_nombre) {
        this.fechaCreacion = fechaCreacion;
        this.fechaEntrega = fechaEntrega;
        this.estado = estado;
        this.proveedor_nit = proveedor_nit;
        this.sucursal_nombre = sucursal_nombre;
    }

    //Constructor vacio
    public OrdenDeCompra() {;}

    //GETTERS
    public Integer getCodigo() {
        return codigo;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public String getEstado() {
        return estado;
    }

    public Proveedor getProveedor_nit() {
        return proveedor_nit;
    }

    public Sucursal getSucursal_nombre() {
        return sucursal_nombre;
    }

    //SETTERS
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setProveedor_nit(Proveedor proveedor_nit) {
        this.proveedor_nit = proveedor_nit;
    }

    public void setSucursal_nombre(Sucursal sucursal_nombre) {
        this.sucursal_nombre = sucursal_nombre;
    }
}

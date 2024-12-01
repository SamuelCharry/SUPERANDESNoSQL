package uniandes.edu.co.demo.modelo;

import java.util.Date;
import java.util.List;

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
    private Integer proveedor_nit;
    private String sucursal_nombre;
    private List<Item> items;

    public OrdenDeCompra(Integer codigo, String estado, Date fechaCreacion, Date fechaEntrega, List<Item> items, Integer proveedor_nit, String sucursal_nombre) {
        this.codigo = codigo;
        this.estado = estado;
        this.fechaCreacion = fechaCreacion;
        this.fechaEntrega = fechaEntrega;
        this.items = items;
        this.proveedor_nit = proveedor_nit;
        this.sucursal_nombre = sucursal_nombre;
    }

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

    public Integer getProveedor_nit() {
        return proveedor_nit;
    }

    public String getSucursal_nombre() {
        return sucursal_nombre;
    }

    public List<Item> getItems() {
        return items;
    }

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

    public void setProveedor_nit(Integer proveedor_nit) {
        this.proveedor_nit = proveedor_nit;
    }

    public void setSucursal_nombre(String sucursal_nombre) {
        this.sucursal_nombre = sucursal_nombre;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

}
package uniandes.edu.co.demo.modelo;

import java.util.Date;
import java.util.List;

public class ProductoFiltro {
    private String _id;
    private String nombre;
    private double precio_unitario;
    private Date fecha_vencimiento;
    private String categoria_nombre;
    private List<SucursalInfo> sucursal_info;

    public ProductoFiltro() {
    }

    public ProductoFiltro(String _id, String nombre, double precio_unitario, Date fecha_vencimiento, String categoria_nombre, List<SucursalInfo> sucursal_info) {
        this._id = _id;
        this.nombre = nombre;
        this.precio_unitario = precio_unitario;
        this.fecha_vencimiento = fecha_vencimiento;
        this.categoria_nombre = categoria_nombre;
        this.sucursal_info = sucursal_info;
    }
   
    public String getId() {
        return _id;
    }

    public void setId(String _id) {
        this._id = _id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecioUnitario() {
        return precio_unitario;
    }

    public void setPrecioUnitario(double precio_unitario) {
        this.precio_unitario = precio_unitario;
    }

    public Date getFechaVencimiento() {
        return fecha_vencimiento;
    }

    public void setFechaVencimiento(Date fecha_vencimiento) {
        this.fecha_vencimiento = fecha_vencimiento;
    }

    public String getCategoriaNombre() {
        return categoria_nombre;
    }

    public void setCategoriaNombre(String categoria_nombre) {
        this.categoria_nombre = categoria_nombre;
    }

    public List<SucursalInfo> getSucursalInfo() {
        return sucursal_info;
    }

    public void setSucursalInfo(List<SucursalInfo> sucursal_info) {
        this.sucursal_info = sucursal_info;
    }

    @Override
    public String toString() {
        return "ProductoFiltro{" +
                "_id='" + _id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", precio_unitario=" + precio_unitario +
                ", fecha_vencimiento=" + fecha_vencimiento +
                ", categoria_nombre='" + categoria_nombre + '\'' +
                ", sucursal_info=" + sucursal_info +
                '}';
    }
}

class SucursalInfo {
    private String _id;
    private String direccion;


    public String getId() {
        return _id;
    }

    public void setId(String _id) {
        this._id = _id;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "SucursalInfo{" +
                "_id='" + _id + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}


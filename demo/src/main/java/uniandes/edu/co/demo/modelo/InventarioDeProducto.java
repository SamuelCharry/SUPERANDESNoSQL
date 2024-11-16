package uniandes.edu.co.demo.modelo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.ToString;

@Document(collection="inventariodeproducto")
@ToString
public class InventarioDeProducto {

    // Atributos
    @Id
    private InventarioDeProductoPK pk;
    private Integer costo_promedio;
    private Integer cantidad;
    private Integer capacidad;
    private Integer nivelminimoreorden;

    // Constructor
    public InventarioDeProducto(Bodega nombre_bodega, Producto codigoDeBarras_producto, Integer costoPromedio,
            Integer cantidad, Integer capacidad, Integer nivelMinimoReorden) {
        this.pk = new InventarioDeProductoPK(nombre_bodega, codigoDeBarras_producto);
        this.costo_promedio = costoPromedio;
        this.cantidad = cantidad;
        this.capacidad = capacidad;
        this.nivelminimoreorden = nivelMinimoReorden;
    }

    // Constructor vacio
    public InventarioDeProducto() {
        ;
    }

    // GETTERS
    public InventarioDeProductoPK getPk() {
        return pk;
    }

    public Integer getCostoPromedio() {
        return costo_promedio;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public Integer getCapacidad() {
        return capacidad;
    }

    public Integer getNivelMinimoReorden() {
        return nivelminimoreorden;
    }

    // SETTERS
    public void setPk(InventarioDeProductoPK pk) {
        this.pk = pk;
    }

    public void setCostoPromedio(Integer costoPromedio) {
        this.costo_promedio = costoPromedio;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public void setCapacidad(Integer capacidad) {
        this.capacidad = capacidad;
    }

    public void setNivelMinimoReorden(Integer nivelMinimoReorden) {
        this.nivelminimoreorden = nivelMinimoReorden;
    }
}
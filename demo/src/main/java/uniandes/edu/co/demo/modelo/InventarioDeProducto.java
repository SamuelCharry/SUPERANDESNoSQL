package uniandes.edu.co.demo.modelo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.ToString;

@Document(collection="inventariodeproducto")
@ToString
public class InventarioDeProducto {

    // Atributos
    @Id
    private Integer codigo;
    private Integer costo_promedio;
    private Integer cantidad;
    private Integer capacidad;
    private Integer nivelminimoreorden;
    private Integer[] codigo_barra_productos;

    // Constructor

    public InventarioDeProducto(Integer cantidad, Integer capacidad, Integer codigo, Integer[] codigo_barra_productos, Integer costo_promedio, Integer nivelminimoreorden) {
        this.cantidad = cantidad;
        this.capacidad = capacidad;
        this.codigo = codigo;
        this.codigo_barra_productos = codigo_barra_productos;
        this.costo_promedio = costo_promedio;
        this.nivelminimoreorden = nivelminimoreorden;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public Integer getCosto_promedio() {
        return costo_promedio;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public Integer getCapacidad() {
        return capacidad;
    }

    public Integer getNivelminimoreorden() {
        return nivelminimoreorden;
    }

    public Integer[] getCodigo_barra_productos() {
        return codigo_barra_productos;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public void setCosto_promedio(Integer costo_promedio) {
        this.costo_promedio = costo_promedio;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public void setCapacidad(Integer capacidad) {
        this.capacidad = capacidad;
    }

    public void setNivelminimoreorden(Integer nivelminimoreorden) {
        this.nivelminimoreorden = nivelminimoreorden;
    }

    public void setCodigo_barra_productos(Integer[] codigo_barra_productos) {
        this.codigo_barra_productos = codigo_barra_productos;
    }
    
}
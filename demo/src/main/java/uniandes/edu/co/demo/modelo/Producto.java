package uniandes.edu.co.demo.modelo;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.ToString;

@Document(collection="producto")
@ToString
public class Producto {

    //Atributos
    @Id
    @JsonProperty("codigo_de_barras") //esto arreglo esa vaina con el json que decia id null, Evita errores cuando los nombres de los campos no coinciden. osea _id y codigo_de_barras
    private String codigo_de_barras;
    private String nombre;
    private Double costo_en_bodega;
    private Double precio_unitario;
    private Integer cantidad_presentacion;
    private String presentacion;
    private String unidad_de_medida;
    private Double volumen;
    private Double peso;
    private Integer categoria_codigo;

    //Constructor
    public Producto(String codigo_de_barras, String nombre, Double costo_en_bodega, Double precio_unitario, Integer cantidad_presentacion, String presentacion, String unidad_de_medida, Double volumen, Double peso, Integer categoria_codigo) {
        this.codigo_de_barras = codigo_de_barras;
        this.nombre = nombre;
        this.costo_en_bodega = costo_en_bodega;
        this.precio_unitario = precio_unitario;
        this.cantidad_presentacion = cantidad_presentacion;
        this.presentacion = presentacion;
        this.unidad_de_medida = unidad_de_medida;
        this.volumen = volumen;
        this.peso = peso;
        this.categoria_codigo = categoria_codigo;
    }

    public String getCodigo_de_barras() {
        return codigo_de_barras;
    }

    public String getNombre() {
        return nombre;
    }

    public Double getCosto_en_bodega() {
        return costo_en_bodega;
    }

    public Double getPrecio_unitario() {
        return precio_unitario;
    }

    public Integer getCantidad_presentacion() {
        return cantidad_presentacion;
    }

    public String getPresentacion() {
        return presentacion;
    }

    public String getUnidad_de_medida() {
        return unidad_de_medida;
    }

    public Double getVolumen() {
        return volumen;
    }

    public Double getPeso() {
        return peso;
    }

    public Integer getCategoria_codigo() {
        return categoria_codigo;
    }

    public void setCodigo_de_barras(String codigo_de_barras) {
        this.codigo_de_barras = codigo_de_barras;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCosto_en_bodega(Double costo_en_bodega) {
        this.costo_en_bodega = costo_en_bodega;
    }

    public void setPrecio_unitario(Double precio_unitario) {
        this.precio_unitario = precio_unitario;
    }

    public void setCantidad_presentacion(Integer cantidad_presentacion) {
        this.cantidad_presentacion = cantidad_presentacion;
    }

    public void setPresentacion(String presentacion) {
        this.presentacion = presentacion;
    }

    public void setUnidad_de_medida(String unidad_de_medida) {
        this.unidad_de_medida = unidad_de_medida;
    }

    public void setVolumen(Double volumen) {
        this.volumen = volumen;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public void setCategoria_codigo(Integer categoria_codigo) {
        this.categoria_codigo = categoria_codigo;
    }
}
package uniandes.edu.co.demo.modelo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.ToString;

@Document(collection="categoria")
@ToString
public class Categoria {

    //Atributos
    @Id
    private Integer codigo;
    private String nombre;
    private String descripcion;
    private String caracteristicas_almacenamiento;

    //Constructor
    public Categoria(Integer codigo, String nombre, String descripcion, String caracteristicas_almacenamiento) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.caracteristicas_almacenamiento = caracteristicas_almacenamiento;
    }

    //Constructor vacio
    public Categoria() {;}

    //GETTERS
    public Integer getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getCaracteristicas_almacenamiento() {
        return caracteristicas_almacenamiento;
    }

    //SETTERS
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setCaracteristicas_almacenamiento(String caracteristicas_almacenamiento) {
        this.caracteristicas_almacenamiento = caracteristicas_almacenamiento;
    }  
}
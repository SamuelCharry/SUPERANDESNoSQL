package uniandes.edu.co.demo.modelo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.ToString;

@Document(collection="sucursal")
@ToString
public class Sucursal {
    
    //Atributos
   @Id
    private String nombre;
    private Integer tamanio;
    private String direccion;
    private Integer telefono;

    
    private Ciudad codigo_ciudad;

    //Constructor
    public Sucursal(String nombre, Integer tamanio, String direccion, Integer telefono, Ciudad codigo_ciudad) {
        this.nombre = nombre;
        this.tamanio = tamanio;
        this.direccion = direccion;
        this.telefono = telefono;
        this.codigo_ciudad = codigo_ciudad;
    }
    
    //Constructor vacio
    public Sucursal() {;}

    //GETTERS
    public String getNombre() {
        return nombre;
    }

    public Integer getTamanio() {
        return tamanio;
    }

    public String getDireccion() {
        return direccion;
    }

    public Integer  getTelefono() {
        return telefono;
    }

    public Ciudad getCiudad() {
        return codigo_ciudad;
    }

    //SETTERS
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTamanio(Integer tamanio) {
        this.tamanio = tamanio;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(Integer  telefono) {
        this.telefono = telefono;
    }

    public void setCiudad(Ciudad codigo_ciudad) {
        this.codigo_ciudad = codigo_ciudad;
    }
}
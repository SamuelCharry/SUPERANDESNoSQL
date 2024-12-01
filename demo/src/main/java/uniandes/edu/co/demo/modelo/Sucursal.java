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
    private String ciudad;
    private Bodega[] bodegas;

    //Constructor
    public Sucursal(String nombre, Integer tamanio, String direccion, Integer telefono, String ciudad) {
        this.nombre = nombre;
        this.tamanio = tamanio;
        this.direccion = direccion;
        this.telefono = telefono;
        this.ciudad = ciudad;
       
    }
    
    
    //Constructor vacio
    public Sucursal() {;}

    public String getNombre() {
        return nombre;
    }   
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getTamanio() {
        return tamanio;
    }

    public void setTamanio(Integer tamanio) {
        this.tamanio = tamanio;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public Bodega[] getBodegas() {
        return bodegas;
    }

    public void setBodegas(Bodega[] bodegas) {
        this.bodegas = bodegas;
    }
}
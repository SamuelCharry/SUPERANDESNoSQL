package uniandes.edu.co.demo.modelo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.ToString;

@Document(collection="bodega")
@ToString
public class Bodega {
    
    //Atributos
    @Id
    private String nombre;
    private Integer tamanio;
    
   
    private Sucursal nombre_sucursal;

    // Constructor
    public Bodega(String nombre, Integer tamanio, Sucursal nombre_sucursal) {
        this.nombre = nombre;
        this.tamanio = tamanio;
        this.nombre_sucursal = nombre_sucursal;
    }

    // Constructor vacio
    public Bodega() {;}

    //GETTERS
    public String getNombre() {
        return nombre;
    }

    public Integer  getTamanio() {
        return tamanio;
    }

    public Sucursal getNombre_sucursal() {
        return nombre_sucursal;
    }

    //SETTERS
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTamanio(Integer  tamanio) {
        this.tamanio = tamanio;
    }

    public void setNombre_sucursal(Sucursal nombre_sucursal) {
        this.nombre_sucursal = nombre_sucursal;
    }
}

package uniandes.edu.co.demo.modelo;

import java.util.List;

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
    private List<Integer> Inventarios;

    public Bodega(String nombre, Integer tamanio, List<Integer> Inventarios) {
        this.Inventarios = Inventarios;
        this.nombre = nombre;
        this.tamanio = tamanio;
    }

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

    public List<Integer> getInventarios() {
        return Inventarios;
    }

    public void setInventarios(List<Integer> Inventarios) {
        this.Inventarios = Inventarios;
    }

  
}

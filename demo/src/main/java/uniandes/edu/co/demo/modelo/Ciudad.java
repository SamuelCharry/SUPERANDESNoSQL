package uniandes.edu.co.demo.modelo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.ToString;

@Document(collection="ciudad")
@ToString
public class Ciudad {

    
    //Atributos
    @Id
    private Integer codigo;
    private String nombre;

    //Constructor
    public Ciudad(String nombre) {
        this.nombre = nombre;
    }

    //Constructor vacio
    public Ciudad() 
    {;}

    //GETTERS
    public Integer getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    //SETTERS
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
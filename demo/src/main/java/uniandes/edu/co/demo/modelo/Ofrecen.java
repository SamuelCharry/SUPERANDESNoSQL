package uniandes.edu.co.demo.modelo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.ToString;

@Document(collection="ofrecen")
@ToString
public class Ofrecen {
    
    @Id
    private OfrecenPK pk;
    
    public Ofrecen() {
    }

    public Ofrecen(OfrecenPK pk) {
        this.pk = pk;
    }

    
    public OfrecenPK getId() {
        return pk;
    }

  
    public void setId(OfrecenPK id) {
        this.pk = id;
    }
}


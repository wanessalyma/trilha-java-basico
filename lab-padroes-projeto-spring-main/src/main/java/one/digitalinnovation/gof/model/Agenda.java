package one.digitalinnovation.gof.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Agenda {
    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    long id;

    LocalDateTime agora = LocalDateTime.now();
    String descrição = "Teatro casa verde - Iracema";

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public LocalDateTime getAgora() {
        return agora;
    }
    public void setAgora(LocalDateTime agora) {
        this.agora = agora;
    }
    public String getDescrição() {
        return descrição;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }
    
}

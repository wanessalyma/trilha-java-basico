package dev.dio.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity(name = "tab_formaPagamento")
public class FormaPagamento {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;
    String tipo;
    String troco;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTroco() {
        return troco;
    }

    public void setTroco(String troco) {
        this.troco = troco;
    }
}

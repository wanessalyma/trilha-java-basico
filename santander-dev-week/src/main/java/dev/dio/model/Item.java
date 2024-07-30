package dev.dio.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity(name = "tab_item")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;
    String nome;
    int qtd;
    @Column(precision = 13, scale = 2)
    BigDecimal valor;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

}

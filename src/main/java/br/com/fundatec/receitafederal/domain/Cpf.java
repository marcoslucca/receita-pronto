package br.com.fundatec.receitafederal.domain;

import javax.persistence.*;

@Entity
@Table(name = "cpf")
public class Cpf {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "cpf", unique = true)
    private String cpf;

    @Column(name = "pendencia")
    private String pendencia;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getPendencia() {
        return pendencia;
    }

    public void setPendencia(String pendencia) {
        this.pendencia = pendencia;
    }
}

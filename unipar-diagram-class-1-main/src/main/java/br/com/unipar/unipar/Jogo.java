/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.unipar.unipar;

import java.time.Clock;
import java.util.Date;

/**
 *
 * @author Anderson
 */
public class Jogo {
    
    private Integer id;
    private String nomeJogo;
    private Date dtLancto;
    private double vlPrecoLocacao;
    private boolean stLocado;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomeJogo() {
        return nomeJogo;
    }

    public void setNomeJogo(String nomeJogo) {
        this.nomeJogo = nomeJogo;
    }

    public Date getDtLancto() {
        return dtLancto;
    }

    public void setDtLancto(Date dtLancto) {
        this.dtLancto = dtLancto;
    }

    public double getVlPrecoLocacao() {
        return vlPrecoLocacao;
    }

    public void setVlPrecoLocacao(double vlPrecoLocacao) {
        this.vlPrecoLocacao = vlPrecoLocacao;
    }

    public String isJogoLocado() {
        return this.stLocado ? "Jogo já locado" : "Jogo liberado";
    }    
    
}

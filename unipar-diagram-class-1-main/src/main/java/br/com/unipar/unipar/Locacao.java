/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.unipar.unipar;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Anderson
 */
public class Locacao {
    
    private Integer id;
    private Date dtLocacao;
    private Cliente cliente;
    private ArrayList<Jogo> jogosLocados;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDtLocacao() {
        return dtLocacao;
    }

    public void setDtLocacao(Date dtLocacao) {
        this.dtLocacao = dtLocacao;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<Jogo> getJogosLocados() {
        return jogosLocados;
    }

    public void setJogosLocados(ArrayList<Jogo> jogosLocados) {
        this.jogosLocados = jogosLocados;
    }
    
    public void addJogo(Jogo jogo) {
        this.jogosLocados.add(jogo);
    }
    
}

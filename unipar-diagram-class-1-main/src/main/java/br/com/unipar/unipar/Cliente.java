/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.unipar.unipar;

import java.util.Date;

public class Cliente {
    
    private Integer id;
    private String nome;
    private Date dtCadastro;
    private Date dtNascimento;
    private Endereco endereco;
    private String nrTelefone;
    private Double limiteJogosAlocados;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDtCadastro() {
        return dtCadastro;
    }

    public void setDtCadastro(Date dtCadastro) {
        this.dtCadastro = dtCadastro;
    }

    public Date getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(Date dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getNrTelefone() {
        return nrTelefone;
    }

    public void setNrTelefone(String nrTelefone) {
        this.nrTelefone = nrTelefone;
    }
    
    public void addLimiteJogos(Integer limite) {
        this.limiteJogosAlocados = this.limiteJogosAlocados + limite;
    }
    
    public void lessLimiteJogos(Integer limite) {
        this.limiteJogosAlocados = this.limiteJogosAlocados - limite;
    }
    
    public boolean podeLocar(int qtdJogosLocados, int qtdJogosDesejada) {
        return (( qtdJogosDesejada + qtdJogosLocados) > this.limiteJogosAlocados); 
    }
    
}

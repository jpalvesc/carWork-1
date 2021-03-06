/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.util.ArrayList;

/**
 * @author Pedro Henrique Marcelino Matias
 * @date 03/05/2018
 */
public class Modelo {
    private int id_modelo;
    private String nome_modelo;
    private Marca marca;

    public int getId_modelo() {
        return id_modelo;
    }

    public void setId_modelo(int id_modelo) {
        this.id_modelo = id_modelo;
    }

    public String getNome_modelo() {
        return nome_modelo;
    }

    public void setNome_modelo(String nome_modelo) {
        this.nome_modelo = nome_modelo;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }
    public void inserir () throws Exception{
        ModeloDAO mDAO = new ModeloDAO();
        mDAO.inserir(this);
    }
    public void alterar () throws Exception{
        ModeloDAO mDAO = new ModeloDAO();
        mDAO.alterar(this);
    }
    public void excluir () throws Exception{
        ModeloDAO mDAO = new ModeloDAO();
        mDAO.excluir(this);
    }
    public Modelo carregaPorId () throws Exception{
        ModeloDAO mDAO = new ModeloDAO();
        return mDAO.carregaPorId(this);
    }
    public ArrayList<Modelo> listar () throws Exception{
        ModeloDAO mDAO = new ModeloDAO();
        return mDAO.listar();
    }
}

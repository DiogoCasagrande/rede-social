/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packet;

import java.util.ArrayList;

/**
 *
 * @author Home
 */
public class Rede {

    private ArrayList<Pessoa> redeList = new ArrayList();
    private int[][] matrizAdjacencia = new int[50][50];
    private int[] idList = new int[50];
    private int qtdPessoas;
    
    private ArrayList<No> listNos = new ArrayList<No>();

    public boolean inserir(Pessoa pessoa) {
        if (redeList.isEmpty()) {
            redeList.add(pessoa);
            matrizAdjacencia[1][0] = 1;
            pessoa.setId(1);
            redeList.add(pessoa);
            qtdPessoas++;
        } else {
            if (qtdPessoas < 50) {
                if (buscarPessoa(pessoa.getNome()) != null) {
                    for (int i = 0; i < idList.length; i++) {
                        if (idList[i] == 0) {
                            matrizAdjacencia[i][0] = 1;
                            pessoa.setId(i);
                            redeList.add(pessoa);
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public boolean remover(String nome) {
        if (redeList.isEmpty()) {
            return false;
        }
        matrizAdjacencia[buscarPessoa(nome).getId()][0] = 0;
        redeList.remove(buscarPessoa(nome));
        return true;
    }

    public void conectarPessoas(String nomeA, String nomeB) {

        No no = new No(buscarPessoa(nomeA),buscarPessoa(nomeB));
    }

    public void verificarAmigos() {
    }

    public void noDistancia() {
    }

    public void qtdUsuarios() {
    }

    public void listarConexoes() {
    }

    public int numeroVertices() {
        return matrizAdjacencia.length;
    }

    public Pessoa buscarPessoa(String nome) {

        for (int i = 0; i < redeList.size(); i++) {
            if (redeList.get(i).getNome().equals(nome)) {
                return redeList.get(i);
            }
        }
        return null;
    }
}

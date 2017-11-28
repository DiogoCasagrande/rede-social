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

    private ArrayList<Conexao> conexoes = new ArrayList<Conexao>();
    private int qtdArestas;

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

    public boolean conectarPessoas(String nomeA, String nomeB, int tempo) {
        Pessoa a = buscarPessoa(nomeA);
        Pessoa b = buscarPessoa(nomeB);
        if (a != null && b != null) {
            No no = new No(a, b);
            qtdArestas++;
            Conexao conect = new Conexao(no, tempo);
            conexoes.add(conect);
            matrizAdjacencia[b.getId()][a.getId()] = 1;
            matrizAdjacencia[a.getId()][b.getId()] = 1;
            return true;
        } else {
            return false;
        }
    }

    public String verificarAmigos(String nome) {
        return buscarPessoa(nome).listarAmigos();
    }

    public int noDistancia(String nomeA, String nomeB) {
        Pessoa a = buscarPessoa(nomeA);
        Pessoa b = buscarPessoa(nomeB);

        return a.buscarAmigo(b);
    }

    public int qtdUsuarios() {
        return qtdPessoas;
    }

    public int qtdArestas() {
        return qtdArestas;
    }

    public void listarConexoes() {
        for (int i = 0; i < conexoes.size(); i++) {
            System.out.print("Pessoa: " + conexoes.get(i).getPessoaAnt());

            System.out.print(" > conectada ");

            System.out.println("Pessoa: " + conexoes.get(i).getPessoaAnt());
        }
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

    public String listarUsuarios() {
        String saida = "";
        for (int i = 0; i < redeList.size(); i++) {
            saida += i + " - " + redeList.get(i).getNome() + "\n";
        }
        return saida;
    }

    public String listarMatriz() {
        String saida = "";
        for (int i = 0; i < 50; i++) {
            for (int j = 0; j < 50; j++) {
                saida += matrizAdjacencia[i][j]+ " ";
            }
            saida += "\n";
        }
        return saida;
    }
}

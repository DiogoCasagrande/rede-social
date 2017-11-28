/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packet;

/**
 *
 * @author Home
 */
public class Conexao {

    No no;
    private int tempo;
    private static int qtdConexoes;

    public Conexao(No no, int tempo) {
        this.no = no;
        this.tempo = tempo;
        no.getAnt().addAmigos(no.getProx());
        qtdConexoes++;
    }

    public int getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }

    public String getPessoaAnt() {

        return no.getAnt().getNome();
    }

    public String getPessoaProx() {
        return no.getProx().getNome();
    }

    static int getQtdConexoes() {
        return qtdConexoes;
    }

}

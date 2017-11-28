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
    
    public Conexao(Pessoa amigo, int tempo){
        qtdConexoes++;
    }

    public int getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }
    
    static int getQtdConexoes(){
        return qtdConexoes;
    }
}

package packet;

import java.util.ArrayList;

public class Pessoa {

    private int id;
    private String nome;
    private int idade;
    private ArrayList<Conexao> amigos;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        amigos = null;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}

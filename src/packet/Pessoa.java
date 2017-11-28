package packet;

import java.util.ArrayList;

public class Pessoa {

    private int id;
    private String nome;
    private int idade;
    private ArrayList<Pessoa> amigos = new ArrayList<Pessoa>();

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

    public void addAmigos(Pessoa amigos) {
        this.amigos.add(amigos);
    }

    public int buscarAmigo(Pessoa amigo) {
        int qtdNo= 0;
        for (int i = 0; i < amigos.size(); i++) {
            qtdNo++;
            if (amigos.get(i).getNome().equals(amigo.getNome())) {
                return qtdNo;
            }
        }
        return 0;
    }

    public String listarAmigos() {
        String saida = "";
        for (int i = 0; i < amigos.size(); i++) {
            saida += " " + amigos.get(i).getNome();
        }
        return saida;
    }
}

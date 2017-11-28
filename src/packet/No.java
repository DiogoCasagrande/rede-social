
package packet;

public class No {
    //anterior
    //proximo
    private Pessoa ant;
    private Pessoa prox;
    
    public No(Pessoa ant, Pessoa prox){
        this.ant = ant;
        this.prox = prox;
    }

    public Pessoa getAnt() {
        return ant;
    }

    public void setAnt(Pessoa ant) {
        this.ant = ant;
    }

    public Pessoa getProx() {
        return prox;
    }

    public void setProx(Pessoa prox) {
        this.prox = prox;
    }
}

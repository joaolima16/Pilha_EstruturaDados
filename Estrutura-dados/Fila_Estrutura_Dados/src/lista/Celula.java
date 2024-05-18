package lista;

public class Celula {
    
    private Celula ant, prox;
    private Object dados;

    public Celula(Celula ant, Celula prox, Object dados) {
        this.ant = ant;
        this.prox = prox;
        this.dados = dados;
    }

    public Celula getAnt() {
        return ant;
    }

    public void setAnt(Celula ant) {
        this.ant = ant;
    }

    public Celula getProx() {
        return prox;
    }

    public void setProx(Celula prox) {
        this.prox = prox;
    }

    public Object getDados() {
        return dados;
    }

    public void setDados(Object dados) {
        this.dados = dados;
    }
    
    
    
}

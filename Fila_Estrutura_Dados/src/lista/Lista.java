package lista;

/**
 *
 * @author kaio.ovenancio
 */
import modelo.Pessoa;

public class Lista {

    private Celula inicio, atual, aux;

    public boolean isListaVazia() {
        return inicio == null;
    }

    public void inserir(Object objeto) {

        if (isListaVazia()) {
            inicio = new Celula(null, null, objeto);
            aux = inicio;
        }

        else {
            atual = new Celula(aux, null, objeto);
            aux.setProx(atual);
            aux = atual;
        }
    }
    public Celula adicionarComeco(Object objeto){
        Celula celula = new Celula(inicio, atual, objeto);
        if(this.inicio == null && this.atual == null){
            this.inicio = celula;
            this.atual = celula;
           
        }
        else{
            celula.setProx(this.inicio);
            this.inicio = celula;
        }
        return celula; 
       
    }

    public Pessoa pesquisar(int id) {
        Pessoa p;
        Celula c = inicio;
        while (c != null) {
            p = (Pessoa) c.getDados();
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    public void atualizar(int id, int idade) {
        Celula c = inicio;
        while (c != null) {
            Pessoa p = (Pessoa) c.getDados();
            if (p.getId() == id) {
                p.setIdade(idade);
                c.setDados(p);
                break;
            }
            c = c.getProx();
        }
    }

    public void exibir() {

        Celula c = atual;

        while (c != null) {
            System.out.println(c.getDados());
            c = c.getAnt();
        }
    }

    public Celula pesquisar(int id, Celula p) {
        Pessoa pessoa;
        while (p != null) {
            pessoa = (Pessoa) p.getDados();
            if (id == pessoa.getId()) {
                return p;
            }
            p = p.getProx();
        }

        return null;
    }

    public boolean remover(int id) {
        Celula p = pesquisar(id, inicio);
        if (p != null) {
            if (p == inicio) {
                inicio = p.getProx();
                p.setProx(null);
                inicio.setAnt(null);
            } else if (p == atual) {
                atual = p.getAnt();
                aux = atual;
                atual.setProx(null);
                p.setAnt(null);
            } else {
                p.getAnt().setProx(p.getProx());
                p.getProx().setAnt(p.getAnt());
                p.setAnt(null);
                p.setProx(null);
            }

            return true;
        }

        return false;
    }

    public Celula getInicio() {
        return inicio;
    }

    public void setInicio(Celula inicio) {
        this.inicio = inicio;
    }

    public Celula getAtual() {
        return atual;
    }

    public void setAtual(Celula atual) {
        this.atual = atual;
    }

    public Celula getAux() {
        return aux;
    }

    public void setAux(Celula aux) {
        this.aux = aux;
    }

}

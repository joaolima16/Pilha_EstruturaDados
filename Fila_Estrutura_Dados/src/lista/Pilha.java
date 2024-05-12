package lista;

import modelo.Pessoa;

public class Pilha {
    private Lista lista;
    private Celula top;
    private int cont = 1;

    public Pilha() {
        this.lista = new Lista();
    }

    public void push(Object object) {
        Celula c = this.lista.adicionarComeco(object);
        this.top = c;
        this.cont++;

    }

    public void pop() {
        this.lista.remover(this.get());
        this.cont--;
    }

    public int get() {
        Pessoa id = (Pessoa) this.lista.getInicio().getDados();
        return id.getId();
    }

    public void show() {
        Celula c = this.lista.getInicio();

        while (c != null) {
            System.out.println(c.getDados());
            c = c.getProx();
        }
    }

    public void top() {
        System.out.println("Ultimo elemento: " + this.top.getDados());
    }
    public void size(){
        System.out.println("Tamanho da lista: " + cont);
    }
}

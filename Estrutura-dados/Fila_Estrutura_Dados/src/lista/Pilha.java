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
        Celula c = this.lista.adicionarPilha(object);
        this.top = c;
        this.cont++;

    }

    public void pop() {
       if(top.getAnt() == null){
        top = null;
       }
       else{
            Celula c = top;
            c = c.getAnt();
            c.setProx(null);
            top = c;
       }

    }


    public void show() {
        Celula c = top;

        while (c != null) {
            System.out.println(c.getDados());
            c = c.getAnt();
        }
    }

    public void top() {
        System.out.println("Ultimo elemento: " + this.top.getDados());
    }
    public void size(){
        System.out.println("Tamanho da lista: " + cont);
    }
}

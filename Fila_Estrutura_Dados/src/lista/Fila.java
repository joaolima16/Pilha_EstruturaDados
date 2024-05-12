package lista;

import modelo.Pessoa;

public class Fila {
    private Celula inicio, atual, aux;

    public boolean empty() {
        return this.inicio == null ? true : false;
    }



    public void enqueue(Object object) {

        if (empty()) {
            inicio = new Celula(null, null, object);
            aux = inicio;
        }

        else {
            atual = new Celula(aux, null, object);
            aux.setProx(atual);
            aux = atual;
        }
    }

    public void show() {
        Celula c = inicio;

        while (c != null) {
            System.out.println(c.getDados());
            c = c.getProx();
        }
    }

    public void dequeue() {
        Celula p = inicio;
        if (empty() != true) {
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

        }
    }

    public int size() {
        int cont = 0;
        Celula c = inicio;
        while (c != null) {
            c = c.getProx();
            cont++;
        }
        return cont;
    }
    public void front(){
        System.out.println(this.inicio.getDados());
    }

}

package cliente;

import lista.Fila;
import lista.Lista;
import modelo.Pessoa;

public class UsaFila {
    public static void main(String[] args) {
        Fila fila = new Fila();
        fila.enqueue(new Pessoa ("Kaio", 19));
        fila.enqueue(new Pessoa ("Dani", 20));
        fila.enqueue(new Pessoa ("José", 50));
        fila.enqueue(new Pessoa ("Maria", 60));
        // fila.show();
        fila.dequeue();
        fila.dequeue();
        fila.show();
        System.out.println(fila.size());
        fila.front();
    }
       
   
}

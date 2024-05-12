package cliente;

import java.util.Scanner;

import lista.Pilha;
import modelo.Pessoa;

public class UsaPilha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pilha pilha = new Pilha();

        pilha.push(new Pessoa("Joao", 15));
        pilha.push(new Pessoa("Teste", 1313));
        pilha.push(new Pessoa("Robertin", 3131));

        System.out.println("Menu de opções");
        System.out.println("1 - Inserir");
        System.out.println("2 - Remover");
        System.out.println("3 - Mostrar dados");
        System.out.println("4 - Tamanho da lista");
        System.out.println("5 - Ver ultimo elemento");
        while(true){
            int escolha = sc.nextInt();
        
            switch(escolha){
                case 1:
                    pilha.push(new Pessoa("Teste2", 2323));
                    System.out.println("Valor adicionado");
                    break;
                case 2:
                    System.out.println("Valor removido");
                    pilha.show();
                    break;
                case 3:
                    pilha.show();
                    break;
                case 4:
                    pilha.size();
                    break;
                case 5:
                    pilha.top();
                    break;
            }
    
        }

    }   
}

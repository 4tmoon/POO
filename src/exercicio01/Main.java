package exercicio01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        Jogador jogador = new Jogador();

        //entrada de dados
        System.out.println("Informe seu nome: ");
        jogador.nome = x.nextLine();

        for (int i = 0; i < jogador.score.length; i++) {
            System.out.println("Score: " + (i+1));
            jogador.score[i] = x.nextInt();
        }

        //saida de dados
        System.out.println("\nNome: " + jogador.nome);
        System.out.println("Score total: " + jogador.calcularScore());
    }




}

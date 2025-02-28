package exercicio03;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner x = new Scanner(System.in);

        Ponto p1 = new Ponto();
        Ponto p2 = new Ponto();

        //entrada de dados
        System.out.println("Informe as coordenadas do ponto 1: ");
        p1.x = x.nextInt();
        p1.y = x.nextInt();

        System.out.println("Informe as coordenadas do ponto 2: ");
        p2.x = x.nextInt();
        p2.y = x.nextInt();

        //impressão da distância entre os dois pontos
        System.out.println("Distancia do p1 para o p2: " + df.format(p1.calcularDistancia(p2)));
        System.out.println("Distancia do p2 para o p1: " + df.format(p2.calcularDistancia(p1)));

        //impressão da distância de cada ponto até a origem
        System.out.println("\nDistancia do p1 até a origem: " + df.format(p1.calcularDistanciaOrigem()));
        System.out.println("Distancia do p2 até a origem: " + df.format(p2.calcularDistanciaOrigem()));

        // impressão do ponto mais próximo da origem
        Ponto aux = p1.maisProximoDaOrigem(p1, p2);
        System.out.println("\nPonto mais próximo: " + aux.formatarPonto());
    }
}

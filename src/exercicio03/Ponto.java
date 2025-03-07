package exercicio03;

public class Ponto {
    // variáveis de instância/atributos
    int x;
    int y;

    // método para calcular e retornar a distância entre dois pontos
    public double calcularDistancia(Ponto p){
        double d = 0;
        d = Math.sqrt(Math.pow(p.x - x,2) + Math.pow(p.y - y,2));
        return d;
    }

    //método para calcular e retornar a distância de um ponto até a origem
    public double calcularDistanciaOrigem(){
        Ponto origem = new Ponto();
        return calcularDistancia(origem);
    }

    //método para retornar o ponto mais próximo da origem
    public static Ponto maisProximoDaOrigem(Ponto p1, Ponto p2){
        double dp1 = p1.calcularDistanciaOrigem();
        double dp2 = p2.calcularDistanciaOrigem();

        if (dp1 < dp2) {
            return p1;
        }
        return p2;
    }

    //método para retornar os dados do objeto formatado
    public String formatarPonto(){
        return "(" + x + ", " + y + ")";
    }

}

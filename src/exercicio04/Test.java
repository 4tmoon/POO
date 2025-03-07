package exercicio04;

public class Test {
    public static void main(String[] args) {
        Funcionario[] funcionarios = new Funcionario[3];

        //instanciando 3 objetos do tipo funcionários
        funcionarios[0] = new Funcionario("Patricia", "Professora", 32000);
        funcionarios[1] = new Funcionario("Age", "Coordenador", 65000);
        funcionarios[2] = new Funcionario("Belizário", "Professor", 25000);

        //dados armazenados do vetor
        for (int i = 0; i < funcionarios.length; i++) {
            System.out.println(funcionarios[i].getDados());
        }

        //aplicando 10% de aumento em cada salário
        for (int i = 0; i < funcionarios.length; i++) {
            funcionarios[i].aumentarSalario(10);
        }

        System.out.println();

        //impressão dos salários atualizados
        for(Funcionario f : funcionarios){
            System.out.println(f.getDados());
        }
    }
}

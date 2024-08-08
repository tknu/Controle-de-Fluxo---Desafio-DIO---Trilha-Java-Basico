import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        System.out.println("Contador");
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro:");
        int parametroUm = sc.nextInt();
        System.out.println("Digite o segundo parâmetro:");
        int parametroDois = sc.nextInt();

        try {
            imprimirContagem(parametroUm, parametroDois);
        }
        catch (ParametrosInvalidosException e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }

    public static void imprimirContagem (int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // Validar se o primeiro parametro é maior que o segundo
        if( parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }
        // Calcular o número de intereções
        int numInteracoes = parametroDois - parametroUm;

        //imprimir os números
        for (int i = 0; i <= numInteracoes; i++) {
            System.out.println("Imprimindo o número " + (parametroUm + i));
        }
    }

}

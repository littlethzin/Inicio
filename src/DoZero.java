import java.util.Scanner;


public class DoZero {
    static void main(String[] args) {
        System.out.println("===============");
        System.out.println("Seja bem vindo");
        System.out.println("Me diga o Valor do Produto");

        Scanner scanner = new Scanner(System.in);
        double CalculoNovo = scanner.nextDouble();

        System.out.println("o Valor é de "
        + CalculoNovo + " R$");

        System.out.println("Digite a quantidade de vezes que voce deseja parcelar");

        double parcelasCartao = scanner.nextDouble();


        System.out.println("O produto vai ser dividido em "
        + parcelasCartao + " vezes");

        double valorParcela = CalculoNovo / parcelasCartao;

        System.out.println("O valor de cada parcela ficará "
        + "R$" + valorParcela);

        scanner.close();

        System.out.println("Esse é o valor das parcelas, deseja realizar a compra?");
        System.out.println("Obrigado");


    }
}

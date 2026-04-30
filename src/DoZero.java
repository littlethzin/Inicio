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

        int[] DescontosP = {250, 350, 400, 500};

        double N = 3000;
        double S = 5000;

       boolean bool = false;
       if (N > 2999) {
           System.out.println("Voce acabou de ganhar um desconto, parabens." +
                   "O seu desconto foi de " + DescontosP[2]);

           else if ( S > 5001) {
               System.out.println("Voce acabou de ganhar um desconto de " + DescontosP[3]);
           }

       }  else {
        System.out.println("Não há desconto disponivel para este valor");}

       double valorCDesconto = CalculoNovo - DescontosP[3];

        System.out.println("O valor do produto com Desconto é de " + valorCDesconto);
        System.out.println("Digite a quantidade de vezes que voce deseja parcelar");

        double parcelasCartao = scanner.nextDouble();


        System.out.println("O produto vai ser dividido em "
        + parcelasCartao + " vezes");


        double valorParcela = valorCDesconto / parcelasCartao;

        System.out.println("O valor de cada parcela ficará "
        + "R$" + valorParcela);

        scanner.close();

        System.out.println("Esse é o valor das parcelas, deseja realizar a compra?");
        System.out.println("Obrigado");


    }
}

public class DoZero {
    static void main() {
        System.out.println("===============");
        System.out.println("Seja bem vindo");
        System.out.println("iremos te mostrar como calcular as parcelas");

        int CalculoNovo = 12000;

        System.out.println("o Valor é de "
        + CalculoNovo + " R$");

        int parcelasCartao = 15;

        System.out.println("O numero de Parcelas é de "
        + parcelasCartao + " vezes");

        int valorParcela = CalculoNovo / parcelasCartao;

        System.out.println("O valor de cada parcela é de "
        + "R$" + valorParcela);

        System.out.println("Esse é o valor das parcelas, deseja realizar a compra?");
        System.out.println("Obrigado");
    }
}

import java.util.Scanner;

public class DoZero {
    static void main(String[] args) {
        //lembrar de ativar a String e args ja que eu uso da abreviação psvm
        System.out.println("===============");
        System.out.println("Seja bem vindo");
        System.out.println("Me diga o Valor do Produto");

        Scanner scanner = new Scanner(System.in);
        double calculoNovo = scanner.nextDouble();

        //denominei a variavel double (numeros decimais)

        System.out.println("o Valor é de "
                + calculoNovo + " R$");

        int[] DescontosP = {0, 250, 350, 400, 500};

        //determinei valores para descontos fixos


        if (calculoNovo > 10000) {
            System.out.println("Voce acabou de ganhar um desconto, parabens. " +
                    " O seu desconto foi de " + DescontosP[1]);
            double valorCDesconto = calculoNovo - DescontosP[1];

        }    //aprendi a melhorar a logica do meu codigo apenas observando o meu codigo
        //consegui deixar bem mais pratico

        else if (calculoNovo > 4500) {
            System.out.println("Voce acabou de ganhar um desconto de " + DescontosP[3]);
            double valorCDesconto1 = calculoNovo - DescontosP[3];
        } else {
            System.out.println("Não há desconto disponivel para este valor");
            double valorCDesconto = calculoNovo - DescontosP[0];
        }
            //estou tentando entender como posso conseguir rodar o codigo sem ter que declarar a variavel valorCDesconto
            //mas o progresso esta sendo feito

        double valorCDesconto = calculoNovo - DescontosP[1];
            //ainda nao sei como declarar descontos de formas aleatorias, imagino que tenha que declarar de forma
            //especifica em cada valor com if, else e else if.

            System.out.println("O valor do produto com Desconto é de " + valorCDesconto);
            System.out.println("Digite a quantidade de vezes que voce deseja parcelar");

            double parcelasCartao = scanner.nextDouble();
            scanner.nextLine();

            System.out.println("O produto vai ser dividido em "
                    + parcelasCartao + " vezes");


            double valorParcela = valorCDesconto / parcelasCartao;

            System.out.println("O valor de cada parcela ficará "
                    + "R$" + valorParcela);


            System.out.println("Esse é o valor das parcelas, deseja realizar a compra?");

            String word = scanner.nextLine();


            boolean palavra = word.equalsIgnoreCase ("Sim");


            if (palavra) {
                System.out.println("Insira o seu metodo para pagemtento ");
                compraRealizada compra = new compraRealizada();
                System.out.println(" Agradecemos por comprar conosco.");


            } else {

                System.out.println("Obrigado por entrar em contato conosco, desejamos que voce consgiga comprar o que voce deseja"
                );
                compraNRealizada nCompra = new compraNRealizada();

            }

            scanner.close();





        }
    }


    class compraRealizada {
        public compraRealizada() {
            System.out.println("  compra realizada  ");
        }
    }

class compraNRealizada {
    public void CompraNRealizada() {
        System.out.println("  Compra nao realizada" +
                "Agradecemos pelo contato conosco +" +
                "Sempre que precisar, estaremos aqui");
    }
}
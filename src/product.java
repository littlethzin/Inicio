import java.util.Scanner;

public class product {
    String produto;
    String marca;
    Double valor;
    int quantidade;

public product(String produto, String marca, double valor, int quantidade) {
this.produto = produto;
this.marca = marca;
this.valor = valor;
this.quantidade = quantidade;
}
/* criando um construtor para indicar parametros e criar uma estrutura de produtos
sempre que eu for criar um construtor, preciso antes definir o que ele é, antes de
chamar ele no construtor
 */

    public void modelooo() {
        Scanner scanner = new Scanner(System.in);
        produto = scanner.nextLine();
        marca = scanner.nextLine();
        valor = scanner.nextDouble();
        quantidade = scanner.nextInt();
        /*tive progresso no pensamento de como puxar os modelos atraves do Scanner, mas ainda
        estou pensando em como fazer, mas ja esta bem melhor, amanha preciso tentar em como eu posso
        fazer isso e ainda fazer com que o codigo guarde o valor sem  precisar de um banco de dadoss
         */

        System.out.println("Produto " + produto);
        System.out.println("Marca " + marca);
        System.out.println("Valor " + valor);
        System.out.println("Quantidade " + quantidade + " unidades");


    }
}



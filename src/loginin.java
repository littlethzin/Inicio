import java.util.Scanner;

public class loginin {
    static void main(String[] args) {



    }
    public void loginlouco(){
        System.out.println("Inicializando aba de cliente...");
        System.out.println("Aguarde, por favor");
        product product1 = new product("Geladeira", "LG", 1999.00, 35);
        product product2 = new product("Geladeira", "Samsung", 3444.95, 23);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o modelo que deseja registrar");
        String product3 = scanner.next();
        System.out.println(" voce registrou " + product3);

        /* pensando em como puxar os metodos da outra classe com scanner, para que o admin salve e
        crie novos produtos sem que tenha que mexer no codigo para fazer essa adição
         */

    }
}

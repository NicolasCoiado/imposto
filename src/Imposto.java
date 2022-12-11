import java.util.Scanner;
public class Imposto {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escreva o valor do produto: ");
        double custo = sc.nextDouble();
        System.out.print("Escreva abaixo o valor da taxa de imposto: ");
        double imposto = sc.nextDouble();
        taxar (custo, imposto);
        sc.close();
    }
    public static void taxar(double custo, double imposto) {

        double conta;
        conta = (0.01 * imposto) * custo + custo;
        System.out.print("O valor final é de: R$ " + conta);

    }
}
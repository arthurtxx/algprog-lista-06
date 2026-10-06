import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double[] numeros = new double[10];
        int posicao = 0;

        while (posicao < 10) {
            System.out.println("Digite algum numero ai: ");
            numeros[posicao] = teclado.nextDouble();
            posicao = posicao + 1;
        }

        System.out.println("Os numeros digitados na ordem inversa são:");
        posicao = 9;
        while (posicao >= 0) {
            System.out.print(numeros[posicao] + ", ");
            posicao = posicao - 1;
        }

        teclado.close();
    }
}
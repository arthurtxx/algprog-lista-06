import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] vetor = new int[5];
    int contador = 0;

    while (contador < 5 ) {
        System.out.println("Digite algum numero");
        vetor[contador] = sc.nextInt();
        contador = contador + 1;

    }
    contador = 0;
    while (contador < 5 ) {
        System.out.print(vetor[contador] + ", ");
        contador = contador + 1;
    }

    System.out.print("Os numeros digitados são:");
    contador = 0;
    
    
    sc.close();
    }
}

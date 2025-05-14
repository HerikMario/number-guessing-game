import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);

        int numeroAleatorio = rand.nextInt(100) + 1; // 1 a 100
        int chute;
        int diferenca;
        boolean continuar = true;
        int tentativas = 1;

        System.out.println("========================");
        System.out.println("Number Guessing Game");
        System.out.println("========================");

        System.out.println(numeroAleatorio);

        while (continuar) {
            System.out.print("Adivinhe o número entre 1-100 ou digite 0 para sair: ");
            chute = scan.nextInt();

            if (chute == 0) {
                System.out.println("Saindo do programa...");
                break;
            }

            if (chute < 1 || chute > 100) {
                System.out.println("Coloque um número válido (entre 1 e 100).");
                continue;
            }

            if (chute == numeroAleatorio && tentativas > 1) {
                System.out.println("Parabéns, você acertou em " + tentativas + " tentativas!");
                break;
            }

            if (chute == numeroAleatorio && tentativas == 1) {
                System.out.println("Parabéns, você acertou de PRIMEIRA!!!");
                break;
            }

            diferenca = numeroAleatorio - chute;

            if (diferenca > 0) { // chute baixo
                if (diferenca <= 5) {
                    System.out.println("Passou perto, mas ainda está baixo");
                } else if (diferenca <= 10) {
                    System.out.println("Ainda está razoavelmente baixo");
                } else if (diferenca <= 15) {
                    System.out.println("Ainda está bem baixo");
                } else {
                    System.out.println("Ainda está muito baixo");
                }
            } else { // chute alto
                if (diferenca >= -5) {
                    System.out.println("Passou perto, mas ainda está alto");
                } else if (diferenca >= -10) {
                    System.out.println("Ainda está razoavelmente alto");
                } else if (diferenca >= -15) {
                    System.out.println("Ainda está bem alto");
                } else {
                    System.out.println("Ainda está muito alto");
                }
            }
            tentativas++;
        }

        scan.close();
    }
}

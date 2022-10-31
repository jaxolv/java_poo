import java.util.Scanner;

public class Exercicio_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe a senha correta: ");
        int senha = sc.nextInt();
        while (senha != 2002) {
            System.out.print("Senha inválida. Tente novamente: ");
            senha = sc.nextInt();
        }
        System.out.println("Acesso permitido.");

        sc.close();
    }
}

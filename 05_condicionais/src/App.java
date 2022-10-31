import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // 1º exercício
        /* int numero;
        System.out.print("Informe qualquer número inteiro: ");
        numero = sc.nextInt();
        if (numero < 0) {
            System.out.println("NEGATIVO");
        } else {
            System.out.println("NÃO NEGATIVO");
        } */
        
        // 2º exercício
        /* int numero, mod;
        System.out.print("Informe qualquer número inteiro: ");
        numero = sc.nextInt();
        mod = Math.abs(numero % 2);
        // talvez teria sido mais inteligente usar if (mod == 0) { "PAR" }, mas assim pelo menos descobri um erro que pode ser convencional e até comum.
        if (mod == 1) {
            System.out.println("ÍMPAR");
        } else {
            System.out.println("PAR");
        } */
        
        // 3º exercício
        /* int n1, n2, divisor, dividendo, mod;
        System.out.print("Informe qualquer número inteiro: ");
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        if (n1 > n2) {
            dividendo = n1;
            divisor = n2;
        } else {
            divisor = n1;
            dividendo = n2;
        }
        mod = dividendo % divisor;
        if (mod == 0) {
            System.out.println("São múltiplos");
        } else {
            System.out.println("Não são múltiplos");
        } */
        
        // 4º exercício
        /* int inicio, fim, diferenca;
        System.out.print("Informe a hora de início e do final de um jogo: ");
        inicio = sc.nextInt();
        fim = sc.nextInt();
        diferenca = fim + (24 - inicio);
        if (diferenca > 24) {
            diferenca = diferenca - 24;
        } else {
            diferenca = Math.abs(diferenca);
        }
        // Não sei muito bem como funcionou, mas funcionou e é o que importa.
        System.out.printf("O JOGO DUROU %d HORA(S).", diferenca); */

        // 5º exercício
        /* int codigo, quantidade;
        double total;
        System.out.println("CÓDIGO     ESPECIFICAÇÃO       PREÇO  ");
        System.out.println("1          Cachorro Quente     R$ 4,00");
        System.out.println("2          X-Salada            R$ 4,50");
        System.out.println("3          X-Bacon             R$ 5,00");
        System.out.println("4          Torrada Simples     R$ 2,00");
        System.out.println("5          Refrigerante        R$ 1,50");
        System.out.print("Identifique um item da lista acima pelo código juntamente com a quantidade a ser consumida, respectivamente: ");
        codigo = sc.nextInt();
        quantidade = sc.nextInt();
        if (codigo == 1) {
            total = quantidade * 4.0;
            System.out.printf("Total: R$ %.2f%n", total);
            sc.close();
        } else if (codigo == 2) {
            total = quantidade * 4.5;
            System.out.printf("Total: R$ %.2f%n", total);
            sc.close();
        } else if (codigo == 3) {
            total = quantidade * 5.0;
            System.out.printf("Total: R$ %.2f%n", total);
            sc.close();
        } else if (codigo == 4) {
            total = quantidade * 2.0;
            System.out.printf("Total: R$ %.2f%n", total);
            sc.close();
        } else if (codigo == 5) {
            total = quantidade * 1.5;
            System.out.printf("Total: R$ %.2f%n", total);
            sc.close();
        } else {
            System.out.println("NENHUM ITEM FOI INFORMADO CORRETAMENTE. FECHANDO O PROGRAMA.");
            sc.close();
        } */

        // 6º exercício
        /* double valor;
        System.out.print("Informe qualquer valor fracionado entre 0 e 100: ");
        valor = sc.nextDouble();
        if (valor > 0 && valor < 25) {
            System.out.println("Intervalo [0,25]");
        } else if (valor > 25 && valor < 50) {
            System.out.println("Intervalo (25,50]");
        } else if (valor > 50 && valor < 75) {
            System.out.println("Intervalo (50,75]");
        } else if (valor > 75 && valor < 100) {
            System.out.println("Intervalo (75,100]");
        } else {
            System.out.println("Fora de intervalo.");
        } */
        
        // 7º exercício
        /* double x, y;
        System.out.print("Informe dois valores, para X e Y, respectivamente, e determine em qual quadrante está o ponto: ");
        x = sc.nextDouble();
        y = sc.nextDouble();
        if (x > 0 && y > 0) {
            System.out.println("Q1");
        } else if (x < 0 && y > 0) {
            System.out.println("Q2");
        } else if (x < 0 && y < 0) {
            System.out.println("Q3");
        } else if (x > 0 && y < 0) {
            System.out.println("Q4");
        } else if (x == 0 && Math.abs(y) > 0) {
            System.out.println("Eixo Y");
            // nesse caso, achei mais prático deixar dessa forma pois qualquer valor diferente de zero em Y será sempre positivo e estará sobre o eixo Y. Eu poderia também usar dessa forma:
            // if ((x == 0 && y > 0) || (x == 0 && y < 0)) { "Eixo Y" }
        } else if (y == 0 && Math.abs(x) > 0) {
            System.out.println("Eixo X");
        } else {
            System.out.println("Origem");
        } */

        // 8º exercício
        /* double salario, imposto;
        System.out.print("Informe seu salário para calcular o imposto a ser pago: ");
        salario = sc.nextDouble();
        if (salario > 0.0 && salario <= 2000.0) {
            imposto = 0.0;
        } else if (salario > 2000.0 && salario <= 3000.0) {
            imposto = (salario - 2000.0) * (8.0 / 100);
        } else if (salario > 3000.0 && salario <= 4500.0) {
            imposto = (salario - 3000.0) * (18.0 / 100) + (8.0 /100) * 1000.0;
        } else {
            imposto = (salario - 4500.0) * (28.0 / 100) + (8.0 /100) * 1000.0 + (18.0 / 100) * 1500.0;
        };

        if (imposto == 0.0) {
            System.out.println("Isento");
        } else {
            System.out.printf("R$ %.2f%n", imposto);
        } */

        /* int x;
        String dia;
        System.out.println("Informe o dia da semana: ");
        x = sc.nextInt();
        switch (x) {
            case 1:
                dia = "domingo";
                break;
            case 2:
                dia = "segunda";
                break;
            case 3:
                dia = "terça";
                break;
            case 4:
                dia = "quarta";
                break;
            case 5:
                dia = "quinta";
                break;
            case 6:
                dia = "sexta";
                break;
            case 7:
                dia = "sábado";
                break;
            default:
                dia = "Valor inválido";
                break;
        }

        System.out.println(dia); */

        double valor, desconto;
        System.out.print("Informe o valor da peça a ser comprada: ");
        valor = sc.nextInt();
        desconto = valor >= 200 ? valor * 0.2 : valor * 0.05;
        System.out.printf("O desconto da peça será de R$ %.2f%n", desconto);

        sc.close();
    }
}

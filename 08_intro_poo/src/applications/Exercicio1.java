package applications;

import java.util.Locale;
import java.util.Scanner;
import entities.Rectangle;

/*
    * Fazer um programa para ler os valores da altura e largura de um retângulo. Em seguida, mostrar na tela o valor de sua área, perímetro e diagonal. Usar uma classe como mostrado no projeto abaixo:
    * PROJETO DE CLASSE (UML)
    *                   _______________________________________
    *                  |                                       |
    * NOME DA CLASSE:  |   RECTANGLE                           |
    *                  |_______________________________________|
    *                  |                                       |
    * ATRIBUTOS        | - Width: double                       |
    *                  | - Heigth: double                      |
    *                  |_______________________________________|
    *                  |                                       |
    *                  | + Area(): double                      |
    * MÉTODOS:         | + Perimeter(): double                 |
    *                  | + Diagonal(): double                  |
    *                  |_______________________________________|
    * 
    * EXEMPLO *************************
    * Enter rectangle width and weigth:
    *  3.00
    *  4.00
    * AREA = 12.00
    * PERIMETER = 14.00
    * DIAGONAL = 5.00
*/

public class Exercicio1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter rectangle width and weigth: ");
        Rectangle rectangle = new Rectangle();

        rectangle.width = sc.nextDouble();
        rectangle.heigth = sc.nextDouble();

        System.out.println(rectangle.toString(rectangle.area(), rectangle.perimeter(), rectangle.diagonal()));

        sc.close();
    }
}

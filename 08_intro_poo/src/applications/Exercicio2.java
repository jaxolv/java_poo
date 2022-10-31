package applications;

import java.util.Locale;
import java.util.Scanner;
import entities.Employee;

/*
    * Fazer um programa para ler os dados de um funcionário (nome, salário bruto e imposto). Em seguida, mostrar os dados do funcionário (nome e salário líquido). Em seguida, aumentar o salário do funcionário com base em uma porcentagem dada (somente o salário bruto é afetado pela porcentagem) e mostrar novamente os dados do funcionário. Use a classe projetada abaixo:
    * PROJETO DE CLASSE (UML)
    *                   _______________________________________
    *                  |                                       |
    * NOME DA CLASSE:  |   EMPLOYEE                            |
    *                  |_______________________________________|
    *                  |                                       |
    *                  | - Name: string                        |
    * ATRIBUTOS        | - GrossSalary: double                 |
    *                  | - Tax: double                         |
    *                  |_______________________________________|
    *                  |                                       |
    * MÉTODOS:         | + NetSalary(): double                 |
    *                  | + IncreaseSalary(perc.: double): void |
    *                  |_______________________________________|
    * 
    * EXEMPLO *************************
    * Name: João Silva
    * Gross Salary: 6000.00
    * Tax: 1000.00

    * Employee: João Silva, $ 5000.00

    * Wich percentage to increase salary? 10.0

    * Employee: João Silva, $ 5600.00
*/

public class Exercicio2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee employee = new Employee();

        System.out.print("Name: ");
        employee.name = sc.nextLine();
        System.out.print("Gross Salary: ");
        employee.grossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        employee.tax = sc.nextDouble();
        
        System.out.println(employee.toString());
        
        System.out.print("Wich percentage to increase salary? ");
        employee.increaseSalary(sc.nextDouble());

        System.out.println(employee.toString());

        sc.close();
    }
}

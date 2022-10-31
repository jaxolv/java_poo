package entities;

public class Triangle {
    public double a;
    public double b;
    public double c;

    public double area() {
        double p = (a + b + c) / 2.0;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}

/*
 *  PROJETO DE CLASSE (UML)
 *                      ________________
 *                     |                |
 * NOME DA CLASSE:     |    Triangle    |
 *                     |________________|
 *                     |                |
 *                     | - A: double    |
 * ATRIBUTOS:          | - B: double    |
 *                     | - C: double    |
 *                     |________________|
 *                     |                |
 * MÉTODOS:            |+ Area(): double|
 *                     |________________|
 */
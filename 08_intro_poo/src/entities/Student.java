package entities;

public class Student {
    public double first;
    public double second;
    public double third;

    public double note() {
        return first + second + third;
    }

    public String status() {
        return (this.note() >= 60) ? "PASS" : "FAILED";
    }

    public double missing() {
        return 60 - this.note();
    }

    public String toString() {
        return (this.note() >= 60) ?
        "\nFINAL GRADE = " + String.format("%.2f", this.note()) + "\n" + this.status() + "\n":
        "\nFINAL GRADE = " + this.note() + "\n" + this.status() + "\nMISSING " + String.format("%.2f", this.missing()) + " POINTS\n";
    }
}

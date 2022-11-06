import java.util.Scanner;

public class NovoCalculo {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        Scanner ler = new Scanner (System.in);

        System.out.println("Introduza o primeiro numero: ");
        double num1 = ler.nextDouble();

        System.out.println("Introduza o segundo numero: ");
        double num2 = ler.nextDouble();

        System.out.println("Introduza o terceiro numero: ");
        double num3 = ler.nextDouble();

        System.out.println("Sum = " + calculator.sum(num1, num2, num3));
        System.out.println("Multiply = " + calculator.multiply(num1, num2, num3));
    }
}

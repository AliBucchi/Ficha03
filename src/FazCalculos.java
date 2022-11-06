public class FazCalculos {

    public static void main(String[] args){

        Calculator calculator = new Calculator();

        System.out.println("Sum = " + calculator.sum(5.2, 2.7, 4.9));
        System.out.println("Minus = " + calculator.minus(5.2, 2.7, 4.9));
        System.out.println("Multiply = " + calculator.multiply(5.2, 2.7, 4.9));
        System.out.println("Divide = " + calculator.divide(5.2, 2.7, 4.9));
    }
}

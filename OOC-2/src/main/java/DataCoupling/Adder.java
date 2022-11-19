package DataCoupling;

public class Adder {
    public void add(int numberA, int numberB, int numberC, boolean allNumbersSet) {
        int result = (numberA+numberB+numberC);
        System.out.println("Number A+B+C: " + result);

        System.out.println("All numbers set? " + allNumbersSet);
    }
}

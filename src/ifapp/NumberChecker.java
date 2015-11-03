/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifapp;

/**
 *
 * @author Lauchlan
 */
public class NumberChecker {

    public static String checkNumber(int number) {
        if ((number % 3) == 0) {
            return "Fizz";
        } else if ((number % 5) == 0) {
            return "FUZZ";
        }
        return "nothing";
    }

    public static void multiplyTable(int start, int end, int coefficient) {
        for (int i = start; i < end; i++) {
            System.out.println(i + ")" + i * coefficient);

        }

    }

    public static void divisionTable(int start, int end, double divisor) {
        for (int i = start; i < end; i++) {
            System.out.println(i + " / " + divisor + " = " + i / divisor);

        }
    }

}

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
public class Ifapp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        fizzTest();
//        testTable();
//        divisionTable();
//        testTriangle();
        testRectangle();
        testRectangle2();
        
    }

    private static void fizzTest() {
//        System.out.println(NumberChecker.checkNumber(5));
//        System.out.println(NumberChecker.checkNumber(15));
//        System.out.println(NumberChecker.checkNumber(30));
//        
        for (int i = 5; i <= 25; i++) {
            System.out.println(i + ")" + NumberChecker.checkNumber(i));
        }
    }

    private static void testTable() {
        NumberChecker.multiplyTable(25, 28, 2);

    }

    private static void divisionTable() {
        NumberChecker.divisionTable(20, 22, 5.0);
    }

    private static void testTriangle() {
        ShapePrinter.printTriangle(6);
        ShapePrinter.printTriangle(9);
        ShapePrinter.printTriangle(17);

    }

    private static void testRectangle() {
        ShapePrinter.printRectangle(3, 4);
        ShapePrinter.printRectangle(5, 6);
        ShapePrinter.printRectangle(7, 8);
        ShapePrinter.printSquare(3);
        ShapePrinter.printRectangle(7, 5);
    }

    private static void testRectangle2() {
        ShapePrinter.printRectangle(7, 5, "-");
    }
    
}

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
public class ShapePrinter {

    public static void printTriangle(int size) {
        for (int line = 1; line <= size; line++) {

            for (int i = 0; i < line; i++) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }

    public static void printRectangle(int width, int height) {
        printRectangle(width, height, "(͡° ͜ʖ ͡°)");
//        for (int line = 1; line <= height; line++) {
//
//            for (int i = 0; i < width; i++) {
//                System.out.print("#");
//
//            }
//            System.out.println("");
//        }
    }

    public static void printSquare(int side) {
        ShapePrinter.printRectangle(side, side);
    }

    public static void printRectangle(int width, int height, String character) {
        for (int line = 1; line <= width; line++) {
            for (int i = 0; i < width; i++) {
                System.out.print(character);
            }
            System.out.println("");
        }

    }

}

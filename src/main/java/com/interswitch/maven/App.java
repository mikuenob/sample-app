package com.interswitch.maven;

import javax.swing.plaf.synth.SynthLookAndFeel;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input 2 space separated numbers to add: ");
        Double num1 = scanner.nextDouble();
        Double num2 = scanner.nextDouble();
        scanner.nextLine();
        System.out.println(Calculator.add(num1, num2));
    }
}

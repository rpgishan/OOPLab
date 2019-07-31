
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Gishan-mac
 */
public class Q3 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number : ");
        double no = s.nextDouble();
        if (no > 0) {
            System.out.println( "The number is positive" );
        } else if (no < 0) {
            System.out.println( "The number is negative" );
        } else {
            System.out.println( "The number is equal to zero" );
        }
    }
}

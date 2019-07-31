
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
public class Q1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number : ");
        double no = s.nextDouble();
        if (no % 2 == 0) {
            System.out.println(no + " is an even number");
        } else {
            System.out.println(no + " is an odd number");
        }
    }
}

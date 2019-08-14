
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
public class Q7 {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number : ");
        double no1 = s.nextDouble();
        System.out.print("Enter another number : ");
        double no2 = s.nextDouble();
        
        if (no1%no2==0) {
            System.out.println("Divicible");
        } else {
            System.out.println("Not Divicible");
        }
    }
}

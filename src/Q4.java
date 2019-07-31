
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
public class Q4 {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter marks : ");
        int marks = s.nextInt();
        if (marks<=100&&marks >= 90) {
            System.out.println( "A" );
        } else if (marks >=80) {
            System.out.println( "B" );
        } else if (marks >=70) {
            System.out.println( "C" );
        }else if (marks>=0&&marks <70) {
            System.out.println( "D" );
        }else {
            System.out.println( "Invalid marks" );
        }
    }
}

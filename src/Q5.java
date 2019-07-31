
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
public class Q5 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 7 : ");
        int no = s.nextInt();
        if (no == 1) {
            System.out.println("Monday");
        } else if (no == 2) {
            System.out.println("Tuesday");
        } else if (no == 3) {
            System.out.println("Wednesday");
        } else if (no == 4) {
            System.out.println("Thursday");
        } else if (no == 5) {
            System.out.println("Friday");
        } else if (no == 6) {
            System.out.println("Saturday");
        } else if (no == 7) {
            System.out.println("Sunday");
        } else {
            System.out.println("Invalid entry");
        }
    }
}


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
public class Q2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter two numbers : ");
        int i1 = s.nextInt();
        int i2 = s.nextInt();
        if (i1 > i2) {
            System.out.println(i1 + " > "+i2);
        } else if (i1 < i2){
            System.out.println(i1 + " < "+i2);
        }else {
            System.out.println(i1 + " = "+i2);
        }
    }
}

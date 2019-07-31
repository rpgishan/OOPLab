
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
public class Q6 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Cost price : ");
        double cost = s.nextDouble();
        System.out.print("Enter Selling price : ");
        double price = s.nextDouble();
        
        if (price > cost) {
            System.out.println("Gain");
        } else if (price < cost) {
            System.out.println("Loss");
        } else {
            System.out.println("Break even");
        }
    }
}

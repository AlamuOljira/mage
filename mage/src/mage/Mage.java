/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mage;
import java.util.Scanner;
/**
 *
 * @author stud
 */
public class Mage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int a,b,sum;
      Scanner s=new Scanner(System.in);
      System.out.println("enter the firts no");
      a=s.nextInt();
      b=s.nextInt();
      sum= a+b;
            System.out.println("the sum of the 2 number is "+sum);
    }
    
}

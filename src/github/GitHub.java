/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package github;

import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Ahmed Diaa
 */
public class GitHub {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x = (int)(Math.random()*20+1);
        int y = (int)(Math.random()*20+1);
        int z = x + y;
        Scanner input = new Scanner (System.in);
        ArrayList<Integer> st = new ArrayList<>();
        System.out.println("What is "+ x +" + "+ y +" Equal ?");
        System.out.println("*Note :- If you entered the number zero the program will end");
        int ans = input.nextInt();
        while(ans!=0){
        }
        }
    }
    
}

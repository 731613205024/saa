/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sada;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Sada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
          Scanner sc=new Scanner(System.in);
       System.out.println("enter n value");
        int a=sc.nextInt(); 
        int i=1;
	for(int j=0;i<2*a;i++)	
        {int x=2*a-j;
	  if(a!=x) 
           {
             System.out.println(" "+i++ +"  "+"  "+x);  
              }		
	       }

    }
}

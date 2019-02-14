package oop2coursework2;
import java.util.ArrayList;
import java.util.Scanner;
public class Oop2coursework2 {
 public static void main(String[] args) {
     //a student can not be given 0 or more than 100 as result
     Scanner arm = new Scanner(System.in);
       System.out.println("Enter Student (Enter exit when done)");
       ArrayList<String>sa = new ArrayList();
       int s = 1;
       for(;true;){
       System.out.print("Enter Student "+ s +":");
       String z = arm.next();
       if(z.toLowerCase().equals("exit"))
           break;
       
       else
       {
           String nam;
        int a=0,r=0,m=0,e=0,l=0,n=0,av;
        for(;a <= 0 || a > 100;){
            if(a==0){
            System.out.println("Enter First Courseunit name: ");
            nam = arm.next();
            }
        System.out.print("Enter First Courseunit result: ");
        a = arm.nextInt();
        System.out.println("First Courseunit result: "+ a);
        System.out.println("");}
        
        for(;r <= 0 || r > 100;){
            if(r==0){
            System.out.println("Enter 2nd Courseunit name: ");
            nam = arm.next();
            }
        System.out.print("Enter 2nd Courseunit result: ");
        r = arm.nextInt();
        System.out.println("2nd Courseunit result: "+ r);
        System.out.println("");}
        
        for(;m <= 0 || m > 100;){
            if(m==0){
            System.out.println("Enter 3rd Courseunit name: ");
            nam = arm.next();
            }
        System.out.print("Enter 3rd Courseunit result: ");
        m = arm.nextInt();
        System.out.println("3rd Courseunit result: "+ m);
        System.out.println("");}
        
        for(;e <= 0 || e > 100;){
            if(e==0){
            System.out.println("Enter 4th Courseunit name: ");
            nam = arm.next();
            }
        System.out.print("Enter 4th Courseunit result: ");
        e = arm.nextInt();
        System.out.println("4th Courseunit result: "+ e);
        System.out.println("");}
        
        for(;l <= 0 || l > 100;){
            if(l==0){
            System.out.println("Enter 5th Courseunit name: ");
            nam = arm.next();
            }
        System.out.print("Enter 5th Courseunit result: ");
        l = arm.nextInt();
        System.out.println("5th Courseunit result: "+ l);
        System.out.println("");}
        
        for(;n <= 0 || n > 100;){
            if(n==0){
            System.out.println("Enter 6th Courseunit name: ");
            nam = arm.next();
            }
        System.out.print("Enter 6th Courseunit result: ");
        n = arm.nextInt();
        System.out.println("6th Courseunit result: "+ n);
        System.out.println("");}
      
       
        av = (a + r + m + e + l + n)*100/600;
        System.out.println("The average is " + av + "%");
        
       sa.add(z);
       s++;
       }
       
       }
    }
    
}

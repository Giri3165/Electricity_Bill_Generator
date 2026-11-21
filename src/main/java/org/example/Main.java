package org.example;

import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double unit = sc.nextDouble();
        if(unit<=100){
            System.out.println("The Electricity Bill Generated is : "+ (unit*1.5));
        }
        else if(unit<=200){
            System.out.println("The Electricity Bill Generated is : "+((100*1.5)+(unit-100)*2.5));
        }
        else{
            System.out.println("The Electricity Bill Generated is : "+((100*1.5)+(100*2.5)+(unit-200)*2.5));
        }
        sc.close();
    }
}
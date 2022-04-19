/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab1;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Test {
        public static void main(String[] args){
        MyStack stack = new MyStack(); 
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kodunuzu giriniz:");
        String code = scanner.next();
        System.out.println("çalışıyor...");
        stack.controller(code);
}
}

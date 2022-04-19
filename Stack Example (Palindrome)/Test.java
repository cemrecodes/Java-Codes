/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stack;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Cemre
 */
public class Test {   
    public static void main(String[] args) throws FileNotFoundException {
        // palindrom bulma metodunu kullanmak icin nesne olusturuluyor
        MyStack stack = new MyStack(); 
        
        // file'i duzgun bir sekilde acmak icin try catch blogu
        try {
             File file = new File("odev.txt"); // buraya dosya yolu girilmelidir.
             Scanner reader = new Scanner(file);
             stack.findPalindrome(reader);
           }
        catch (FileNotFoundException e) {
           System.out.println("An error occurred.");
           e.printStackTrace();
           } 
        //stack.pop();
}
}


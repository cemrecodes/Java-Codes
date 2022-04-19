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
public class MyStack {
        // ilk ve degistirilmemesi icin private olan Node
	private Node head; 
 
        // Node'un icerisinde harf ve bir sonraki Node'un bilgisi bulunuyor
	private class Node {
		char letter;
		Node next;
	}
        
    /**
     * default constructor ile head'e null atanıyor
     */
	public MyStack() {
		head = null;
	}
   
    /**
     * palindrom bulucu metoda Scanner ogesi parametre aliniyor
     * @param reader
     */
        public void findPalindrome(Scanner reader){
           int count; // harf saymak icin olusturulmus sayac degiskeni
           boolean flag = false; // palindrom olup olmadigi kontrolunde kullanılacak flag
           MyStack stack2 = new MyStack(); // satirin diger yarisini atamak icin 2. bir stack nesnesi
           
           while (reader.hasNextLine()) { // txt dosyasının sonuna kadar okur
             head = null; // bir sonraki satir kontrolu icin head sifirlaniyor
             stack2.head = null; // bir sonraki satir kontrolu icin head sifirlaniyor
             flag = false; // bir sonraki satir kontrolu icin flag = false
             count = 0; // bir sonraki satir kontrolu icin sayac sifirlaniyor
             String data = null; // bir sonraki satir kontrolu icin data sifirlaniyor
             data = reader.nextLine(); // satir dataya ataniyor
             System.out.print(data); // satir yazdiriliyor
             data = data.toLowerCase(); // palindrom kontrolu icin tum harfler kucuk harfe cevriliyor
                          
             // test sinifinda olusturulan stack'e harfleri atıyoruz
             for (int i = 0; i<data.length(); i++){
                 if( Character.isLetter(data.charAt(i)) ){
                     count++; // sayac arttiriliyor
                     push(data.charAt(i)); // karakter harf oldugundan stack'e ataniyor
                 }    
             }
                
            // eger satirda cift sayida harf varsa
            if ( count%2 == 0 ){
                    // ilk yarisini diger stacke atiyoruz,diger stackten ise siliyoruz
                    for (int j = 0; j<count/2; j++){
                        stack2.push(head.letter);
                        pop();
                        }
                    
                    // head null olana kadar
                    while ( head != null ){
                        // eger iki stack'in de head ayni ise
                        if ( stack2.head.letter == head.letter ){
                            flag = true;
                            pop();
                            stack2.pop(); 
                        }
                        // bir tane bile ayni olmayan harf cikarsa donguden cikiliyor
                        else{
                            flag = false;
                            break;
                        }
                    }
            }
            // eger satirda tek sayida harf varsa
            else{
                    // ilk yarisini diger stacke atiyoruz,var olandan ise siliyoruz
                    for (int j = 0; j<count/2; j++){
                        stack2.push(head.letter);
                        pop();
                        }
                    // ortada kalan harfi degerlendirmeyecegimizden dolayi atiyoruz
                    pop();
                    
                    // head null olana kadar
                    while (  head != null ){
                        // eger iki stack'in de head ayni ise
                        if ( stack2.head.letter == head.letter ){
                            flag = true;
                            pop();
                            stack2.pop();  
                        }
                        // bir tane bile ayni olmayan harf cikarsa donguden cikiliyor
                        else{
                            flag = false;
                            break;
                        }
                    
                     }
            }
            
            // flag true ise palindrom yoksa degil
            if ( flag ){
               System.out.println(" is palindrome.");               
            }
            else
                System.out.println(" is not palindrome.");
            
            }
           reader.close();
        }
     
    /**
     * stack'ten veri silme metodu, eger null ise exception firlatir
     * @throws StackEmptyException
     */
	public void pop() throws StackEmptyException {
		if (head == null) {
			throw new StackEmptyException();
		}
                // yeni head bir sonraki head oluyor
		head = head.next;
	}

    /**
     * stack'e yeni veri ekleyen metod
     * @param letter
     */
	public void push(char letter) {
		Node oldHead = head;
		head = new Node();
		head.letter = letter;
		head.next = oldHead;
	}

     }
 
/**
 * 
 * Stack'in bos oldugunda ve pop metodu kullanılmak istendiginde firlatilan exception
 */
 
class StackEmptyException extends RuntimeException {
	public StackEmptyException() {
		          System.out.println("Stack is empty.");
	}
}
 


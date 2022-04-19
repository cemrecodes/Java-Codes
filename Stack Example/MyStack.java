/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab1;


import java.util.Scanner;
/**
 *
 * @author Cemre
 */
public class MyStack {

	private Node head; 

	private class Node {
		char data;
		Node next;
	}

	public MyStack() {
		head = null;
	}

        public void controller(String code){
           int count,count2;
           boolean flag = false;
           MyStack stack2 = new MyStack(); 
           head = null; 
             stack2.head = null; 
             flag = false; 
             count = 0; 
             count2 = 0;
           
                          //System.out.println("code length:"+code.length());
             for (int i = 0; i<code.length(); i++){
                 if( code.charAt(i) == '('  || code.charAt(i) == '[' || code.charAt(i) == '{' ){
                     count++; 
                     push(code.charAt(i));
                 }  
                 else if ( code.charAt(i) == ')' || code.charAt(i) == ']' || code.charAt(i) == '}'){
                   count2++;
                   stack2.push(code.charAt(i));
             }
             }
            //System.out.println("count:"+count);
            if ( count == count2 ){

                    
                    while ( head != null ){
                        //System.out.println("while"+ head.data + stack2.head.data );
                         if ((head.data == '(' && stack2.head.data == ')') || ( head.data == '[' && stack2.head.data == ']' ) || ( head.data == '{' && stack2.head.data == '}' )){
                            flag= true;
                            pop();
                            stack2.pop();
                        }

                        else{
                            flag = false;
                            break;
                        }
                    }
            }
            else{
                System.out.println("Kodunuzda [] veya () veya {} hatası bulunmaktadır.");
            }
            
            if ( flag ){
               System.out.println("Kodunuzda [] veya () veya {} hatası bulunmamaktadır.Tebrikler!");               
            }
        
        }
     

	public void pop() throws StackEmptyException {
		if (head == null) {
			throw new StackEmptyException();
		}
                // yeni head bir sonraki head oluyor
		head = head.next;
	}

	public void push(char data) {
		Node oldHead = head;
		head = new Node();
		head.data = data;
		head.next = oldHead;
	}

     }
 

 
class StackEmptyException extends RuntimeException {
	public StackEmptyException() {
		          System.out.println("Stack is empty.");
	}
}
 


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package queue;



/**
 *
 * @author User
 */
public class QueueList {
    QueueNode head=null;
    QueueNode rear;
    
    void enqueue(Object data){
        QueueNode eleman=new QueueNode();
        eleman.data=data;
        
        QueueNode temp;
        if(head==null){
            
            head=eleman;
            rear=eleman;
            
        }
        else{
            temp=rear;
            temp.next=eleman;
            rear=eleman;
            

        }

        
        
    }
    void dequeue(){
        QueueNode temp=head;
        head=temp.next;
    }
    void println(){
     QueueNode temp=head;
     while(temp!=null){
         if(temp.next==null){
             // rear'ı yazdırır.
             System.out.print(temp.data);
         }else{
             System.out.print(temp.data+" <<<< ");
         }
         temp=temp.next;
     }
        System.out.println();

}
    void peek(){
        System.out.println("peek: "+head.data);
    }
    void isEmpty(){
        if(head==null){
            System.out.println("queue is empty.");
        }
        else{
            System.out.println("queue is not empty.");
        }
    }
}

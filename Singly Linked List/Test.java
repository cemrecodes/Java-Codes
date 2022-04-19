/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hafta3;

/**
 *
 * @author Cemre
 */
//test class

public class Test {
     public static void main(String[] args)    
    {   // l1 listesi olusturuluyor ve degerler ataniyor
        LinkedList l1 = new LinkedList();
        l1.initialize(13);
        l1.add(3);
        l1.add(5);
        l1.add(4);
        l1.printLinkedList(l1);
        l1.delete(5);
        l1.printLinkedList(l1);
//        System.out.println("Printing l1: ");
//        l1.printLinkedList(l1);
//        l1.add2(13,1);
//        l1.printLinkedList(l1);
//        // l2 listesi olusturuluyor ve degerler ataniyor
//        LinkedList l2 = new LinkedList();
//        l2.initialize(4);
//        l2.add(1);
////        l2.add(5);
//        System.out.println("Printing l2: ");
//        l2.printLinkedList(l2);
//        
//        // iki listeyi birleştirme
//        l1.concatenate(l2);
//        System.out.println("Printing new l1: ");
//        l1.printLinkedList(l1);
//       
//        // kucukten buyuge siralama
//        l1.sort();
//        l1.printLinkedList(l1);
//        
//        // sirali listeye deger ekleme
//        l1.addedSorted(17);
//        l1.printLinkedList(l1);
//        
//        // medyan bulma
//        System.out.println("Median: "+ l1.findMedian());
//        //ters cevirme
//        l1.reversedList(l1.head);
//        l1.printLinkedList(l1);
//        
//        // digerleri
//        LinkedList l3 = new LinkedList();
//        System.out.println("Number of nodes in l3 list: "+l3.elementCount());
//        l3.addedSorted(0);
//        l3.printLinkedList(l3);
//        l3.concatenate(l3);
//        l3.printLinkedList(l3);
//        l3.reversedList(l3.head);
//        l3.printLinkedList(l3);
//        System.out.println("Median of an empty list: "+ l3.findMedian());        
        
    }   
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hafta3;

/**
 *
 * @author Cemre
 */
public class LinkedList {
   // head (bas) Node'u olusturuldu
   Node head = null;

    /**
     * LinkedList constructor'i
     */
    public LinkedList() {
        
    }
    /* initialize metodu ile listenin ilk Node'u yani head'i olusturuldu
       head (bas) Node'u olusturuldu
       Node'a data ve ondan sonraki (next) Node'a null
       deger atandi */

    /**
     * bagli listenin ilk node'unu olusturur
     * @param data
     */

    public void initialize(int data)
    {
      head = new Node();
      head.data = data;
      head.next = null;
      head.previous = null;
    }

    /**
     * data ekleme
     * @param data
     */
    public void add(int data)
 {     //listeye eklenecek yeni node'u ve ozelliklerini olusturduk
       Node newNode = new Node();
       newNode.data = data;
       newNode.next = null;  
       //newNode.previous = null;
       // listeyi gezmek icin temp adli bir Node olusturduk
       Node temp = head;
       
       // listenin bos olup olmadigi kontrol edilir
       if (head != null){
        // bir sonraki eleman null olana kadar liste geziliyor
        while(temp.next != null)
        {
           temp = temp.next;
        }
        
        // yeni node bir önceki node'un next degiskenine ataniyor
        temp.next = newNode;  
        newNode.previous = temp;
       }
       else
           System.out.println("To add a new node list has to be initialized first.");
 }
    
    public void delete(int data){
        Node temp = head;
        Node temp2 = new Node();
        while (temp.next != null){
            if(temp.next.data == data ){
                temp2 = temp.next.next;
                temp.next = temp2;
                temp2.previous = temp;
                
                break;
            }
        }
    }

    /**
     *  listenin bos olup olmadigini kontrol eden metod
     * @return false if list is empty
     * @return true if list is not empty
     */
    public boolean isntVoid(){
    if (head == null){
        System.out.println("There is no item in this list.");
        return false;
    }
    else 
       return true;

}
     public void add2(int data,int data2)
 {     //listeye eklenecek yeni node'u ve ozelliklerini olusturduk
       Node newNode = new Node();
       newNode.data = data2;
       newNode.next = null;   
       // listeyi gezmek icin temp adli bir Node olusturduk
       Node temp = head;
       
       // listenin bos olup olmadigi kontrol edilir
       if (head != null){
        // bir sonraki eleman null olana kadar liste geziliyor
        while(temp.next != null)
        { if (temp.data == data){
                    System.out.println("girdi");
            break;}
            System.out.println(temp.data);
           temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;  
        
       }
       else
           System.out.println("To add a new node list has to be initialized first.");
 }

    /**
     *
     * @return number of Nodes
     */
    public int elementCount()
 {     // listeyi gezmek icin temp adli bir Node olusturduk ve head Node'unu atadik
       Node temp = head;
       // sayac
       int count = 0;
       // bir sonraki Node null olana kadar calisir
       while(temp != null)
       {
           count++;
           temp = temp.next;
       }
      return count;               
 }

    /**
     *
     */
    public void sort(){      
         // kac eleman oldugunu count adli degiskene atadik
         int count = elementCount();
  
        // siralama icin bubble sort algoritmasini kullandim
        // listenin bos olup olmadigi kontrol edilir
        if (isntVoid()){
         for(int j = 1;j <= count ;j++){
             // listeyi gezmek icin temp adli bir Node olusturduk ve head Node'unu atadik
             Node temp = head;
             for (int i = 1; i<=count-1; i++ ){
                 if ( temp.next.data < temp.data ){
                     int backup = temp.data;
                     temp.data = temp.next.data;
                     temp.next.data = backup;
                     }
                 temp = temp.next;
                 }
             }    
        }
    }

    /**
     * siralanmis bir listeye yeni Node'u datasina gore liste yine siralanmis olacak sekilde ekler
     * @param data
     */
    public void addedSorted(int data){
       // eklenecek yeni Node'u olusturduk ve ozelliklerine gerekli degerleri atadik
       Node newNode = new Node();
       newNode.data = data;
       newNode.next = null;    
 
       // listeyi gezmek icin temp adli bir Node olusturduk ve head Node'unu atadik
       Node temp = head;
       
       // listenin bos olup olmadigi kontrol edilir
       if (isntVoid()){
       // bir sonraki Node null oluncaya kadar liste geziliyor
       while(temp.next != null)
       {  
           /* eger yeni Node'un datasi temp'in datasindan buyuk ama bir sonraki datadan kucukse
              newNode yani yeni Node'umuz temp ile temp.next'in arasina aliniyor
           */
           if ( newNode.data > temp.data && newNode.data < temp.next.data ){
             newNode.next = temp.next;
             temp.next = newNode;
             break;
            }     
           /* eger yeni Node'un datasi listedeki en kucuk data ise en basa ekleniyor
              ve yeni head (bas) oluyor
           */
           else if ( newNode.data < temp.data ){
             newNode.next = temp;
             head = newNode;
             break;
           }
          
           else if ( newNode.data > temp.next.data && temp.next.next == null){
             temp.next.next = newNode;
             break;
           }
           /* hicbir else-if bloguna girilmiyorsa bir sonraki Node'a geciliyor
           */
          else
            temp = temp.next;
       }
       }
       
}

    /**
     * listenin medyan degerini bulur
     * @return median (double)
     */
    public double findMedian(){
        double median = 0;
        // listenin orta degerinin bulmak icin uzunluk degerini aliyoruz
        int length = elementCount();
        // listede dolasmak icin bir Node olusturuluyor ve head ataniyor
        Node node = head;   
        int count = 1;
         
       // liste bossa direkt medyan=0
        if ( length == 0)
            return median;
        /* liste uzunlugu tek sayi ise medyan tam ortadaki degerdir
           listede tam ortadaki degere gelinene kadar dolasiliyor
        */
        else if ( length%2 == 1){
            while(node.next != null){  
                if ( count == length/2 ){
                    median = node.data;
                    return median;
                }        
                node = node.next;
                count++;
            }
        }
        /* geriye tek secenek yani listenin uzunlugunun 0 haric cift
           sayida olmasi kaliyor
           listenin ortasindaki iki deger bulunana kadar liste dolasiliyor
           ve iki degerin ortalamasi (yarisi) donduruluyor
        */
        
        else {
            while(node.next != null)
            {  
            if ( count == length/2 ){
              median = (double) (node.data + node.next.data)/2;
              return median;
            }
            node = node.next;
            count++;
            }
        }
}

    /**
     * listeyi tersine cevirir
     * @param node
     */    
    
    public void reversedList(Node node){
        // listenin bos olup olmadigi kontrol edilir
        if (isntVoid()){
            // listeyi ters cevirmek icin ikinci Node ataniyor
            Node reverse = head.next;
            // listenin ilk Node'u ataniyor
            Node reversed = head;
            // ilk Node son olacagi icin Node'un bir sonraki degeri null ataniyor
            reversed.next = null;


            // reverse Node'u null olana kadar listede geziliyor
            while ( reverse != null) {
              // temp Node'una su anki Node ataniyor
              Node temp = reverse;

              // reverse Node'una bir sonraki Node ataniyor
              reverse = reverse.next;

              /* su anki Node'un bir sonraki Node'una asil 
                 listedeki bir önceki Node'u ataniyor
              */
              temp.next = reversed;

              // reversed node'una su anki Node ataniyor
              reversed = temp;
            }
            // en son bas Node'a en sonki deger ataniyor
            head = reversed;
        }
}
     
    /**
     *
     * @param list
     */
    public void concatenate(LinkedList list){   
    Node temp = head;   
    Node node2 = list.head; 
    
    // listenin bos olup olmadigi kontrol edilir
    if (isntVoid()){
        // bir sonraki Node bos olana kadar listede geziliyor
        while(temp.next != null)
           {
             temp = temp.next;
           }
        // ilk listeye diger listenin elemanlari bitene kadar ekleme yapiliyor 
        while(node2 != null)
           {
             temp.next = node2;
             node2 = node2.next;
             temp = temp.next;
           }
    }
}

    /**
     * listeyi yazdirir
     * @param list
     */
    public void printLinkedList(LinkedList list)
    {
       Node temp = list.head;       
       
    // bir sonraki Node bos olana kadar listede geziliyor ve degerler yazdiriliyor
       while(temp != null)
       {
           System.out.print(temp.data +" => ");
           temp = temp.next;
       }
        System.out.println("Null");               
    }

}



package javaPrograms;
import java.util.LinkedList;

public class MiddleElementLinkedList {

	public static <T> T getMiddleElement(LinkedList<T> list) {
		

	   if (list == null || list.isEmpty()) {
           return null; // Return null for an empty list
       }

       int size = list.size();
       int middleIndex = size / 2;
       System.out.println("middle index = "+middleIndex+"size = "+size);
       

       if (size % 2 == 0) {
           return null; // Return null if the list has an even number of elements
       } else {
           return list.get(middleIndex); // Return the middle element for odd-sized list
           
       }
      
       
   }
	
	 public static <T>T middleelment(LinkedList<T> list){
		 
		 int size=list.size()/2;
		 if(size%2==0) {
			 return null;
		 }else {
			 return  list.get(size); 
		 }
		
  	   
     }
	 

	
	public static void main(String[] args) {
		LinkedList<Integer> ls = new LinkedList<Integer>();
		ls.add(1);
		ls.add(2);
		//ls.add(3);
		ls.add(5);
		//ls.add(2);
		
		getMiddleElement(ls);
		
		Integer middle = getMiddleElement(ls);
		middleelment(ls);
        if (middle != null) {
            System.out.println("Middle element: " + middle);
        } else {
            System.out.println("No single middle element found.");
        }
	}


	
			
}

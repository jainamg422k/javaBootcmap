package collectionsFramkework;

import java.util.LinkedList;

public class LinkedlistDemo {

	public static void main(String[] args) {
         Object object[] = new Object[100000];
         for(int i =0 ; i<object.length ;i++) {
        	 object[i] = new Object();
         }
        
         LinkedList<Object>list  = new LinkedList<>();
         long start = System.currentTimeMillis();
         for (Object object2 : object) {
			list.add(object);
		}
        long end = System.currentTimeMillis();
        
        System.out.println("Time taken "+ " " + (end - start));
	}

}

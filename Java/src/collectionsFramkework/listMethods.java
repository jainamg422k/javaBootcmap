package collectionsFramkework;
import java.util.ArrayList;
import java.util.List;

public class listMethods {

	public static void main(String[] args) {
    List<Integer>list = new ArrayList<>();
    
    for (int i = 0; i<=100 ; i=i+10) {
    	list.add(i);
    }
    System.out.println("List" + list);
    
    list.add(2, 100);
    System.out.println("List "+list);
    
    List<Integer> secondlist = new ArrayList<>();
    secondlist.add(111);
    secondlist.add(222);
    secondlist.add(333);
    
    System.out.println("SecondList" + secondlist);
    
    list.addAll(4, secondlist);
    System.out.println("List After addiing "+list);
    
    if(list.contains(222)) {
    	System.out.println("List has the value");
    }
    else {
    	System.out.println("List do not have the value");
    }
	}
}

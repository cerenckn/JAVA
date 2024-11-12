package ders1;
import java.util.ArrayList;
import java.util.LinkedList;
public class array_list {
	public static void main(String[] args) {
		LinkedList<String> car= new LinkedList<String>(); //Linkedlist yerine Array Lİst şeklinde yazmıştık.
		car.add("Volvo");
		car.add("BMW");
		car.add(0,"Mercedes");
		for(String near:car) {
			System.out.println(near);
		}	
	}
	
	
	
	
}

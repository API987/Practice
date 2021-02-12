package first; 
import java.util.*; 
public class Assign6 { 
	public static void main(String[] args) { 
		// Write a program for the foll using arraylist and  linkedlist 
		// a. Display the initial set that consists of 6 elements  like L, M, N, O, P and Q 
		// b. Display the reversed set of the above elements // c. Display the set of elements that are less than or  equal to the element ‘O’ 
		// d. Display the set of elements that do not contain the  element ‘Q’ 
		// e. Display the set of elements that are greater than the element ‘N’ 
		// f. Display the set of elements 
		//ArrayList 
		ArrayList<Character> al = new ArrayList<Character>(); al.add('L'); 
		al.add('M'); 
		al.add('N'); 
		al.add('O'); 
		al.add('P'); 
		al.add('Q'); 
		System.out.println("Initial list: "+al); 
		Collections.reverse(al); 
		System.out.println("Reversed list: "+al); 
		Iterator<Character> it = al.iterator(); 
		System.out.print("Less than or equal to 'O': "); 
		while(it.hasNext()) { 
			Character x = it.next(); 
			if(x<='O') 
				System.out.print(x+" "); 
		} 
		System.out.println(""); 
		it=al.iterator(); 
		System.out.print("Not Q: "); 
		while(it.hasNext()) { 
			Character x = it.next(); 
			if(x!='Q') 
				System.out.print(x+" "); 
		} 
		System.out.println("");
		it=al.iterator(); 
		System.out.print("Greater than N: "); 
		while(it.hasNext()) { 
			Character x = it.next(); 
			if(x>'N') 
				System.out.print(x+" "); 
		} 
		//LinkedList 
		System.out.println("\n"); 
		LinkedList<Character> ll = new LinkedList<Character>(); ll.add('L'); 
		ll.add('M'); 
		ll.add('N'); 
		ll.add('O'); 
		ll.add('P'); 
		ll.add('Q'); 
		System.out.println("Initial list: "+ll); 
		Collections.reverse(ll); 
		System.out.println("Reversed list: "+ll); 
		Iterator<Character> i = ll.iterator(); 
		System.out.print("Less than or equal to 'O': "); 
		while(i.hasNext()) { 
			Character x = i.next(); 
			if(x<='O') 
				System.out.print(x+" "); 
		} 
		System.out.println(""); 
		i=ll.iterator(); 
		System.out.print("Not Q: "); 
		while(i.hasNext()) { 
			Character x = i.next(); 
			if(x!='Q') 
				System.out.print(x+" "); 
		} 
		System.out.println(""); 
		i=ll.iterator(); 
		System.out.print("Greater than N: "); 
		while(i.hasNext()) { 
			Character x = i.next(); 
			if(x>'N') 
				System.out.print(x+" "); 
		} 
		// 1. Write a program to swap any two positions in an array using ArrayList. Also, throw 
		// appropriate exceptions if indexes are out of bounds.
		// For Example: 
		// a. Consider an array that consists of 6 elements like a, b, c, d, e, and f 
		// b. Take any two index numbers as input from the user // c. If the index numbers are entered wrong, throw an out  of bounds exception saying, 
		// “Please enter the index numbers between 0 and 5.” 
		ArrayList<Character> a = new ArrayList<Character>(); a.add('a'); 
		a.add('b'); 
		a.add('c'); 
		a.add('d'); 
		a.add('e'); 
		a.add('f'); 
		Scanner s = new Scanner(System.in); 
		System.out.println("original list: "); 
		try { 
			int m = s.nextInt(); 
			int n = s.nextInt(); 
			if(m>a.size()-1 || n>a.size()-1 || m<0 || n<0) 
				throw new ArrayIndexOutOfBoundsException(); 
			Collections.swap(a, m, n); 
		} 
		catch(ArrayIndexOutOfBoundsException e){ 
			System.out.println("Please enter the index numbers  between 0 and 5"); 
		} 
		System.out.println("After swap: "+a); 
	} 
}

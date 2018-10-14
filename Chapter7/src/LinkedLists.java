import java.util.*;
//linked lists can be used in place of arrays
//there are two parts to these lists, being a container value and a reference value
		//following container, reference.

class List {
String firstname; //allows us to have a linked set of integers
List next; //this refers to the next cell, which is also a list in this case

// *************  BELOW IS THE DEFINING OF BASIC OPERATIONS  ******************** 

//creating a constructor for the type List as List(head, tail)
List (String i, List tail) {
	this.firstname = i;
	this.next = tail; //the field next is self referential, it is the reference field
}

//classifies the end of the list where when the list equals null, it ends
static boolean isEmpty(List list) {
	if (list==null) 
		return true;
		else return false;}

static String head(List list) {
	return list.firstname;
}
static List tail(List list) {
	return list.next;
}

public static List addToList(List mynewlist, String string) {
	return new List(string, mynewlist);
}

// ***********  END OF DEFINING BASIC OPERATIONS *******************
}

class LinkedLists {
	
	/* Below is an example of dynamic insertion, adding an element to the list
	 * 
	 * 
	 */
	
	static List addToList(List list, String addition) {
		return new List(addition, list);}
		
	/*Below
	 *the function searches if the element is a part of the list
	 * it keeps searching until the end of the list where list=null, therefore there
	 * are no next items in line.
	 * returns true when the element search equals the name of the element in the list
	 * if it returns false, therefore the item is not part of the list
	*/
	
	static boolean belongTo(String element, List list)
	
	{while (list !=null) {
		if (element.equals(list.firstname))
			return true;
		list=list.next;
	}
	return false;
	} 
	
	/*BELOW
	 * printing out a chained structure to see what happened for the operation
	 * this is useful because when compared to arrays, linked lists are more complicated
	 * in terms of operations so you would want to check what is happening
	 * 
	 * below prints the chained structure starting from its head
	 */
	
	static void Display(List list) {
		while (list!=null) {
			System.out.println(list.firstname + "--->");
			list =list.next; //moves list to next cell in the list
		}
		System.out.println("at the end of the list, where list = null");
	}
	
	/* BELOW 
	 * removing a cell from the linked list and connecting the two adjacent cells
	 */
	
	static List DeleteCell (List list, String s) {
		
		//Case 1: if list is empty
		if (list==null) {
			return null;
		}
		
		//Case 2: element is at the head
		
		if(list.firstname.equals(s)) {
			return list.next;
		}
	
		//All other cases
		
		List v = list;
		List w= list.next; //tail
		
		while (w!=null && (w.firstname).equals(s)) {
			v=w; w=v.next;
		}
		
		//cutting the list, where this would take care of removal of last item in the linked list
		if (w!=null) {
			v.next = w.next;
		}
		
		
		return list;
	}
	
	
	public static void main(String[] args) { 
		
		List mynewlist = null;
		mynewlist=List.addToList(mynewlist, "bob" );
		mynewlist=List.addToList(mynewlist, "tom" );
		mynewlist=List.addToList(mynewlist, "joe" );
		mynewlist=List.addToList(mynewlist, "kev" );
		
		System.out.println("What would you like to search for in the list?");
		Scanner keyboard = new Scanner(System.in);
		String inputkeyboard=keyboard.nextLine();		
		
		System.out.println("does the searched word does belong to the list?: " + belongTo(inputkeyboard, mynewlist));
		Display(mynewlist);
		DeleteCell(mynewlist, inputkeyboard);
		Display(mynewlist);
	}
	
}
/*
 * Using linked lists vs arrays
 * - arrays are quicker at accessing object, but linked lists are quicker at inserting 
 * and deleting objects
 * - disadvantages of linked lists
 * 				- random access is low, and memory is a concern
 */


import java.util.*;

class linkedList {
	
	int firstnumber;
	linkedList nextnumber;
	
	linkedList (int i, linkedList tail) {
		this.firstnumber=i;
		this.nextnumber=tail;}
	
	static boolean isEmpty (linkedList list) {
		if (list==null) 
			return true;
		else return false;}
	
	static int headNumber (linkedList list) {
		return list.firstnumber;}
	
	static linkedList nextNumber (linkedList list) {
		return list.nextnumber;}
	
	static linkedList addToList(int add, linkedList list) {
		return new linkedList (add, list);}
	
}


class LinkedListsForIntervals {	

	static linkedList addToList(int add, linkedList list) {
		return new linkedList (add, list);
	}
	
	static void displayList(linkedList list) {
		int n= 0;
		while (list!=null) {
			System.out.println(list.firstnumber);
			list = list.nextnumber;
			n++;
		}
		System.out.println("The list now is equal to null. " + "This fuction ran through " + n + " times.");
		}
	
	static int lengthList (linkedList list) {
			int n=0;
			while(list!=null) {
				list = list.nextnumber;
				n++;
			}
			return n;
	}

public static void main(String [] args) {
	
	linkedList Firstlist = null;

	/*Below:
	 * special type of adding to the list where the function to add to the list is inside the
	 * class "linkedList"
	 * - do this or else it wont work
	*/
		
	Firstlist =linkedList.addToList(7,Firstlist);
	Firstlist =linkedList.addToList(78, Firstlist);
	Firstlist =linkedList.addToList (34,Firstlist);
	Firstlist =linkedList.addToList (29,Firstlist);
	Firstlist =linkedList.addToList (89,Firstlist);
	
	displayList(Firstlist);
	System.out.println("The length of the list is: " + lengthList(Firstlist));
}
}


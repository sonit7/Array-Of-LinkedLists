package collections.arrays;
import java.util.Iterator;
import java.util.LinkedList;
//Array of LinkedList
public class LinkedListArray <T>{
	/** Array */
	private LinkedList<T>[] positions;
	
	/** creates a new Array Of LinkedLists*/
	public LinkedListArray(int size) {
		positions = new LinkedList[size];
		for(int i=0; i<positions.length; i++) {
			positions[i] = new LinkedList<T>();
		}
	}
	
	/** adds a value to the current head of a specific row of the array */
	public void offerFirst(int row, T element) {
		positions[row].add(0,element);
	}
	
	/** adds a value to the current tail of a specific row of the array */
	public void offerLast(int row, T element) {
		positions[row].add(element);
	}
	
	/** adds a value at a specific index of a specific row of the array*/
	public void add(int row, int index, T element) {
		positions[row].add(index,element);
	}
	
	/** removes a value at a specific index of a specific row of the array*/
	public void remove(int row, int index) {
		positions[row].remove(index);
	}
	
	/** removes a specific object */
	public void remove(int row, T object) {
		if(positions[row].contains(object))
			positions[row].remove(object);
	}
	
	/** removes the current head of a specific row of the array*/
	public void removeHead(int row) {
		positions[row].remove();
	}
	
	/** removes the current tail of a specific row of the array */
	public void removeTail(int row) {
		positions[row].remove(positions[row].size()-1);
	}
	
	/** Returns true if a specific row contains an object */
	public boolean rowContains(int row, T object) {
		for(int i=0; i<positions[row].size(); i++) 
			if(positions[row].get(i).equals(object))
				return true;
		return false;
	}
	
	/** Returns true if the entire array contains the given object */
	public boolean contains(T object) {
		int row = 0;
		while(row<positions.length) 
			if(positions[row].contains(object))
					return true;
		return false;
	}
	
	/** Finds the indices of a given object in the entire array */
	public String indexOf(T object) {
		int row = 0;
		int col = 0;
		while(row<positions.length) 
			while(col<positions[row].size()) 
				if(positions[row].get(col).equals(object))
					return "ROW: "+row+"; COL: "+col;
		return "ROW: -1; COL: -1";
	}
	
	/** Finds the index of a given object in a specific row of the array */
	public int indexOf(int row, T object) {
		int col = 0;
		while(col<positions[row].size()) {
			if(positions[row].get(col).equals(object))
				return col;
		}
		return col;
	}
	/** Returns the element located at index i of row r in the array*/
	public T get(int r, int i) {
		return positions[r].get(i);
	}
	
	/** Returns the first element of a row of the array*/
	public T getFirst(int r) {
		return positions[r].getFirst();
	}
	
	/** Returns the last element of a row of the array*/
	public T getLast(int r) {
		return positions[r].getLast();
	}
	
	/** Returns the first element of the entire array */
	public T peek() {
		return positions[0].peekFirst();
	}
	
	/** Returns the last element of the array */
	public T peekLast() {
		return positions[positions.length-1].peekLast();
	}

	/** Iterates through All Elements of the Array of LinkedLists*/
	public void iterator() {
		for(int i=0; i<positions.length; i++) {
			Iterator<LinkedList<T>> it = (Iterator<LinkedList<T>>) positions[i].iterator();
			while(it.hasNext()) {
				System.out.print(it.next()+" ");
			}
			System.out.println();
		}
	}
	
	/** Displays the Array of LinkedLists */
	public String toString() {
		String acc = "";
		for(int i=0; i<positions.length; i++) {
			for(int j=0; j<positions[i].size(); j++) {
				acc+=positions[i].get(j)+" ";
			}
			acc+="\n";
		}
		return acc;
	}
}

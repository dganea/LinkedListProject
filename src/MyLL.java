class MyLL {
 
	private static int numInList;
	private Node head;
 
	// Default constructor
	public MyLL() {
 
	}
 
	// appends the specified element to the end of this list.
	public void addToRear(Object data) {
 
		// Initialize Node only incase of 1st element
		if (head == null) {
			head = new Node(data);
		}
 
		Node studentTemp = new Node(data);
		Node studentCurrent = head;
 
		// Let's check for NPE before iterate over studentCurrent
		if (studentCurrent != null) {
 
			// starting at the head node, crawl to the end of the list and then add element after last node
			while (studentCurrent.getNext() != null) {
				studentCurrent = studentCurrent.getNext();
			}
 
			// the last node's "next" reference set to our new node
			studentCurrent.setNext(studentTemp);
		}
 
		// increment the number of elements variable
		incrementnumInList();
	}
 
	private static int getnumInList() {
		return numInList;
	}
 
	private static void incrementnumInList() {
		numInList++;
	}
 
	private void decrementnumInList() {
		numInList--;
	}
 
	// inserts the specified element at the specified position in this list
	public void add(Object data, int index) {
		Node studentTemp = new Node(data);
		Node studentCurrent = head;
 
		// Let's check for NPE before iterate over studentCurrent
		if (studentCurrent != null) {
			// crawl to the requested index or the last element in the list, whichever comes first
			for (int i = 0; i < index && studentCurrent.getNext() != null; i++) {
				studentCurrent = studentCurrent.getNext();
			}
		}
 
		// set the new node's next-node reference to this node's next-node reference
		studentTemp.setNext(studentCurrent.getNext());
 
		// now set this node's next-node reference to the new node
		studentCurrent.setNext(studentTemp);
 
		// increment the number of elements variable
		incrementnumInList();
	}
 
	public Object get(int index)
	// returns the element at the specified position in this list.
	{
		// index must be 1 or higher
		if (index < 0)
			return null;
		Node studentCurrent = null;
		if (head != null) {
			studentCurrent = head.getNext();
			for (int i = 0; i < index; i++) {
				if (studentCurrent.getNext() == null)
					return null;
 
				studentCurrent = studentCurrent.getNext();
			}
			return studentCurrent.getData();
		}
		return studentCurrent;
 
	}
 
	// removes the element at the specified position in this list.
	public boolean remove(int index) {
 
		// if the index is out of range, exit
		if (index < 1 || index > size())
			return false;
 
		Node studentCurrent = head;
		if (head != null) {
			for (int i = 0; i < index; i++) {
				if (studentCurrent.getNext() == null)
					return false;
 
				studentCurrent = studentCurrent.getNext();
			}
			studentCurrent.setNext(studentCurrent.getNext().getNext());
 
			// decrement the number of elements variable
			decrementnumInList();
			return true;
 
		}
		return false;
	}
 
	// returns the number of elements in this list.
	public int size() {
		return getnumInList();
	}
 
	public String toString() {
		String output = "";
 
		if (head != null) {
			Node studentCurrent = head.getNext();
			while (studentCurrent != null) {
				output += studentCurrent.getData().toString() + "\n\n";
				studentCurrent = studentCurrent.getNext();
			}
 
		}
		return output;
	}
 
	private class Node {
		// reference to the next node in the chain, or null if there isn't one.
		Node next;
 
		// data carried by this node. could be of any type you need.
		Object data;
 
		// Node constructor
		public Node(Object dataValue) {
			next = null;
			data = dataValue;
		}
 
		// another Node constructor if we want to specify the node to point to.
		@SuppressWarnings("unused")
		public Node(Object dataValue, Node nextValue) {
			next = nextValue;
			data = dataValue;
		}
 
		// these methods should be self-explanatory
		public Object getData() {
			return data;
		}
 
		@SuppressWarnings("unused")
		public void setData(Object dataValue) {
			data = dataValue;
		}
 
		public Node getNext() {
			return next;
		}
 
		public void setNext(Node nextValue) {
			next = nextValue;
		}
 
	}
}
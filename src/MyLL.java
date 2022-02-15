public class MyLL {
 
	public static int numInList;
	public Node frontOfList;
 
	// Default constructor
	public MyLL() {
		numInList = 0;
		frontOfList = null;
	}
 
	// appends the specified element to the end of this list.
	public void addToRear(Object data) {
 
		// Initialize Node only incase of 1st element
		if (frontOfList == null) {
			frontOfList = new Node(data);
		}
 
		Node studentTemp = new Node(data);
		Node studentCurrent = frontOfList;
 
		// Let's check for NPE before iterate over studentCurrent
		if (studentCurrent != null) {
 
			// starting at the frontOfList node, crawl to the end of the list and then add element after last node
			while (studentCurrent.getfrontOfList() != null) {
				studentCurrent = studentCurrent.getfrontOfList();
			}
 
			// the last node's "frontOfList" reference set to our new node
			studentCurrent.setfrontOfList(studentTemp);
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
		Node studentCurrent = frontOfList;
 
		// Let's check for NPE before iterate over studentCurrent
		if (studentCurrent != null) {
			// crawl to the requested index or the last element in the list, whichever comes first
			for (int i = 0; i < index && studentCurrent.getfrontOfList() != null; i++) {
				studentCurrent = studentCurrent.getfrontOfList();
			}
		}
 
		// set the new node's frontOfList-node reference to this node's frontOfList-node reference
		studentTemp.setfrontOfList(studentCurrent.getfrontOfList());
 
		// now set this node's frontOfList-node reference to the new node
		studentCurrent.setfrontOfList(studentTemp);
 
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
		if (frontOfList != null) {
			studentCurrent = frontOfList.getfrontOfList();
			for (int i = 0; i < index; i++) {
				if (studentCurrent.getfrontOfList() == null)
					return null;
 
				studentCurrent = studentCurrent.getfrontOfList();
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
 
		Node studentCurrent = frontOfList;
		if (frontOfList != null) {
			for (int i = 0; i < index; i++) {
				if (studentCurrent.getfrontOfList() == null)
					return false;
 
				studentCurrent = studentCurrent.getfrontOfList();
			}
			studentCurrent.setfrontOfList(studentCurrent.getfrontOfList().getfrontOfList());
 
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
 
		if (frontOfList != null) {
			Node studentCurrent = frontOfList.getfrontOfList();
			while (studentCurrent != null) {
				output += studentCurrent.getData().toString() + "\n\n";
				studentCurrent = studentCurrent.getfrontOfList();
			}
 
		}
		return output;
	}
 
	private class Node {
		// reference to the frontOfList node in the chain, or null if there isn't one.
		Node frontOfList;
 
		// data carried by this node. could be of any type you need.
		Object data;
 
		// Node constructor
		public Node(Object dataValue) {
			frontOfList = null;
			data = dataValue;
		}
 
		// another Node constructor if we want to specify the node to point to.
		@SuppressWarnings("unused")
		public Node(Object dataValue, Node frontOfListValue) {
			frontOfList = frontOfListValue;
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
 
		public Node getfrontOfList() {
			return frontOfList;
		}
 
		public void setfrontOfList(Node frontOfListValue) {
			frontOfList = frontOfListValue;
		}
 
	}
}
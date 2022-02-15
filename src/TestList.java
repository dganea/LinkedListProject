public class TestList {
	public static MyLL theLL;
 
	public static void main(String[] args) {

		MyLL theLL = new MyLL();


		// initialize students
		StudentInfo beter = new StudentInfo(1,"Peter","Lu");
		theLL.addToRear(beter);

		StudentInfo ron = new StudentInfo(2,"Ron","Weasley");
		theLL.addToRear(ron);

		StudentInfo hermione = new StudentInfo(3,"Hermione","Granger");
		theLL.addToRear(hermione);

		StudentInfo neville = new StudentInfo(4,"Neville","Longbottom");
		theLL.addToRear(neville);

		StudentInfo luna = new StudentInfo(5,"Luna","Lovegood");
		theLL.addToRear(luna);
 
		// add more elements to LinkedList
	
		
		/*
		 * Please note that primitive values can not be added into LinkedList directly. They must be converted to their
		 * corresponding wrapper class.
		 */
 
		System.out.println("Print: theLL: \n" + theLL);
		System.out.println("Student List Size: \t\t\t\t" + theLL.size());
		//System.out.println(".get(3): \t\t\t\t" + theLL.get(3) + " (get element at index:3 - list starts from 0)");
		System.out.println(".remove(2): \t\t\t\t" + theLL.remove(2) + " (element removed)");
		//System.out.println(".get(3): \t\t\t\t" + theLL.get(3) + " (get element at index:3 - list starts from 0)");
		//System.out.println(".size(): \t\t\t\t" + theLL.size());
		System.out.println("Print again: theLL: \n" + theLL);
	}
 
}
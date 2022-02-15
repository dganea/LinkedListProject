public class TestList {
	public static MyLL studentList;
 
	public static void main(String[] args) {
 
		// Default constructor - let's put "0" into head element.
		studentList = new MyLL();


		// initialize students
		StudentInfo harry = new StudentInfo(1,"Harry","Potter");
		StudentInfo ron = new StudentInfo(2,"Ron","Weasley");
		StudentInfo hermione = new StudentInfo(3,"Hermione","Granger");
		StudentInfo neville = new StudentInfo(4,"Neville","Longbottom");
		StudentInfo luna = new StudentInfo(5,"Luna","Lovegood");
 
		// add more elements to LinkedList
		studentList.addToRear(harry);
		studentList.addToRear(ron);
		studentList.addToRear(hermione);
		studentList.addToRear(neville);
		studentList.addToRear(luna);
 
		/*
		 * Please note that primitive values can not be added into LinkedList directly. They must be converted to their
		 * corresponding wrapper class.
		 */
 
		System.out.println("Print: studentList: \n" + studentList);
		System.out.println("Student List Size: \t\t\t\t" + studentList.size());
		//System.out.println(".get(3): \t\t\t\t" + studentList.get(3) + " (get element at index:3 - list starts from 0)");
		System.out.println(".remove(2): \t\t\t\t" + studentList.remove(2) + " (element removed)");
		//System.out.println(".get(3): \t\t\t\t" + studentList.get(3) + " (get element at index:3 - list starts from 0)");
		//System.out.println(".size(): \t\t\t\t" + studentList.size());
		System.out.println("Print again: studentList: \n" + studentList);
	}
 
}
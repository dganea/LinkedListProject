public class TestList {
	public static MyLL theLL;
 
	public static void main(String[] args) {

		MyLL theLL = new MyLL();

		StudentInfo someStudent;

		// initialize students
		someStudent = new StudentInfo(111111,"Daffy","Duck", 150.0, 56.0);
		theLL.addToFront(someStudent);

		someStudent = new StudentInfo(222222,"Elmer","Fudd", 160.0, 48.0);
		theLL.addToFront(someStudent);

		someStudent = new StudentInfo(333333,"Lola","Bunny", 200.0, 78.0);
		theLL.addToFront(someStudent);

		someStudent = new StudentInfo(4,"Archish","Sadeesh", 150.0, 108.0);
		theLL.addToFront(someStudent);

		someStudent = new StudentInfo(5,"Oliver","Wang", 160.0, 28.0);
		theLL.addToFront(someStudent);

		someStudent = new StudentInfo(6,"Abhinav","Balasubramanian", 190.0, 78.0);
		theLL.addToFront(someStudent);
		
		/*
		 * Please note that primitive values can not be added into LinkedList directly. They must be converted to their
		 * corresponding wrapper class.
		 */
	}
 
}
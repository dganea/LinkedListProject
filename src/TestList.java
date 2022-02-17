public class TestList {
	public static MyLL theLL;
 
	public static void main(String[] args) {

		MyLL theLL = new MyLL();

		StudentInfo someStudent;
		StudentInfo removedStudent;
		theLL.displayList();

		// initialize students
		someStudent = new StudentInfo(111111,"Daffy","Duck", 150.0, 56.0);
		theLL.addToFront(someStudent);
		theLL.displayList();

		someStudent = new StudentInfo(222222,"Elmer","Fudd", 160.0, 48.0);
		theLL.addToFront(someStudent);
		theLL.displayList();

		someStudent = new StudentInfo(333333,"Lola","Bunny", 200.0, 78.0);
		theLL.addToFront(someStudent);
		theLL.displayList();

		someStudent = new StudentInfo(444444,"Archish","Sadeesh", 150.0, 108.0);
		theLL.addToFront(someStudent);
		theLL.displayList();

		someStudent = new StudentInfo(555555,"Oliver","Wang", 160.0, 28.0);
		theLL.addToFront(someStudent);
		theLL.displayList();

		someStudent = new StudentInfo(666666,"Abhinav","Balasubramanian", 190.0, 78.0);
		theLL.addToRear(someStudent);
		theLL.displayList();
		
		removedStudent = theLL.removeFromFront();
		if (removedStudent == null) {
			System.out.println("\nTried to remove from an empty list.");
		}
		else {
			System.out.println("\nRemoved " + removedStudent.firstName + " from the front of the list.");
			theLL.displayList();
		}
	}
 
}
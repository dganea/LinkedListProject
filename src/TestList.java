public class TestList {
	public static MyLL theLL;
 
	public static void main(String[] args) {

		MyLL theLL = new MyLL();

		StudentInfo someStudent;
		StudentInfo removedStudent;
		theLL.displayList();

		// initialize students
		someStudent = new StudentInfo(111111,"Alice","Amber", 150.0, 56.0);
		theLL.addToFront(someStudent);
		//theLL.displayList();

		someStudent = new StudentInfo(222222,"Bob","Bart", 160.0, 48.0);
		theLL.addToFront(someStudent);
		//theLL.displayList();

		someStudent = new StudentInfo(333333,"Charlie","Chaplin", 200.0, 78.0);
		theLL.addToFront(someStudent);
		//theLL.displayList();

		someStudent = new StudentInfo(444444,"Dan","Dean", 150.0, 108.0);
		theLL.addToFront(someStudent);
		//theLL.displayList();

		someStudent = new StudentInfo(555555,"Emma","East", 160.0, 28.0);
		theLL.addToFront(someStudent);
		//theLL.displayList();

		someStudent = new StudentInfo(666666,"Frank","Flores", 190.0, 78.0);
		theLL.addToRear(someStudent);
		theLL.displayList();
		
		if (theLL.isListEmpty()) {
			System.out.println("\nTried to remove from an empty list.");
		}
		else {
			removedStudent = theLL.removeFromFront();
			System.out.println("\nRemoved " + removedStudent.firstName + " from the front of the list.");
			theLL.displayList();

			removedStudent = theLL.removeFromRear();
			System.out.println("\nRemoved " + removedStudent.firstName + " from the rear of the list.");
			theLL.displayList();

		}
	}
 
}
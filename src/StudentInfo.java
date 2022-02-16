public class StudentInfo {
    
    // Instance Variables
    public int studentNum;
    public String firstName;
    public String lastName;
    public double height;
    public double weight;
    public StudentInfo next;

    // Constructor Declaration of Class
    public StudentInfo(int studentNum, String firstName, String lastName, double height, double weight) {
        this.studentNum = studentNum;
        this.firstName = firstName;
        this.lastName = lastName;
        this.height = height;
        this.weight = weight;
        next = null; // Don't point to another student
    }


    // getter and setter methods for student number
    public int getStudentNum()
    {
        return studentNum;
    }
    
    public void setStudentNum(int internalStudentNum) {
        if (internalStudentNum >= 0) {
            studentNum = internalStudentNum;
        }
        else {
            studentNum = 0;
            System.out.println("\nYou cannot a negative student number; defaulting to 0.");
        }
    }
 
    // getter and setter methods for first name
    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // getter and setter methods for last name
    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    @Override
    public String toString()
    {
        return("Student number: "+ this.getStudentNum()+
               ";\nStudent Full Name: " +
               this.getFirstName()+" " + this.getLastName());
    }


}

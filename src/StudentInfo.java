public class StudentInfo {
        // Instance Variables
        public int studentNum;
        public String firstName;
        public String lastName;
        public StudentInfo next;

    // Constructor Declaration of Class
    public StudentInfo(int studentNum, String firstName,
                   String lastName)
    {
        this.studentNum = studentNum;
        this.firstName = firstName;
        this.lastName = lastName;
        this.next = null;
    }


    // method 1
    public int getStudentNum()
    {
        return studentNum;
    }
 
    // method 2
    public String getFirstName()
    {
        return firstName;
    }
 
    // method 3
    public String getLastName()
    {
        return lastName;
    }


    @Override
    public String toString()
    {
        return("Student number: "+ this.getStudentNum()+
               ";\nStudent Full Name: " +
               this.getFirstName()+" " + this.getLastName());
    }


}

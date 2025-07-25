package Static;

import java.util.Calendar;

class Student
{
    private static int count = 10;
    private String name;
    private String dept;
    private String roll;
    
    // Depricated
    //java.util.Date d  = new Date();
    //d.getYear();
    // CAN'T USE

    private String generateRollNo(String dept)
    {
        java.util.Calendar cal = java.util.Calendar.getInstance();
        String d3 = "UNIV" + cal.get(Calendar.YEAR) + dept + count;
        count++;
        return d3;
    }

    public Student() 
    {
        name = "NA";
        dept = "NA";
        roll = generateRollNo(dept);
    }

    public Student(String name,String dept) 
    {
        this.name = name;
        this.dept = dept;
        roll = generateRollNo(dept);
    }

    void display()
    {
        System.out.println("name = "+name + "\n Roll = "+ roll + "\n  Dept = "+ dept);
    }
}

public class StudentRoll {
    public static void main(String[] args) 
    {
        Student S1 = new Student("Ram","CS");
        Student S2 = new Student("Jack","ME"); 
        Student S3 = new Student("Gyan","CV");
        Student S4 = new Student("Myan","EE");  

        S1.display();
        S2.display();
        S3.display();
        S4.display();
    }
}

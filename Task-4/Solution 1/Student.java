
import jdk.dynalink.NamedOperation;

public class Student {
    int rollno;
    String name;
    int age;
    String course;

    public Student() {

    }
    public Student(int rollno, String name, int age, String course) throws AgeNotWithinRangeException, NameNotValidException {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
        this.course = course;

        if(age < 15 || age > 21) {
            throw new AgeNotWithinRangeException("AgeNotWithinRangeException: Age not allowed");

        } else if(!name.matches("[a-zA-Z]+")) {
            throw new NameNotValidException("NameNotValidException: Name not allowed");

        }
    }

    public void display() {
        System.out.println("Roll Number: "+ rollno);
        System.out.println("Name: "+ name);
        System.out.println("Age: "+ age);
        System.out.println("Course: "+ course);

    }

}

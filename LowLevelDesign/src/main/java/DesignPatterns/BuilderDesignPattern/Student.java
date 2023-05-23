package DesignPatterns.BuilderDesignPattern;

/**
 * @author niranjanjoglekar on 23/05/23
 */
public class Student {

    int rollNumber;
    int age;
    String name;

    public Student(StudentBuilder builder){
        this.rollNumber = builder.rollNumber;
        this.age = builder.age;
        this.name = builder.name;
    }

    public String toString(){
        return "" + " Roll number : " + this.rollNumber +
                "Age : " + this.age+
                "Name : " + this.name;
    }
}

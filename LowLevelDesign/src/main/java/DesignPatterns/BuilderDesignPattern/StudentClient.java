package DesignPatterns.BuilderDesignPattern;

/**
 * @author niranjanjoglekar on 24/05/23
 */
public class StudentClient {

    public static void main(String[] args) {
        StudentDirector director = new StudentDirector(new EngineeringStudentBuilder());
        Student student = director.createStudent();
        System.out.println(student.toString());

        director = new StudentDirector(new MBAStudentBuilder());
        student = director.createStudent();
        System.out.println(student.toString());
    }
}

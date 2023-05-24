package DesignPatterns.BuilderDesignPattern;

/**
 * @author niranjanjoglekar on 24/05/23
 */
public class StudentDirector {
    StudentBuilder studentBuilder;

    StudentDirector(StudentBuilder studentBuilder){
        this.studentBuilder = studentBuilder;
    }

    public Student createStudent(){
        if(studentBuilder instanceof MBAStudentBuilder){
            return createMBAStudent();
        }
        if(studentBuilder instanceof EngineeringStudentBuilder){
            return createEngineerStudent();
        }
        return null;
    }

    private Student createMBAStudent(){
        return studentBuilder.setName("Ram")
                .setRollNumber(1)
                .setStreamType("MBA")
                .setAge(30)
                .build();
    }

    private Student createEngineerStudent(){
        return studentBuilder.setName("Shyam")
                .setRollNumber(2)
                .setStreamType("Engineering")
                .setAge(28)
                .build();
    }
}

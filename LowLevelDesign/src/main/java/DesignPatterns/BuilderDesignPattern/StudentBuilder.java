package DesignPatterns.BuilderDesignPattern;

/**
 * @author niranjanjoglekar on 23/05/23
 */
public abstract class StudentBuilder {
    int rollNumber;
    int age;
    String name;
    String streamType;

    public StudentBuilder setRollNumber(int rollNumber){
        this.rollNumber = rollNumber;
        return this;
    }

    public StudentBuilder setAge(int age){
        this.age = age;
        return this;
    }

    public StudentBuilder setName(String name){
        this.name = name;
        return  this;
    }

    public StudentBuilder setStreamType(String name){
        this.streamType  = name;
        return this;
    }

    public Student build(){
        return new Student(this);
    }
}

package DesignPatterns.BuilderDesignPattern;

/**
 * @author niranjanjoglekar on 24/05/23
 */
public class MBAStudentBuilder extends StudentBuilder{

    @Override
    public StudentBuilder setStreamType(String name){
        this.streamType = name;
        return this;
    }
}

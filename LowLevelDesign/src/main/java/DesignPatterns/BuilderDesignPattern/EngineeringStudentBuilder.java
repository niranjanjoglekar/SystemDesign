package DesignPatterns.BuilderDesignPattern;

/**
 * @author niranjanjoglekar on 24/05/23
 */
public class EngineeringStudentBuilder extends StudentBuilder{

    @Override
    public StudentBuilder setStreamType(String streamType){
        this.streamType = streamType;
        return this;
    }
}

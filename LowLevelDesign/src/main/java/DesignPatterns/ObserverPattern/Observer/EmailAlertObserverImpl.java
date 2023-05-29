package DesignPatterns.ObserverPattern.Observer;

import DesignPatterns.ObserverPattern.Observable.WeatherObservable;

/**
 * @author niranjanjoglekar on 28/05/23
 */
public class EmailAlertObserverImpl implements WeatherObserver{
    private float temperature;
    private WeatherObservable weatherObservable;

    public EmailAlertObserverImpl(WeatherObservable weatherObservable){
        this.weatherObservable = weatherObservable;
    }
    @Override
    public void update(float temperature) {
        this.temperature = temperature;
        sendMail();
    }

    public void sendMail(){
        System.out.println("Current Temperature : "+temperature);
    }
}

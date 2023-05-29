package DesignPatterns.ObserverPattern.Observer;

import DesignPatterns.ObserverPattern.Observable.WeatherObservable;
import DesignPatterns.ObserverPattern.Observable.WeatherObservableImpl;

/**
 * @author niranjanjoglekar on 29/05/23
 */
public class MobilePushObserverImpl implements WeatherObserver{

    private float temperature;
    private WeatherObservable observable;

    public MobilePushObserverImpl(WeatherObservable observable){
        this.observable = observable;
    }
    @Override
    public void update(float temperature) {
        this.temperature = temperature;
        pushNotificationToMobile();
    }

    public void pushNotificationToMobile(){
        System.out.println("Mobile Notification --> Current Temperature : "+temperature);
    }
}

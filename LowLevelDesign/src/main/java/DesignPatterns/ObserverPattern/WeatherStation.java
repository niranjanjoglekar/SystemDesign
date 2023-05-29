package DesignPatterns.ObserverPattern;

import DesignPatterns.ObserverPattern.Observable.WeatherObservable;
import DesignPatterns.ObserverPattern.Observable.WeatherObservableImpl;
import DesignPatterns.ObserverPattern.Observer.EmailAlertObserverImpl;
import DesignPatterns.ObserverPattern.Observer.MobilePushObserverImpl;
import DesignPatterns.ObserverPattern.Observer.WeatherObserver;

/**
 * @author niranjanjoglekar on 29/05/23
 */
public class WeatherStation {

    public static void main(String[] args) {

        // First create Observable
        WeatherObservable weatherObservable = new WeatherObservableImpl();

        // Create Observer watching Observable
        WeatherObserver emailAlertObserver = new EmailAlertObserverImpl(weatherObservable);
        WeatherObserver mobilePushObserver = new MobilePushObserverImpl(weatherObservable);

        // Register observer
        weatherObservable.registerObserver(emailAlertObserver);
        weatherObservable.registerObserver(mobilePushObserver);

        // Change weather
        weatherObservable.setWeather(20);
        weatherObservable.setWeather(30);

        // Remove mobileObserver
        weatherObservable.removeObserver(mobilePushObserver);

        // This should send mobilePushNotification
        weatherObservable.setWeather(20);
    }
}

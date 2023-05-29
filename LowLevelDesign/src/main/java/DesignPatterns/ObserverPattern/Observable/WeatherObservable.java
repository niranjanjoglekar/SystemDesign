package DesignPatterns.ObserverPattern.Observable;

import DesignPatterns.ObserverPattern.Observer.WeatherObserver;

/**
 * @author niranjanjoglekar on 28/05/23
 */
public interface WeatherObservable {

    void registerObserver(WeatherObserver observer);

    void removeObserver(WeatherObserver observer);

    void notifyObserver();

    void setWeather(float temperature);
}

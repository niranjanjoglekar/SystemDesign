package DesignPatterns.ObserverPattern.Observable;

import DesignPatterns.ObserverPattern.Observer.WeatherObserver;
import java.util.ArrayList;
import java.util.List;

/**
 * @author niranjanjoglekar on 29/05/23
 */
public class WeatherObservableImpl implements WeatherObservable{

    private float temperature;
    List<WeatherObserver> observerList = new ArrayList<>();

    @Override
    public void registerObserver(WeatherObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(WeatherObserver observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObserver() {

        for(WeatherObserver observer : observerList){
            observer.update(temperature);
        }
    }

    public void weatherChanged(){
        notifyObserver();
    }

    public void setWeather(float temperature){
        this.temperature = temperature;
        weatherChanged();
    }
}

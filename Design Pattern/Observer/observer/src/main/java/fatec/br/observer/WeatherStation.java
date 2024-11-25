package fatec.br.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation {
    private Double temperature;
    private List<Observer> observers = new ArrayList<>();

    public void addObservers(Observer observer){
        this.observers.add(observer);
    }

    public void setTemperature(Double temperature){
        this.temperature = temperature;
        notifyObservers();
    }

    public void notifyObservers(){
        for(Observer observer : observers){
            observer.update(temperature);
        }
    }
    
}

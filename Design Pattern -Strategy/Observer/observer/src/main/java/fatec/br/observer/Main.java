package fatec.br.observer;

public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        weatherStation.addObservers(new Phone());
        weatherStation.addObservers(new Computer());

        weatherStation.setTemperature(20.0);
        weatherStation.setTemperature(30.9);
    }
}
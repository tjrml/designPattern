package observer;

import observer.code.*;

public class ObserverMain {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData(); // WeatherData 객체를 생성

        // 3개의 디스플레이를 생성하고 WeatherData 객체를 인자로 전달
        DisplayElement currentDisplay = new CurrentConditionsDisplay(weatherData);
        DisplayElement statisticsDisplay = new StatisticsDisplay(weatherData);
        DisplayElement forecastDisplay = new ForecastDisplay(weatherData);


        // 새로운 기상 측정 값이 들어왔다고 가정
        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}

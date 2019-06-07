/*
 * Napisz program, który wyświetli trzy różne zdania opisujące aktualną pogodę. W czwartej linii wypisz sumaryczną długość trzech poprzednich zdań.
 */
package pogoda;

public class Weather {

    public static void main(String[] args) {
        
        String winterWeather = "Snow is falling in winter";
        String summerWeather = "In the Summer the sun is shining";
        String autumnWeather = "It is raining in the autumn";
        
        int winterWeatherLength = winterWeather.length();
        int summerWeatherLength = summerWeather.length();
        int autumnWeatherLength = autumnWeather.length();
        int allSentenceLength = winterWeatherLength + autumnWeatherLength + summerWeatherLength;
        
        System.out.println("winterWeatherLength is " + winterWeatherLength + " characters");
        System.out.println("summerWeatherLength is " + summerWeatherLength + " characters");
        System.out.println("autumnWeatherLength is " + autumnWeatherLength + " characters");
        System.out.println("allSentenceLength is " + allSentenceLength + " characters");
    }
    
}

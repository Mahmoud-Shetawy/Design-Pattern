package Adapter.Aft_Use;

public class ThirdPartyWeatherService {
    public String getTemperature(String city,String country){
        System.out.println("Fetching temperature Data...");
        return "Temperature Data return in XML Format";
    }
}

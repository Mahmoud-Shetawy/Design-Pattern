package Adapter.Aft_Use;

public class LegacyWeatherService {
private ThirdPartyWeatherService weatherServiceApi;

    public LegacyWeatherService(ThirdPartyWeatherService weatherService) {
        this.weatherServiceApi = weatherService;
    }

    public String getTemperature(String city,String country){
        return  weatherServiceApi.getTemperature(city,country);
    }

}

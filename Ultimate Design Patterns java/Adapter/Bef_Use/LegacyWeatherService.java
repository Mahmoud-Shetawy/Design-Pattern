package Adapter.Bef_Use;

public class LegacyWeatherService {
private ThirdPartyWeatherService weatherServiceApi;

    public LegacyWeatherService(ThirdPartyWeatherService weatherService) {
        this.weatherServiceApi = weatherService;
    }

    public String getTemperature(String city,String country){
        return  weatherServiceApi.getTemperature(city,country);
    }

    public TemperatureData getTemperature(double longitude, double latitude) {
//        String city = getCity(latitude,longitude);
//        String country = getCountry(latitude,longitude);
        String temperatureDataXML = getTemperature(getCity(latitude,longitude),getCountry(latitude,longitude));

        return convertXMLDataToJson(temperatureDataXML);
    }

    private TemperatureData convertXMLDataToJson(String xmlData){
        System.out.println("Converting........");
        return new TemperatureData("converted data from XML to Json");
    }
    private String getCity(double longitude, double latitude) {
        System.out.println("Extract city of longitude: "+longitude+" and latitude: "+latitude);
        return "City";
    }
    private String getCountry(double longitude, double latitude) {
        System.out.println("Extract country of longitude: "+longitude+" and latitude: "+latitude);
        return "Country";
    }
}

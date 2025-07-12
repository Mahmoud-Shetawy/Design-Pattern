package Adapter.Aft_Use;

public class WeatherServiceAdaptee implements WeatherServiceAdapter {
  private  LegacyWeatherService  legacyWeatherService;

    public WeatherServiceAdaptee(LegacyWeatherService legacyWeatherService) {
        this.legacyWeatherService = legacyWeatherService;
    }

    @Override
      public TemperatureData getTemperatureData(double longitude, double latitude) {

        String temperatureDataXML = legacyWeatherService.getTemperature(getCity(latitude,longitude),getCountry(latitude,longitude));

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

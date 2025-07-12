//import observer.afterUseObserver.*;
//import strategy.Before_Using_Strategy.*;

import Adapter.Aft_Use.LegacyWeatherService;
import Adapter.Aft_Use.TemperatureData;
import Adapter.Aft_Use.ThirdPartyWeatherService;
import Adapter.Aft_Use.WeatherServiceAdaptee;
import Iterator.Bef_Use.EmployeeHierarchyCollection;
import Memento.After_Use.History;
import Memento.After_Use.TextEditor;
import Memento.After_Use.TextEditorState;
import strategy.After_Using_Strategy.*;

import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {



/// Bef_Use_Adapter
        /*ThirdPartyWeatherService  weatherService = new ThirdPartyWeatherService();
        LegacyWeatherService legacyWeatherService = new LegacyWeatherService(weatherService);
        TemperatureData result = legacyWeatherService.getTemperature(112,1212);
        System.out.println(result);*/
/// Aft_Use_Adapter
        ThirdPartyWeatherService weatherService = new ThirdPartyWeatherService();
        LegacyWeatherService legacyWeatherService = new LegacyWeatherService(weatherService);
        WeatherServiceAdaptee  weatherServiceAdaptee = new WeatherServiceAdaptee(legacyWeatherService);
        TemperatureData result = weatherServiceAdaptee.getTemperatureData(112,1212);
        System.out.println(result.getTemperatureData());

    }
}
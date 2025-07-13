import bridge.Aft_Use.HDVideoQuality;
import bridge.Aft_Use.SDVideoQuality;
import bridge.Aft_Use.TwitchVideoProvider;
import bridge.Aft_Use.YouTubeVideoProvider;

public class Main {
    public static void main(String[] args) {



/// Bef_Use_Adapter
/*        YouTubeVideoProvider videoProvider = new YouTubeVideoProvider();
        videoProvider.PlayBack("https://www.youtube.com");
        SDVideoQuality videoQuality = new SDVideoQuality();
        videoQuality.Render();
        TwitchVideoProvider twitchProvider = new TwitchVideoProvider();
        HDVideoQuality hdVideoQuality = new HDVideoQuality();
        twitchProvider.PlayBack("https://www.youtube.com");
        hdVideoQuality.Render();*/
/// Aft_Use_Adapter
        YouTubeVideoProvider videoProvider = new YouTubeVideoProvider(new SDVideoQuality());
        videoProvider.PlayBack("https://www.youtube.com");

        TwitchVideoProvider twitchProvider = new TwitchVideoProvider(new HDVideoQuality());
        twitchProvider.PlayBack("https://www.youtube.com");

    }
}
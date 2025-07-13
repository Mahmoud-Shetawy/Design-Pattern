package bridge.Bef_Use;

public class TwitchVideoProvider extends VideoProvider {

    @Override
  public void PlayBack(String videoURL) {
        System.out.println("Twitch watching Video "+videoURL);
    }
}

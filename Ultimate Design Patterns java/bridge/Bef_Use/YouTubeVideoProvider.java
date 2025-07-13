package bridge.Bef_Use;

public class YouTubeVideoProvider extends VideoProvider {
    @Override
   public void PlayBack(String videoURL) {
        System.out.println("YouTube watching Video "+videoURL);
    }
}

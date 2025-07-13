package bridge.Aft_Use;

public class TwitchVideoProvider extends VideoProvider {
private VideoQuality videoQuality;

    public TwitchVideoProvider(VideoQuality videoQuality) {
        this.videoQuality = videoQuality;
    }

    @Override
  public void PlayBack(String videoURL) {
        videoQuality.Render();
        System.out.println("Twitch watching Video "+videoURL);
    }
}

package bridge.Aft_Use;

public class YouTubeVideoProvider extends VideoProvider {
    private VideoQuality videoQuality;

    public YouTubeVideoProvider(VideoQuality videoQuality) {
        this.videoQuality = videoQuality;
    }

    @Override
   public void PlayBack(String videoURL)
    {
        videoQuality.Render();
        System.out.println("YouTube watching Video "+videoURL);
    }
}

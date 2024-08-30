public class YouTube extends Video {
    public YouTube(VideoProcessor processor) {
        super(processor);
    }

    @Override
    public void play(String videoFile) {
        processor.process(videoFile);
    }
}
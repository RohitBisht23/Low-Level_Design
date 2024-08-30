public class Main {
    public static void main(String[] args) {
        Video youtubeVideo = new YouTube(new HDProcessor());

        youtubeVideo.play("abc.mp4");

        Video netflixVideo = new Netflix(new UltraHDProcessor());
        netflixVideo.play("abc.mp4");
    }
}

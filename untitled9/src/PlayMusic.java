import java.applet.AudioClip;
import java.net.MalformedURLException;
import java.net.URL;
import javax.swing.JApplet;

public class PlayMusic {
    public static AudioClip loadSound(String filename) {
        URL url = null;
        try {
            url = new URL("file:Get_Outside.wav");
        } catch (MalformedURLException e) {
            ;
        }
        return JApplet.newAudioClip(url);
    }

    public void play() {
        AudioClip christmas = loadSound("Get_Outside.wav");
        christmas.loop();
    }
}

package Snake_bkg_v4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javafx.scene.media.AudioClip;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

/**
 *
 * @author BOUKHEMERRA
 */
public class Mp3_File {
    
    static final AudioClip bar1Note = new AudioClip(Mp3_File.class.getResource("eating.mp3").toString());

    public void you_lose() {
        try {
            FileInputStream fis = new FileInputStream("eating.mp3");
            Player player = new Player(fis);
            player.play();
        } catch (FileNotFoundException | JavaLayerException e) {
        }
    }
    
    public void eat_sound() {
//        try {
//            FileInputStream fis = new FileInputStream("eating.mp3");
//            Player player = new Player(fis);
//            player.play();
//        } catch (FileNotFoundException | JavaLayerException e) {
//        }  
        bar1Note.play();
    }

}


import java.io.File;
import javafx.embed.swing.JFXPanel;
import javax.swing.JOptionPane;
import javafx.scene.media.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Faiz Ikhwan
 */
public class Music {
    
    public void musicPlay()
    {
        try{
            JFXPanel j = new JFXPanel();
            String uri = new File("GameSong.wav").toURI().toString();
            new MediaPlayer(new Media(uri)).play();
        }catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    
    }
    
}

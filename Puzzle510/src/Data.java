
import java.io.FileInputStream;
import java.io.IOException;
import sun.audio.AudioData;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;
import sun.audio.ContinuousAudioDataStream;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shah & Ikhwan
 */
public class Data {
    public String[] Ship={"French Ship","Greek Ship","Brazilian Ship",
                          "English Ship","Spanish Ship"};
    public String[] Content={"Tea","Coffee","Cocoa","Rice","Corn"};
    public String[] Arrival={"5.00am","6.00pm","8.00pm","9.00pm","7.00pm"};
    public String[] Chimney={"Blue","Red","Black","White","Green"};
    public String[] Destination={"Genoa","Hamburg","Manila","Marseille","Port Said"};
    public String[] Picture={"FrenchShip.png","GreekShip.png","BrazilianShip.png",
                             "EnglishShip.png","SpanishShip.png"};
    
    public void music() // music
    {
        AudioPlayer MGP = AudioPlayer.player;
        AudioStream BGM;
        AudioData MD;
        ContinuousAudioDataStream loop = null;
        try
        {
            BGM = new AudioStream(new FileInputStream("/GameSong.wav"));
            MD = BGM.getData();
            loop = new ContinuousAudioDataStream(MD);
        }catch(IOException error) {
            }
        MGP.start(loop);
    }
}





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
    
    public String Ship;
    public String Content;
    public String Arrival;
    public String Chimney;
    public String Destination;
    public String Picture;
    
    public Data(){
        
            Ship="null";
            Content="null";
            Arrival="null";
            Chimney="null";
            Destination="null";
            Picture="null";
    }
    
    public Data(String s,String c,String a,String h,String d,String p){
        Ship=s;
        Content=c;
        Arrival=a;
        Chimney=h;
        Destination=d;
        Picture=p;
    }
      
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

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
public class MusicMain{
   static MusicCatalog mc;

  public static void main(String[] args) {
        mc = readfile("E:\\challenges\\challenge-36\\data\\music-catalog.csv");
        mc.sort();
        System.out.println("--------------------------forward---------------------------------");
        mc.ShowMusicCatalog(direction.FORWARD);
        System.out.println("--------------------------backward---------------------------------");
        mc.ShowMusicCatalog1(direction.REVERSE);
        Scanner sc=new Scanner(System.in);
        System.out.println("enter artist name or song name or genre");
        String name=sc.nextLine();
        mc.findartistalbum(name);
        
      
    }
   
    private static MusicCatalog readfile(String filename)  {
        MusicCatalog m=new MusicCatalog();
        String line;
        try(BufferedReader br = new BufferedReader(new FileReader(filename))) {
            while ((line = br.readLine()) != null) {
                String data[] = line.split(", "); 
                MusicList ml=new MusicList();
                ml.setReleaseType(data[0]);
                ml.setArtist(data[1]);
                ml.setMusicItemName(data[2]);
                ml.setGenre(data[3]);
                ml.setYearofRelease(Integer.parseInt(data[4]));
                ml.setNumberofsongs(Integer.parseInt(data[5]));
                ml.setTotalPlayingTime(data[6]);
                
              m.insertAtEnd(ml);
             }
        }  catch (FileNotFoundException e) {
            e.printStackTrace();}
            catch (IOException e) {
            e.printStackTrace();
        }
       
        return m;
    }
  

}
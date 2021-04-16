import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class fileexampleio{

    static void readfile(String filename){
        try{
            BufferedReader br= new BufferedReader(new FileReader(filename));
            String line;
            while((line = br.readLine()) != null){
            System.out.println(line);
        }
    }
        catch(FileNotFoundException e){e.printStackTrace();}
        catch(IOException e){
            e.printStackTrace();
        }
        
    }
    public static void main(String[] args) {
        readfile("notes");
    }
}
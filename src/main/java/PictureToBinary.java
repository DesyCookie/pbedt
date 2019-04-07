import java.io.*;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.util.*;
public class PictureToBinary
{
    public static void main(String args[]) throws IOException{
        File file= new File("C:\\Users\\Desy\\Google Drive\\UNI\\FS19\\Algorithmen Projekt\\PBEDT\\src\\Test_row_1x100.jpg");
        BufferedImage image = ImageIO.read(file);
        Stack<Integer> r = new Stack<>();
        int a;
        // Getting pixel color by position x and y
        for(int y = 0; y <image.getHeight(); y++){
            for(int x = 0; x <image.getWidth(); x++){
        int clr=  image.getRGB(x,y);
        //System.out.println(clr); // -1 = white, -16777216 = black
        if(clr == -1){
            a = 1;
        }
        else{
            a=0;
        }
        r.push(a);
    }
}
System.out.println(r);    }
}
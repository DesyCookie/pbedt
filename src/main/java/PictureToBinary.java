import java.io.*;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.util.*;
public class PictureToBinary
{
    public static void main(String args[]) throws IOException{
        File file= new File("C:\\Users\\Desy\\Google Drive\\UNI\\FS19\\Algorithmen Projekt\\PBEDT\\src\\Test_row_1x100.jpg");
        BufferedImage image = ImageIO.read(file);
        Stack<TuplePoint> r = new Stack<>();
        TuplePoint a = new TuplePoint();
        // Getting pixel color by position x and y
        for(int y = 0; y <image.getHeight(); y++){
            for(int x = 0; x <image.getWidth(); x++){
        int clr=  image.getRGB(x,y);  // -1 = white, -16777216 = black
        if(clr == -1){
            a.value = 1;
            a.xcoordinate=x;
            a.ycoordninate=y;
        }
        else{
            a.value=0;
            a.xcoordinate=x;
            a.ycoordninate=y;
        }
        r.push(a);
    }
}
System.out.println(r);    }
}
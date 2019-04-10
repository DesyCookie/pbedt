import java.io.*;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.util.*;

import static javax.imageio.ImageIO.read;

public class PictureToBinary
{
    public static void main(String args[]) throws IOException{
        String path = PictureToBinary.class.getResource("Test_row_1x100.jpg").getFile();
        File file= new File(path);
        BufferedImage image = read(file);
        Stack<TuplePoint> r = new Stack<>();
        Stack<TuplePoint> n = new Stack<>();

        // Getting pixel color by position x and y
        for(int y = 0; y <image.getHeight(); y++){
            for(int x = 0; x <image.getWidth(); x++){
        int clr=  image.getRGB(x,y);  // -1 = white, -16777216 = black
        if(clr == -1){
            TuplePoint a = new TuplePoint(x,y,1);
            n.push(a);
            r.push(a);
        }
        else{
            TuplePoint a = new TuplePoint(x,y,0);
            r.push(a);
        }

    }
}
System.out.println(r);
        System.out.println(n);    }
}
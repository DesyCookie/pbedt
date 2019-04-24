import java.io.*;
import java.awt.image.BufferedImage;
import java.util.*;

import static javax.imageio.ImageIO.read;

public class PictureToBinary
{

    public static void main (String[] args){
        try {
            ConvertPicture("");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static Stack<TuplePoint> ConvertPicture (String args) throws IOException{
        //String path = PictureToBinary.class.getResource("Test_row_1x100.jpg").getFile();
        File file= new File(args);// orig: File file= new File(path); working: File file = new File("build/resources/main/Test_row_1x100.jpg");
        BufferedImage image = read(file);
        Stack<TuplePoint> r = new Stack<>(); //stack with all pixels
        Stack<TuplePoint> n = new Stack<>(); //stack with featurepoints

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
    return r;
    }
}
import junit.framework.TestCase;
import java.io.IOException;
import java.util.*;

public class UnitTests extends TestCase {


    public void testPictureToBinaryblack() {
        Stack<TuplePoint> testStack = new Stack<>(); //Test Stack to compare to, filled all black.
        for (int y = 0; y < 10; y++) {
            for (int x = 0; x < 10; x++) {
                TuplePoint a = new TuplePoint(x, y, 0);
                testStack.push(a);
            }
        }
        Stack<TuplePoint> allBlack = new Stack<>();
        try {
            allBlack = PictureToBinary.ConvertPicture("C:\\Users\\Désirée\\IdeaProjects\\pbedt\\src\\test\\resources\\Test_black.png");
        } catch (IOException e) {
            e.printStackTrace();
        }
        assertEquals(testStack, allBlack);
    }

    public void testPictureToBinarywhite() {
        Stack<TuplePoint> testStack = new Stack<>(); //Test Stack to compare to, filled all black.
        for (int y = 0; y < 10; y++) {
            for (int x = 0; x < 10; x++) {
                TuplePoint a = new TuplePoint(x, y, 1);
                testStack.push(a);
            }
        }
        Stack<TuplePoint> allWhite = new Stack<>();
        try {
            allWhite = PictureToBinary.ConvertPicture("C:\\Users\\Désirée\\IdeaProjects\\pbedt\\src\\test\\resources\\Test_white.png");
        } catch (IOException e) {
            e.printStackTrace();
        }
        assertEquals(testStack, allWhite);

    }

    public void testPictureToBinaryblackborder() {
        Stack<TuplePoint> testStack = new Stack<>(); //Test Stack to compare to, filled all black.
        for (int y = 0; y < 10; y++) {
            for (int x = 0; x < 10; x++) {
                if (x == 0 || x == 9) {
                    TuplePoint a = new TuplePoint(x, y, 0);
                    testStack.push(a);
                } else {
                    TuplePoint a = new TuplePoint(x, y, 1);
                    testStack.push(a);
                }
            }
        }
        Stack<TuplePoint> blackBorder = new Stack<>();
        try {
            blackBorder = PictureToBinary.ConvertPicture("C:\\Users\\Désirée\\IdeaProjects\\pbedt\\src\\test\\resources\\Test_black_border.png");
        } catch (IOException e) {
            e.printStackTrace();
        }
        assertEquals(testStack, blackBorder);

    }

    public void testPictureToBinarywhiteborder() {
        Stack<TuplePoint> testStack = new Stack<>(); //Test Stack to compare to, filled all black with white border.
        for (int y = 0; y < 10; y++) {
            for (int x = 0; x < 10; x++) {
                if (x == 0 || x == 9) {
                    TuplePoint a = new TuplePoint(x, y, 1);
                    testStack.push(a);
                } else {
                    TuplePoint a = new TuplePoint(x, y, 0);
                    testStack.push(a);
                }
            }
        }
        System.out.println(testStack);
        Stack<TuplePoint> whiteBorder = new Stack<>();
        try {
            whiteBorder = PictureToBinary.ConvertPicture("C:\\Users\\Désirée\\IdeaProjects\\pbedt\\src\\test\\resources\\Test_white_border.png");
        } catch (IOException e) {
            e.printStackTrace();
        }
        assertEquals(testStack, whiteBorder);
    }
}

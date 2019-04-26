import junit.framework.TestCase;
import java.io.IOException;
import java.util.*;

public class UnitTests extends TestCase {


    public void testPictureToBinaryblack() { //Tests PictureToBinary for an all black image.
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

    public void testPictureToBinarywhite() { //Tests PictureToBinary for an all white image.
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

    public void testPictureToBinaryblackborder() { //Tests PictureToBinary for an image with black border.
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
        } System.out.println(testStack);
        Stack<TuplePoint> blackBorder = new Stack<>();
        try {
            blackBorder = PictureToBinary.ConvertPicture("C:\\Users\\Désirée\\IdeaProjects\\pbedt\\src\\test\\resources\\Test_black_border.png");
        } catch (IOException e) {
            e.printStackTrace();
        }
        assertEquals(testStack, blackBorder);

    }

    public void testPictureToBinarywhiteborder() {//Tests PictureToBinary for an image with white border.
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

    public void testCFTRowblack(){ // tests CFT_Row for an all black image.
        Stack<TuplePoint> cftTest = new Stack<>();
        Stack<TuplePoint> cftTestblack = new Stack<>();
        try {
            cftTestblack = PictureToBinary.ConvertPicture("C:\\Users\\Désirée\\IdeaProjects\\pbedt\\src\\test\\resources\\Test_black.png");
        } catch (IOException e) {
            e.printStackTrace();
        }
        Stack<TuplePoint> a = CFT_Row.CFT_Row_algorithm(cftTest);
        Stack<TuplePoint> b = CFT_Row.CFT_Row_algorithm(cftTestblack);
        System.out.println(a);
        System.out.println(b);
        assertEquals(a,b);
    }

    public void testCFTRowwhite(){// tests CFT_Row for an all white image.
        Stack<TuplePoint> cftTest = new Stack<>();
        Stack<TuplePoint> cftTestwhite = new Stack<>();
        try {
            cftTestwhite = PictureToBinary.ConvertPicture("C:\\Users\\Désirée\\IdeaProjects\\pbedt\\src\\test\\resources\\Test_white.png");
        } catch (IOException e) {
            e.printStackTrace();
        }

        Stack<TuplePoint> a = CFT_Row.CFT_Row_algorithm(cftTest);
        Stack<TuplePoint> b = CFT_Row.CFT_Row_algorithm(cftTestwhite);
        System.out.println("a: "+a);System.out.println("b:" +b);

        assertEquals(a,b);
    }

    public void testCFTRowwhiteborder(){//Tests CFT Row for an image with white border.
        Stack<TuplePoint> cftTest = new Stack<>();
        Stack<TuplePoint> cftTestwhiteborder = new Stack<>();
        try {
            cftTestwhiteborder = PictureToBinary.ConvertPicture("C:\\Users\\Désirée\\IdeaProjects\\pbedt\\src\\test\\resources\\Test_white_border.png");
        } catch (IOException e) {
            e.printStackTrace();
        }
        Stack<TuplePoint> a = CFT_Row.CFT_Row_algorithm(cftTest);
        Stack<TuplePoint> b = CFT_Row.CFT_Row_algorithm(cftTestwhiteborder);
        System.out.println(a);System.out.println(b);
        assertEquals(a,b);
    }

    public void testCFTRowblackborder(){//Tests CFT Row for an image with black border.
        Stack<TuplePoint> cftTest = new Stack<>();
        Stack<TuplePoint> cftTestblack = new Stack<>();
        try {
            cftTestblack = PictureToBinary.ConvertPicture("C:\\Users\\Désirée\\IdeaProjects\\pbedt\\src\\test\\resources\\Test_black_border.png");
        } catch (IOException e) {
            e.printStackTrace();
        }
        Stack<TuplePoint> a = CFT_Row.CFT_Row_algorithm(cftTest);
        Stack<TuplePoint> b = CFT_Row.CFT_Row_algorithm(cftTestblack);
        assertEquals(a,b);
    }
}

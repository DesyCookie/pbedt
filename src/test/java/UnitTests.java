import junit.framework.TestCase;
import java.io.IOException;
import java.util.*;

public class UnitTests extends TestCase {


    /*┌─────────────────┐
      │ PictureToBinary │
      └─────────────────┘
     */


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

    /*┌─────────────────┐
      │     CFTRow      │
      └─────────────────┘
     */

    public void testCFTRowblack(){ // tests CFT_Row for an all black image.
        Stack<TuplePoint> cftTest = new Stack<>(); //empty stack, because no feature points in a black image.
        Stack<TuplePoint> cftTestblack = new Stack<>();
        try {
            cftTestblack = PictureToBinary.ConvertPicture("C:\\Users\\Désirée\\IdeaProjects\\pbedt\\src\\test\\resources\\Test_line_black.png");
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
        for(int i =9;i>3; i--){
            if(i<6||i>6) {
                TuplePoint a = new TuplePoint(i, 0, 1);
                cftTest.push(a);
            }
        }
        Stack<TuplePoint> cftTestwhite = new Stack<>();
        try {
            cftTestwhite = PictureToBinary.ConvertPicture("C:\\Users\\Désirée\\IdeaProjects\\pbedt\\src\\test\\resources\\Test_line_white.png");
        } catch (IOException e) {
            e.printStackTrace();
        }
        Stack<TuplePoint> b = CFT_Row.CFT_Row_algorithm(cftTestwhite);
        assertEquals(cftTest,b);
    }

    public void testCFTRowwhiteborder(){//Tests CFT Row for an image with white border.
        Stack<TuplePoint> cftTest = new Stack<>();
        TuplePoint x = new TuplePoint(49,0,1);
        cftTest.push(x);
        Stack<TuplePoint> cftTestwhiteborder = new Stack<>();
        try {
            cftTestwhiteborder = PictureToBinary.ConvertPicture("C:\\Users\\Désirée\\IdeaProjects\\pbedt\\src\\test\\resources\\Test_line_white_border.png");
        } catch (IOException e) {
            e.printStackTrace();
        }
        Stack<TuplePoint> b = CFT_Row.CFT_Row_algorithm(cftTestwhiteborder);
        assertEquals(cftTest,b);
    }

    public void testCFTRowblackborder(){//Tests CFT Row for an image with black border.
        Stack<TuplePoint> cftTest = new Stack<>();
        for(int i=48;i>42;i--){
            TuplePoint a = new TuplePoint(i,0,1);
            cftTest.push(a);
        }
        TuplePoint x = new TuplePoint(41,0,1);
        cftTest.push(x);
        TuplePoint y = new TuplePoint(40,0,1);
        cftTest.push(y);
        Stack<TuplePoint> cftTestBlackBorder = new Stack<>();
        try {
            cftTestBlackBorder = PictureToBinary.ConvertPicture("C:\\Users\\Désirée\\IdeaProjects\\pbedt\\src\\test\\resources\\Test_line_black_border.png");
        } catch (IOException e) {
            e.printStackTrace();
        }
        Stack<TuplePoint> b = CFT_Row.CFT_Row_algorithm(cftTestBlackBorder);
        assertEquals(cftTest,b);
    }


    public void testCFTRowRandom(){//Tests CFT Row for an image with black border.
        Stack<TuplePoint> cftTest = new Stack<>();
        TuplePoint y = new TuplePoint(86,0,1);
        cftTest.push(y);
        TuplePoint x = new TuplePoint(73,0,1);
        cftTest.push(x);
        Stack<TuplePoint> cftTestRand = new Stack<>();
        try {
            cftTestRand = PictureToBinary.ConvertPicture("C:\\Users\\Désirée\\IdeaProjects\\pbedt\\src\\test\\resources\\Test_line_random.png");
        } catch (IOException e) {
            e.printStackTrace();
        }
        Stack<TuplePoint> b = CFT_Row.CFT_Row_algorithm(cftTestRand);
        assertEquals(cftTest,b);
    }
}

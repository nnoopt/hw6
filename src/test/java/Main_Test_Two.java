import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Main_Test_Two {

    private Main mainTest;

    @BeforeEach
    public void prepare(){
        mainTest = new Main();
    }

    @Test
    public void test_two_empty(){
        Assertions.assertFalse(mainTest.two(new int[]{}));
    }

    @Test
    public void test_two_only(){
        Assertions.assertTrue(mainTest.two(new int[]{4,1,1,4}));
    }

    @Test
    public void test_two_notOnly(){
        Assertions.assertFalse(mainTest.two(new int[]{4,1,1,3}));
    }

    @Test
    public void test_two_without(){
        Assertions.assertFalse(mainTest.two(new int[]{2,3,3,2}));
    }

    @Test
    public void test_two_onlyOne(){
        Assertions.assertFalse(mainTest.two(new int[]{1,1,1,1}));
    }

    @Test
    public void test_two_notFour(){
        Assertions.assertFalse(mainTest.two(new int[]{4,4,4,3}));
    }

}

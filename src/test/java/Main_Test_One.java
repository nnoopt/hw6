import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Main_Test_One {
    private Main mainTest;

    @BeforeEach
    public void prepare(){
        mainTest = new Main();
    }

    @Test
    public void test_one_empty(){
        Assertions.assertThrows(RuntimeException.class, ()->{
            mainTest.one(new int[0]);
        });
    }

    @Test
    public  void test_withoutFour(){
        Assertions.assertThrows(RuntimeException.class, ()->{
            mainTest.one(new int [] {1,2,3});
        });
    }

    @Test
    public void test_one_fourNotLast(){
        int mass [] =  {7,6,5,4,3,2,1};
        Assertions.assertArrayEquals(new int[]{3,2,1}, mainTest.one(mass));
    }

    @Test
    public void test_one_someFour(){
        int [] mass = {1,2,3,4,5,6,7,8,9,4};
        Assertions.assertArrayEquals(new int[]{} , mainTest.one(mass));
    }
}

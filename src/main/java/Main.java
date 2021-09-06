import java.util.Arrays;

public class Main {

    public int [] one (int[] mass){
        for (int i  = mass.length -1; i>=0; i--){
            if (mass[i]==4){
                return Arrays.copyOfRange(mass, i+1, mass.length);
            }
        }
        throw new RuntimeException("Не верный массив");
    }

    public boolean two (int [] mass){
        boolean contains1 = false;
        boolean contains4 = false;

        for (int val : mass){
            switch (val){
                case 1:
                    contains1 = true;
                    break;
                case 4:
                    contains4 = true;
                    break;
                default:
                    return false;
            }
        }
        return contains1 && contains4;
    }
}

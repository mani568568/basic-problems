import com.m.g.arrays.ArrayProblems;
import org.junit.Test;

public class ArrayProblemsTest {


    ArrayProblems arrayProblems = new ArrayProblems();

    @Test
    public void testPrintPairsSumIsXUsingHash()
    {
        int[] arr = {1,4,3,2,6,5,7};
        int sum = 9;
        arrayProblems.printPairsSumIsXUsingHash(arr,sum);
    }
}

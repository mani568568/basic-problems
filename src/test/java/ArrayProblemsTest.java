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

    @Test
    public void testPrintPairSumXUsingSort()
    {
        int[] arr = {1,4,3,2,6,5,7};
        int sum = 9;
        arrayProblems.printPairSumXUsingSort(arr,sum);
    }

    @Test
    public void testCountDistinctPairsWithDifferenceX()
    {
        int[] arr = {1,4,3,2,6,5,7};
        int difference = 2;
       int result =  arrayProblems.countDistinctPairsWithDifferenceX(arr,difference);
        System.out.println(result);
    }
}

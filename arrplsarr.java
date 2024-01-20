import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

// TODO: Replace examples and use TDD development by writing your own tests

public class SolutionTest {
    @Test
    public void sampleTests() {
        assertEquals(21, Sum.arrayPlusArray(new int[]{1,2,3}, new int[]{4,5,6}));
        assertEquals(-21, Sum.arrayPlusArray(new int[]{-1,-2,-3}, new int[]{-4,-5,-6}));
        assertEquals(15, Sum.arrayPlusArray(new int[]{0,0,0}, new int[]{4,5,6}));
        assertEquals(2100, Sum.arrayPlusArray(new int[]{100,200,300}, new int[]{400,500,600}));
    }
}


public class Sum {

  public static int arrayPlusArray(int[] arr1, int[] arr2) {
      int sum1 = 0;
      int sum2 = 0;
      for(int i = 0;i < arr1.length;i++){
          sum1 += arr1[i];     
      }
      for(int i = 0;i < arr2.length;i++){
          sum2 += arr2[i];     
      }
    
    return sum1 + sum2;
  }

}

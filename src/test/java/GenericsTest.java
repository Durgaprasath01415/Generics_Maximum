import org.junit.Assert;
import org.junit.Test;

public class GenericsTest {
    GenericsMain genericsMain = new GenericsMain();
    @Test
    public void givenFirstNumber_whenFirstNumberMaximum_shouldReturnMaximum(){
        Integer max = GenericsMain.compareIntegerMaximum(6,4,2);
        Assert.assertEquals((Integer)6,max);
    }
    @Test
    public void givenFirstNumber_whenSecondNumberMaximum_shouldReturnMaximum(){
    Integer max = GenericsMain.compareIntegerMaximum(4,6,2);
        Assert.assertEquals((Integer)6,max);
    }
    @Test
    public void givenFirstNumber_whenThirdNumberMaximum_shouldReturnMaximum(){
        Integer max = GenericsMain.compareIntegerMaximum(2,4,6);
        Assert.assertEquals((Integer)6,max);
    }
}

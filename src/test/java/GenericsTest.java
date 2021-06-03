import org.junit.Assert;
import org.junit.Test;

public class GenericsTest {
    GenericsMain genericsMain = new GenericsMain();
    @Test
    public void givenIntegerNumber_whenFirstNumberMaximum_shouldReturnMaximum(){
        Integer max = GenericsMain.compareIntegerMaximum(6,4,2);
        Assert.assertEquals((Integer)6,max);
    }
    @Test
    public void givenIntegerNumber_whenSecondNumberMaximum_shouldReturnMaximum(){
    Integer max = GenericsMain.compareIntegerMaximum(4,6,2);
        Assert.assertEquals((Integer)6,max);
    }
    @Test
    public void givenIntegerNumber_whenThirdNumberMaximum_shouldReturnMaximum(){
        Integer max = GenericsMain.compareIntegerMaximum(2,4,6);
        Assert.assertEquals((Integer)6,max);
    }
    @Test
    public void givenFloatNumber_whenFirstNumberMaximum_shouldReturnMaximum(){
        Float max = GenericsMain.compareFloatMaximum(6.436f,4.21424f,2.0012f);
        Assert.assertEquals((Float)6.436f,max);
    }
    @Test
    public void givenFloatNumber_whenSecondNumberMaximum_shouldReturnMaximum(){
        Float max = GenericsMain.compareFloatMaximum(4.21424f,6.436f,2.0012f);
        Assert.assertEquals((Float)6.436f,max);
    }@Test
    public void givenFloatNumber_whenThirdNumberMaximum_shouldReturnMaximum(){
        Float max = GenericsMain.compareFloatMaximum(2.0012f,4.21424f,6.436f);
        Assert.assertEquals((Float)6.436f,max);
    }
    @Test
    public void givenString_whenFirstWord_shouldReturnMaximum(){
        String max = GenericsMain.compareStringMaximum("Peach","Banana","Apple");
        Assert.assertEquals("Peach", max);
    }
    @Test
    public void givenString_whenSecondWord_shouldReturnMaximum(){
        String max = GenericsMain.compareStringMaximum("Apple","Peach","Banana");
        Assert.assertEquals("Peach", max);
    }
    @Test
    public void givenString_whenThirdWord_shouldReturnMaximum(){
        String max = GenericsMain.compareStringMaximum("Apple","Banana","Peach");
        Assert.assertEquals("Peach", max);
    }
}

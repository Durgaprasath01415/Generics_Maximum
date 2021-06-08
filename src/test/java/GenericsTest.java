import org.junit.Assert;
import org.junit.Test;

public class GenericsTest {
    @Test
    public void givenIntegerNumber_whenFirstNumberMaximum_shouldReturnMaximum(){
        GenericsMain<Integer> genericsMain = new GenericsMain<>(6,4,2);
        Integer max = genericsMain.compareMaximum();
        Assert.assertEquals((Integer)6,max);
    }
    @Test
    public void givenIntegerNumber_whenSecondNumberMaximum_shouldReturnMaximum(){
        GenericsMain<Integer> genericsMain = new GenericsMain<>(4,6,2);
        Integer max = genericsMain.compareMaximum();
        Assert.assertEquals((Integer)6,max);
    }
    @Test
    public void givenIntegerNumber_whenThirdNumberMaximum_shouldReturnMaximum(){
        GenericsMain<Integer> genericsMain = new GenericsMain<>(2,4,6);
        Integer max = genericsMain.compareMaximum();
        Assert.assertEquals((Integer)6,max);
    }
    @Test
    public void givenFloatNumber_whenFirstNumberMaximum_shouldReturnMaximum(){
        GenericsMain<Float> genericsMain = new GenericsMain<>(6.436f,4.21424f,2.0012f);
        Float max = genericsMain.compareMaximum();
        Assert.assertEquals((Float) 6.436f,max);
    }
    @Test
    public void givenFloatNumber_whenSecondNumberMaximum_shouldReturnMaximum(){
        GenericsMain<Float> genericsMain = new GenericsMain<>(4.21424f,6.436f,2.0012f);
        Float max = genericsMain.compareMaximum();
        Assert.assertEquals((Float) 6.436f,max);
    }@Test
    public void givenFloatNumber_whenThirdNumberMaximum_shouldReturnMaximum(){
        GenericsMain<Float> genericsMain = new GenericsMain<>(2.0012f,4.21424f,6.436f);
        Float max = genericsMain.compareMaximum();
        Assert.assertEquals((Float) 6.436f,max);
    }
    @Test
    public void givenString_whenFirstWord_shouldReturnMaximum(){
        GenericsMain<String> genericsMain = new GenericsMain<>("Peach","Banana","Apple");
        String max = genericsMain.compareMaximum();
        Assert.assertEquals("Peach", max);
    }
    @Test
    public void givenString_whenSecondWord_shouldReturnMaximum(){
        GenericsMain<String> genericsMain = new GenericsMain<>("Banana","Peach","Apple");
        String max = genericsMain.compareMaximum();
        Assert.assertEquals("Peach", max);
    }
    @Test
    public void givenString_whenThirdWord_shouldReturnMaximum(){
        GenericsMain<String> genericsMain = new GenericsMain<>("Apple","Banana","Peach");
        String max = genericsMain.compareMaximum();
        Assert.assertEquals("Peach", max);
    }
}

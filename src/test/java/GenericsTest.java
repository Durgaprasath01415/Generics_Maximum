import org.junit.Assert;
import org.junit.Test;

public class GenericsTest {
    @Test
    public void givenIntegerNumber_whenFirstNumberMaximum_shouldReturnMaximum(){
        GenericsMain<Integer> genericsMain = new GenericsMain<>(6,4,2);
        Integer max = genericsMain.testMax();
        Assert.assertEquals((Integer)6,max);
    }
    @Test
    public void givenIntegerNumber_whenSecondNumberMaximum_shouldReturnMaximum(){
        GenericsMain<Integer> genericsMain = new GenericsMain<>(4,6,2);
        Integer max = genericsMain.testMax();
        Assert.assertEquals((Integer)6,max);
    }
    @Test
    public void givenIntegerNumber_whenThirdNumberMaximum_shouldReturnMaximum(){
        GenericsMain<Integer> genericsMain = new GenericsMain<>(2,4,6);
        Integer max = genericsMain.testMax();
        Assert.assertEquals((Integer)6,max);
    }
    @Test
    public void givenFloatNumber_whenFirstNumberMaximum_shouldReturnMaximum(){
        GenericsMain<Float> genericsMain = new GenericsMain<>(6.436f,4.21424f,2.0012f);
        Float max = genericsMain.testMax();
        Assert.assertEquals((Float) 6.436f,max);
    }
    @Test
    public void givenFloatNumber_whenSecondNumberMaximum_shouldReturnMaximum(){
        GenericsMain<Float> genericsMain = new GenericsMain<>(4.21424f,6.436f,2.0012f);
        Float max = genericsMain.testMax();
        Assert.assertEquals((Float) 6.436f,max);
    }@Test
    public void givenFloatNumber_whenThirdNumberMaximum_shouldReturnMaximum(){
        GenericsMain<Float> genericsMain = new GenericsMain<>(2.0012f,4.21424f,6.436f);
        Float max = genericsMain.testMax();
        Assert.assertEquals((Float) 6.436f,max);
    }
    @Test
    public void givenString_whenFirstWord_shouldReturnMaximum(){
        GenericsMain<String> genericsMain = new GenericsMain<>("Peach","Banana","Apple");
        String max = genericsMain.testMax();
        Assert.assertEquals("Peach", max);
    }
    @Test
    public void givenString_whenSecondWord_shouldReturnMaximum(){
        GenericsMain<String> genericsMain = new GenericsMain<>("Banana","Peach","Apple");
        String max = genericsMain.testMax();
        Assert.assertEquals("Peach", max);
    }
    @Test
    public void givenString_whenThirdWord_shouldReturnMaximum(){
        GenericsMain<String> genericsMain = new GenericsMain<>("Apple","Banana","Peach");
        String max = genericsMain.testMax();
        Assert.assertEquals("Peach", max);
    }
    @Test
    public void givenMultipleInt_shouldReturn_maxInt() {
        Assert.assertSame(40, new GenericsMain<>(10, 20, 30, 40).testMax());
    }

    @Test
    public void givenMultipleFloat_shouldReturn_maxFloat() {
        Assert.assertEquals((Float) 40.4485f, new GenericsMain<>(10.5423f, 20.48452f, 30.345f, 40.4485f).testMax());
    }

    @Test
    public void givenMultipleString_shouldReturn_maxString() {
        Assert.assertEquals("peach", new GenericsMain<>("peach", "banana", "apple", "coconut").testMax());
    }
}

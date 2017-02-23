import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by DeMarcj on 2/23/2017.
 */
public class TestPrimeTest {
    @Test
    public void test29(){
        Assert.assertEquals(29, TestPrime.primeNumber(10));
    }
    @Test
    public void test59(){
        Assert.assertEquals(59, TestPrime.primeNumber(17));
    }
    @Test
    public void test97(){
        Assert.assertEquals(97, TestPrime.primeNumber(25));

    }
    @Test
    public void test43(){
        Assert.assertEquals(43, TestPrime.primeNumber(14));

    }
    @Test
    public void test79(){
        Assert.assertEquals(79, TestPrime.primeNumber(22));

    }
}
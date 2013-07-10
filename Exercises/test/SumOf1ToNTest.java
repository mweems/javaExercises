import org.junit.Test;
import src.ListOf1ToN;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SumOf1ToNTest {

    @Test
    public void sumOfOneIsOne(){
        assertThat(new ListOf1ToN(1).list(), is(TestHelper.arrayContaining(1)));
    }

    @Test
    public void sumOfFiveIsFifteen(){
        assertThat(new ListOf1ToN(5).list(), is(TestHelper.arrayContaining(5, 4, 3, 2, 1)));
    }
}

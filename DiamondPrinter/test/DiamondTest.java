import org.junit.Test;
import src.Diamond;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class DiamondTest {

    @Test
    public void shouldMakeDiamondStringWithCenterCountOfOne(){
        assertThat(new Diamond(1).print(), is("*"));
    }

    @Test
    public void shouldMakeDiamondStringWithCenterCountOfTwo(){
        assertThat(new Diamond(2).print(), is("**"));
    }

    @Test
    public void shouldMakeDiamondStringWithCenterCountOfThree(){
        assertThat(new Diamond(2).print(), is(" *\n***\n *"));
    }

}

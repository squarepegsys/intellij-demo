import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * User: igen322
 * Date: 1/24/11
 * Time: 8:34 AM
 */
public class SillyWalksTest {

    @Test
    public void walkSilly() throws Exception {

        SillyWalk walkies = new SillyWalk("Egyptian");

        assertEquals("Egyptian",walkies.getType());

    }

}

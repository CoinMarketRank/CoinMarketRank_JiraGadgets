package ut.coinmarketrank;

import org.junit.Test;
import coinmarketrank.api.MyPluginComponent;
import coinmarketrank.impl.MyPluginComponentImpl;

import static org.junit.Assert.assertEquals;

public class MyComponentUnitTest
{
    @Test
    public void testMyName()
    {
        MyPluginComponent component = new MyPluginComponentImpl(null);
        assertEquals("names do not match!", "myComponent",component.getName());
    }
}
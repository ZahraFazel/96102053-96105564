package Prototype;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Tests
{
    @Test
    public void testPrototype()
    {
        ColorCache.loadCache();
        Color clonedColor = ColorCache.getColor("Blue");
        assertEquals("Blue", clonedColor.use());
        clonedColor = ColorCache.getColor("Green");
        assertEquals("Green", clonedColor.use());
        clonedColor = ColorCache.getColor("Red");
        assertEquals("Red", clonedColor.use());
        clonedColor = ColorCache.getColor("Yellow");
        assertEquals("Yellow", clonedColor.use());
    }

}
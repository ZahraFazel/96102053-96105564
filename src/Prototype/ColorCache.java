package Prototype;

import java.util.Hashtable;

public class ColorCache
{
    private static Hashtable<String, Color> colorMap = new Hashtable<>();

    public static Color getColor(String colorId)
    {
        Color cachedColor = colorMap.get(colorId);
        return (Color) cachedColor.clone();
    }

    public static void loadCache()
    {
        Blue blue = new Blue();
        colorMap.put("Blue", blue);
        Green green = new Green();
        colorMap.put("Green", green);
        Red red = new Red();
        colorMap.put("Red", red);
        Yellow yellow = new Yellow();
        colorMap.put("Yellow", yellow);
    }
}

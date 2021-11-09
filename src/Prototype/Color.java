package Prototype;

public abstract class Color implements Cloneable
{
    public abstract String use();

    public Object clone()
    {
        Object clone = null;
        try
        {
            clone = super.clone();
        }
        catch (CloneNotSupportedException e)
        {
            System.out.println(e.getMessage());
        }
        return clone;
    }
}

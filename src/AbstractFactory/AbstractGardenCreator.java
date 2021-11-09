package AbstractFactory;

import java.util.List;

public abstract class AbstractGardenCreator
{
    public abstract void creatTree();
    public abstract void creatFlower();
    public abstract List<Tree> getTrees();
    public abstract List<Flower> getFlowers();

    public static AbstractGardenCreator createCreator(String type) throws Exception
    {
        if(type.equals("Iranian"))
            return new IranianGardenCreator();
        else if(type.equals("Japanese"))
            return new JapaneseGardenCreator();
        else
            throw new IllegalArgumentException("Type is not supported.");
    }
}

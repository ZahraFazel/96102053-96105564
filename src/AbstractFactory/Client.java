package AbstractFactory;

public class Client
{
    public AbstractGardenCreator gardenCreator;

    public AbstractGardenCreator createGarden(String type)
    {
        try
        {
            gardenCreator = AbstractGardenCreator.createCreator(type);
            gardenCreator.creatTree();
            gardenCreator.creatFlower();
            System.out.println(type + " garden is created.");
            return gardenCreator;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        return null;
    }
}

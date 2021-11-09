package AbstractFactory;

import java.util.ArrayList;
import java.util.List;

public class JapaneseGardenCreator extends AbstractGardenCreator
{
    private List<Tree> trees = new ArrayList<>();
    private List<Flower> flowers = new ArrayList<>();

    @Override
    public void creatTree()
    {
        Tree tree = new RedMaple();
        System.out.println("New " + tree.getName() + " is created.");
        trees.add(tree);
    }

    @Override
    public void creatFlower()
    {
        Flower flower = new Sakura();
        System.out.println("New " + flower.getName() + " is created.");
        flowers.add(flower);
    }

    @Override
    public List<Tree> getTrees()
    {
        return trees;
    }

    @Override
    public List<Flower> getFlowers()
    {
        return flowers;
    }
}

package AbstractFactory;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Tests
{
    @Test
    public void testIranianGarden()
    {
        Client client = new Client();
        AbstractGardenCreator gardenCreator = client.createGarden("Iranian");
        assertNotNull(gardenCreator.getTrees());
        assertNotNull(gardenCreator.getFlowers());
        assertTrue(gardenCreator.getTrees().get(0) instanceof Chenar);
        assertTrue(gardenCreator.getFlowers().get(0) instanceof Khatmi);
    }

    @Test
    public void testJapaneseGarden()
    {
        Client client = new Client();
        AbstractGardenCreator gardenCreator = client.createGarden("Japanese");
        assertNotNull(gardenCreator.getTrees());
        assertNotNull(gardenCreator.getFlowers());
        assertTrue(gardenCreator.getTrees().get(0) instanceof RedMaple);
        assertTrue(gardenCreator.getFlowers().get(0) instanceof Sakura);
    }

    @Test
    public void testOtherGardens()
    {
        Client client = new Client();
        AbstractGardenCreator gardenCreator = client.createGarden("German");
        assertNull(gardenCreator);
    }
}
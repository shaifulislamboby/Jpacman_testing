package nl.tudelft.jpacman.level;


import nl.tudelft.jpacman.points.DefaultPointCalculator;
import nl.tudelft.jpacman.points.PointCalculator;
import org.junit.jupiter.api.BeforeEach;


/**
 * @author: Rahman
 * @discription:
 */
public class DefaultPlayerInteractionMapTest extends CollisionMapTest {
    private final PointCalculator point = new DefaultPointCalculator();

    @Override
    void set() {
        CollisionMap camp = new DefaultPlayerInteractionMap(point);
        setCamp(camp);
    }

    /**
     * Set camp to be an instance of DefaultPlayerInteractionMap().
     */
    @BeforeEach
    void setUp1() {
        set();
    }

}

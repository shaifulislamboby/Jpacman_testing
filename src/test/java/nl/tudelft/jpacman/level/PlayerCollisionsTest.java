package nl.tudelft.jpacman.level;


import nl.tudelft.jpacman.points.DefaultPointCalculator;
import nl.tudelft.jpacman.points.PointCalculator;
import org.junit.jupiter.api.BeforeEach;

import static org.mockito.Mockito.mock;


/**
 * @author: Rahman
 * @discription:
 */
public class PlayerCollisionsTest extends CollisionMapTest {
    private final PointCalculator point= new DefaultPointCalculator();

    @Override
    void set() {
        CollisionMap camp = new PlayerCollisions(point);
        setCamp(camp);
    }

    /**
     * set camp an instance of PlayerCollisions().
     */
    @BeforeEach
    void setUp() {
        set();
    }
}

package Enemies;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TrollTest {
    Troll troll;
    @Before
    public void before(){
        troll = new Troll(100, Weapon.SWORD);
    }
    @Test
    public void canTakeDamage(){
        troll.takeDamage(10);
        assertEquals(90, troll.getHealthPoints());
    }
}
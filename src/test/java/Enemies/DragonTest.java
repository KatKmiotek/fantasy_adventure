package Enemies;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DragonTest {
    Dragon dragon;
    Orc orc;

    @Before
    public void before(){
        dragon = new Dragon(20);
        orc = new Orc(50, Weapon.AXE);
    }

    @Test
    public void canDefend() {
        dragon.defend(orc);
        assertEquals(30, orc.getHealthPoints());
    }
}
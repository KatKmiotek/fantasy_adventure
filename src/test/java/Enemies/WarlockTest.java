package Enemies;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class WarlockTest {
    Warlock warlock;
    Orc orc;
    @Before
    public void before() {
        warlock = new Warlock("Gandalf", 100, 20);
        orc = new Orc(100, Weapon.AXE);
    }
    @Test
    public void canCast(){
        warlock.cast(orc, Spell.FIREBALL);
        assertEquals(50, orc.getHealthPoints());
    }
}
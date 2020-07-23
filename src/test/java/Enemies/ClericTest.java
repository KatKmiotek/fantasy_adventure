package Enemies;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ClericTest {
    Cleric cleric;
    Barbarian barbarian;
    @Before
    public void setUp() throws Exception {
        cleric = new Cleric();
        barbarian = new Barbarian("Paul", 100, Weapon.AXE);
    }

    @Test
    public void canHeal() {
        cleric.heal(Heal.HERBS, barbarian);
        assertEquals(110, barbarian.getHealthPoints());
    }
}
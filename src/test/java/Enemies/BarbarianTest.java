package Enemies;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BarbarianTest {
    Barbarian barbarian;
    @Before
    public void before(){
        barbarian = new Barbarian("Tommy", 100, Weapon.AXE);
    }
    @Test
    public void canChangeWeapon(){
        barbarian.changeWeapon(Weapon.SWORD);
        assertEquals(Weapon.SWORD, barbarian.getWeapon());
    }
    @Test
    public void hasName(){
        assertEquals("Tommy", barbarian.getName());
    }
}
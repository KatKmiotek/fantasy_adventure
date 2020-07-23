package Enemies;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OrcTest {
    Player player;
    Orc orc;
    @Before
    public void before(){
        orc = new Orc(50, Weapon.AXE);
//        player = new Player("Bobby", 100);
    }
    @Test
    public void canTakeDamage(){
        orc.takeDamage(20);
        assertEquals(30, orc.getHealthPoints());
    }
//    @Test
//    public void canAttack(){
//        orc.attack(player);
//        assertEquals(85, player.getHealthPoints());
//    }

}
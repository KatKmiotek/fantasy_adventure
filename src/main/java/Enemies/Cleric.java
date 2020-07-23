package Enemies;

import behaviours.IHeal;

public class Cleric implements IHeal {

    @Override
    public void heal(Heal heal, Player player) {
        player.healthPoints += heal.getHealingPower();
    }
}

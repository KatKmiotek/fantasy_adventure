package Enemies;

import behaviours.IWeapon;

public abstract class Fighter extends Player implements IWeapon {
    public Fighter(String name, int healthPoints) {
        super(name, healthPoints);
    }

    @Override
    public void attack(Player player) {
        Enemy enemy = ;

    }
}

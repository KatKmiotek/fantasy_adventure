package Enemies;

import behaviours.IWeapon;

public abstract class Fighter extends Player implements IWeapon {
    private Weapon weapon;
    public Fighter(String name, int healthPoints, Weapon weapon) {
        super(name, healthPoints);
        this.weapon = weapon;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    @Override
    public void attack(Player player, Enemy enemy) {
        enemy.healthPoints -= weapon.getDamageValue();
    }
    public void changeWeapon(Weapon newWeapon){
        this.weapon = newWeapon;
    }
}

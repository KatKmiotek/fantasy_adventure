package Enemies;

import behaviours.IDamage;
import behaviours.IWeapon;

public abstract class Enemy implements IDamage, IWeapon {
    protected int healthPoints;
    private Weapon weapon;

    public Enemy(int healthPoints, Weapon weapon) {
        this.healthPoints = healthPoints;
        this.weapon = weapon;

    }

    public Weapon getWeapon() {
        return weapon;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }
    @Override
    public void attack(Player player, Enemy enemy) {
        player.healthPoints -= weapon.getDamageValue();
    }
    @Override
    public void takeDamage(int amount) {
        this.healthPoints -= amount;
    }
}

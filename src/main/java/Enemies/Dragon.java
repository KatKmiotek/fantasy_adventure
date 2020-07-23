package Enemies;

import behaviours.IDefend;

public class Dragon implements IDefend {
    private int damage;

    public Dragon(int damage) {
        this.damage = damage;
    }

    @Override
    public void defend(Enemy enemy) {
        enemy.healthPoints -= damage;
    }
}

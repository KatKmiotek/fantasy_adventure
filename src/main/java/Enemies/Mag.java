package Enemies;

import behaviours.IDefend;
import behaviours.ISpell;

public abstract class Mag extends Player implements IDefend, ISpell {
    private int damage;

    public Mag(String name, int healthPoints, int damage) {
        super(name, healthPoints);
        this.damage = damage;
    }

    @Override
    public void defend(Enemy enemy) {
        enemy.healthPoints -= damage;
    }
    @Override
    public void cast(Enemy enemy, Spell spell) {
        enemy.healthPoints -= spell.getPowerValue();
    }

}

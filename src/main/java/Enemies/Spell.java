package Enemies;

public enum Spell {
    FIREBALL(50),
    FREEZE(55);
    private final int powerValue;

    Spell(int powerValue) {
        this.powerValue = powerValue;
    }

    public int getPowerValue() {
        return powerValue;
    }
}

package Enemies;

public enum Weapon {
    SWORD(10),
    AXE(15),
    CLUB(5);

    private final int damageValue;

    Weapon(int damageValue) {
        this.damageValue = damageValue;
    }

    public int getDamageValue() {
        return damageValue;
    }
}

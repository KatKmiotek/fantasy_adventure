package Enemies;

public enum Heal {
    POTION(20),
    HERBS(10);

    private final int healingPower;

    Heal(int healingPower) {
        this.healingPower = healingPower;
    }

    public int getHealingPower() {
        return healingPower;
    }
}

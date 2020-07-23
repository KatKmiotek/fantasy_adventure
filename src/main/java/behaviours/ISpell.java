package behaviours;

import Enemies.Enemy;
import Enemies.Spell;

public interface ISpell {
    public void cast(Enemy enemy, Spell spell);
}

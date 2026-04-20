public class BurgerCreature extends Creature {
    @Override
    public float mainAttack() {
        float power = Rand.randomFloat(10, 20);
        action = name + " attacked with patties! (Power: " + power + ")";
        return power;
    }
}

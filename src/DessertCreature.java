public class DessertCreature extends Creature {
    @Override
    public float mainAttack() {
        float power = Rand.randomFloat(10, 20);
        action = name + " attacked, causing an insulin spike! (Power: " + power + ")";
        return power;
    }
}

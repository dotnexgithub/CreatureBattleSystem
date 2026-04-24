public class DessertCreature extends Creature {
    private String action;

    public DessertCreature (String name, float health) {
        super(name, health);
    }

    @Override
    public float mainAttack() {
        float power = Rand.randomFloat(10, 20);
        action = super.getName() + " attacked, causing an insulin spike! (Power: " + power + ") (MA)";
        return power;
    }

    @Override
    public void defend(float incomingPower) {

        // 10 % chance of reducing damage taken
        if (Rand.randomInt(0, 5) < 1) {
            incomingPower = incomingPower * 0.8f;
            action = super.getName() + " shielded with sugar, reducing damage taken to " + incomingPower;
        }
        else
        {
            action = super.getName() + " did not defend.";
        }

        super.reduceHealth(incomingPower);
    }

    @Override
    public String readAction() {
        return action;
    }
}



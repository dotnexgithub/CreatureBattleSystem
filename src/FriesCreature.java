public class FriesCreature extends Creature {
    private String action;

    public FriesCreature (String name, float health) {
        super(name, health);
    }

    @Override
    public float mainAttack() {
        float power = Rand.randomFloat(10, 20);
        this.action = super.getName() + " attacked with oil splash! (Power: " + power + ")";
        return power;
    }
    @Override
    public void defend(float incomingPower) {

        // 10 % chance of reducing damage taken
        if (Rand.randomInt(0, 10) < 1) {
            incomingPower = incomingPower * 0.8f;
            action = super.getName() + " tallowed the attack, reducing incoming damage to " + incomingPower;
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


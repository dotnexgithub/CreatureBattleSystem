public class Creature {
    private String name;
    private float health;
    private String action = "Default Action";

    public Creature(String name, float health) {
        this.name = name;
        this.health = health;
    }


    public float getHealth() {
        return health;
    }


    public String getName() {
        return name;
    }

    public Creature() {}

    // Returns the damage done by the Creature
    public float attack() {

        // 20% chance of missing
        if (Rand.randomInt(0, 10) < 2) {
            return 0;
        }

        // otherwise, do damage between 10-20
        return mainAttack();
    }

    public float mainAttack() {
        float power = Rand.randomFloat(10, 20);
        action = name + " attacked! (Power: " + power + ")";
        return power;
    }

    public void defend(float incomingPower) {

        // 10 % chance of reducing damage taken
        if (Rand.randomInt(0, 10) < 1) {
            incomingPower = incomingPower * 0.8f;
            action = name + " defended and reduced damage taken to " + incomingPower;
        }
        else
        {
            action = name + " did not defend.";
        }

        health -= incomingPower;
    }

    public void reduceHealth(float reduction) {
        health -= reduction;
    }
    public String readAction() {
        return action;
    }


    @Override
    public String toString() {
        return getClass() + "{name: " + name + ", health: " + health + "}";
    }
}

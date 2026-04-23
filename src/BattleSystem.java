import java.sql.SQLOutput;

public class BattleSystem {
    // use varargs to get an array of Creatures to accept indefinite amount
    public void battleFFA(Creature... creatures) {
        // Set a and b to be any random creature

        Creature a, b, lastAttacker = new Creature();
        while (!isAllButOneDead(creatures)) {
            do {
                a = getRandomAliveCreature(creatures);
                b = getRandomAliveCreature(creatures);
            } while (a == b || lastAttacker == a);

            float attackPower = a.attack();
            b.defend(attackPower);
            System.out.println(a.readAction());
            System.out.println(b.readAction());

            System.out.println(a);
            System.out.println(b);
            System.out.println();

            // Remember last attacker so that it does not attack again (prevents a character from being too op)
            lastAttacker = a;
        }
        // Final display
        showLeaderboard(creatures);
    }
    private void showLeaderboard(Creature[] creatures) {
        System.out.println("Leaderboard");
        System.out.println("==============");
        for (Creature c : creatures) {
            float perceivedHealth = (c.getHealth() > 0) ? c.getHealth() : 0;
            System.out.println(c.getName() + " health: " + perceivedHealth);
        }
    }
    private boolean isAllButOneDead(Creature[] creatures) {
        int creaturesAlive = 0;
        for (Creature c : creatures) {
            if (c.getHealth() > 0) creaturesAlive++;
        }
        return (creaturesAlive == 1);
    }

    private Creature getRandomAliveCreature(Creature[] creatures) {
        Creature c = null;
        if (!isAllButOneDead(creatures)) {
            do {
                c = creatures[Rand.randomInt(0, creatures.length)];
            }
            while (c.getHealth() <= 0);
        }
        return c;
    }
}

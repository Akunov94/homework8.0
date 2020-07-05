package kg.geektech.les8.players;

import java.util.Random;

public class Warrior extends Hero{
    public Warrior(int damage, int health, String name) {
        super(damage, health, SuperAbility.CRITICAL_DAMAGE, name);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        Random random = new Random();
        int randomNumber = random.nextInt(2) + 2;
        for (int i = 0; i < heroes.length; i++) {
            heroes[i].setDamage(heroes[i].getDamage() + randomNumber);
        }
    }
}

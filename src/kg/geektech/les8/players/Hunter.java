package kg.geektech.les8.players;

public class Hunter extends Hero {
    public Hunter(int damage, int health, String name) {
        super(damage, health, SuperAbility.SAFE_DAMAGE_AND_REVERT, name);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            //if (heroes[i] instanceof Hunter)
            if (heroes[i].getAbility() != SuperAbility.SAFE_DAMAGE_AND_REVERT){
                heroes[i].setHealth(heroes[i].getHealth() - boss.getDamage());
                boss.setHealth(boss.getHealth() - heroes[i].getDamage() + boss.getDamage()/2);
            }

        }
    }
}

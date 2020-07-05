package kg.geektech.les8.players;

public class Thor extends Hero {
    public Thor(int damage, int health, String name) {
        super(damage, health, SuperAbility.STUN_THE_BOSS, name);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            //if (heroes[i] instanceof Hunter)
            if (heroes[i].getAbility() != SuperAbility.STUN_THE_BOSS)
                boss.setDamage(0);
        }
    }
}

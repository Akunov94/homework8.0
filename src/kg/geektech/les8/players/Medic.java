package kg.geektech.les8.players;

public class Medic extends Hero {
    private int healpoints;

    public Medic(int damage, int health, int healpoints, String name) {
        super(damage, health, SuperAbility.HEAL, name);
        this.healpoints = healpoints;
    }

    public int getHealpoints() {
        return healpoints;
    }

    public void setHealpoints(int healpoints) {
        this.healpoints = healpoints;
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            //if (heroes[i].getAbility() != SuperAbility.HEAL){} 1-й вар-т.
            if (!(heroes[i] instanceof Medic)) {
                heroes[i].setHealth(heroes[i].getHealth() + healpoints);
            }
        }
    }
}

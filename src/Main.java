
class Hero {

    private int health;
    private int damage;
    private String superAbility;


    public Hero(int health, int damage, String superAbility) {
        this.health = health;
        this.damage = damage;
        this.superAbility = superAbility;
    }


    public Hero(int health, int damage) {
        this.health = health;
        this.damage = damage;
        this.superAbility = "None";
    }


    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public String getSuperAbility() {
        return superAbility;
    }
}


class Boss {

    private int health;
    private int damage;
    private String defenseType;


    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getDefenseType() {
        return defenseType;
    }

    public void setDefenseType(String defenseType) {
        this.defenseType = defenseType;
    }
}


public class Main {
    public static void main(String[] args) {

        Boss boss = new Boss();

        boss.setHealth(1000);
        boss.setDamage(150);
        boss.setDefenseType("Physical");


        System.out.println("Boss Info:");
        System.out.println("Health: " + boss.getHealth());
        System.out.println("Damage: " + boss.getDamage());
        System.out.println("Defense Type: " + boss.getDefenseType());


        Hero[] heroes = createHeroes();
        System.out.println("\nHeroes Info:");
        for (Hero hero : heroes) {
            System.out.println("Health: " + hero.getHealth() +
                    ", Damage: " + hero.getDamage() +
                    ", Super Ability: " + hero.getSuperAbility());
        }
    }

    public static Hero[] createHeroes() {

        Hero hero1 = new Hero(300, 50, "Fireball");
        Hero hero2 = new Hero(400, 40);
        Hero hero3 = new Hero(350, 60, "Invisibility");

        Hero[] heroes = {hero1, hero2, hero3};
        return heroes;
    }
}

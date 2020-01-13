public class Archetype {
    private String name;
    private int strength;
    private int health;
    private int energy;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    @Override
    public String toString() {
        return "Archetype{" +
                "name='" + name + '\'' +
                ", strength=" + strength +
                ", health=" + health +
                ", energy=" + energy +
                '}';
    }
}

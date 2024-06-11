package bpsechs;

public class Pokemon {
    private final String name;
    private Integer maxHP;
    private Integer currentHP;

    public Pokemon(String name, Integer maxHP) throws IllegalArgumentException {
        if(maxHP > 0) {
            this.maxHP = maxHP;
        } else {
            throw new IllegalArgumentException("Max HP should be greater than 0");
        }
        this.name = name;
        currentHP = maxHP;
    }

    public String getName() {
        return name;
    }

    public int getMaxHP() {
        return maxHP;
    }

    public int getCurrentHP() {
        return currentHP;
    }

    public boolean isFainted() {
        return currentHP == 0;
    }

    public int takeDamage(Integer damage) {
        if (damage > currentHP) {
            return currentHP = 0;
        }
        return currentHP -= damage;
    }

    public int heal() {
        return currentHP = maxHP;
    }

    public int heal(Integer heal) {
        return currentHP += heal;
    }

    @Override
    public String toString() {
        return name + " with " + currentHP + "/" + maxHP;
    }
}

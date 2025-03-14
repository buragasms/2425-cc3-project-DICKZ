import java.util.List;

public class Equipment {
    private String name;
    private int value;
    private int damage;
    private int levelRequirement;
    private List<Item> equipments;

    public Equipment(String name, int value, int damage, int levelRequirement, List<Item> equipments) {
        this.name = name;
        this.value = value;
        this.damage = damage;
        this.levelRequirement = levelRequirement;
        this.equipments = equipments;
    }

    public void equip() {
        System.out.println(name + " has been equipped.");
    }

    public boolean canEquip(int playerLevel) {
        return playerLevel >= levelRequirement;
    }

    public int getDamage() {
        return damage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getLevelRequirement() {
        return levelRequirement;
    }

    public void setLevelRequirement(int levelRequirement) {
        this.levelRequirement = levelRequirement;
    }

    public List<Item> getEquipments() {
        return equipments;
    }

    public void setEquipments(List<Item> equipments) {
        this.equipments = equipments;
    }
}

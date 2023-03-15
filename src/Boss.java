public class Boss {
    private int bossHealth;
    private int bossDamage;
    private String protectionType;
    public void setBossHealth(int bossHealth) {
        this.bossHealth = bossHealth;
    }

    public void setBossDamage(int bossDamage) {
        this.bossDamage = bossDamage;
    }

    public void setBossProtectionType(String bossProtectionType) {
        this.protectionType = bossProtectionType;
    }
    public int getBossHealth() {
        return bossHealth;
    }
    public int getBossDamage() {
        return bossDamage;
    }
    public String getBossProtectionType() {
        return protectionType;
    }
}

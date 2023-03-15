public class Main {
    public static void main(String[] args) {
        Boss heavyBoss = new Boss();
        heavyBoss.setBossHealth(1000);
        heavyBoss.setBossDamage(98);
        heavyBoss.setBossProtectionType("Magic");
        System.out.println("Boss health:"+heavyBoss.getBossHealth()+",damage:"+heavyBoss.getBossDamage()
        +",protectionType:"+heavyBoss.getBossProtectionType());
    }
}
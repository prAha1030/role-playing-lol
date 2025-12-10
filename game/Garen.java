package game;

public class Garen {
    private String name;
    private int level;
    private int hp;
    private int attackDamage;
    private int defence;

    // 가렌 1렙 설정값
    public Garen(String name, int level, int hp, int attackDamage, int defence) {
        this.name = name;
        this.level = 1;
        this.hp = 600;
        this.attackDamage = 50;
        this.defence = 40;
    }

    // 애쉬를 공격
    public void attackToAshe(Ashe target) {
        System.out.println(name + "-(공격)->" + target.getName());
        target.takeDamage(attackDamage);
    }

    // 받은 피해
    public void takeDamage(int damage) {
        int actualDamage = damage - defence;
        if (actualDamage < 0) {actualDamage = 0;}
        hp -= actualDamage;
        System.out.println(name + "이(가)" + actualDamage + "의 피해를 받음 (남은 HP: " + hp + ")");
    }

    // 가렌 이름 조회
    public String getName() {
        return this.name;
    }

    // 가렌 스킬 Q W E R
    public void useQ(Ashe target) {
        System.out.println(name + "의 가로베기!");
        target.takeDamage(attackDamage + 10);
    }
    public void useW(Ashe target) {
        System.out.println(name + "의 세로베기!");
        target.takeDamage(attackDamage + 15);
    }
    public void useE() {
        System.out.println(name + "의 갑옷 강화!");
        defence += 20;
    }
    public void useR(Ashe target) {
        System.out.println(name + "의 십자베기!");
        target.takeDamage(attackDamage + 30);
    }
}

package game;

public class Ashe {
    private String name;
    private int level;
    private int hp;
    private int attackDamage;
    private int defence;

    // 애쉬 1렙 설정값
    public Ashe(String name, int level, int hp, int attackDamage, int defence) {
        this.name = name;
        this.level = 1;
        this.hp = 450;
        this.attackDamage = 60;
        this.defence = 35;
    }

    // 가렌을 공격
    public void attackToGaren(Garen target) {
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

    // 애쉬 이름 조회
    public String getName() {
        return this.name;
    }
}

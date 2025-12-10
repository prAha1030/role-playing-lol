package game;

public abstract class Champion {
    private String name;
    private int level;
    private int hp;
    private int attackDamage;
    private int defence;

    public Champion(String name, int hp, int attackDamage, int defence) {
        this.name = name;
        this.level = 1;
        this.hp = hp;
        this.attackDamage = attackDamage;
        this.defence = defence;
    }
    // 기본 공격
    public void attackTo(Champion target) {
        System.out.println(name + "의 기본 공격.");
        target.takeDamage(attackDamage);
    }
    // 받은 피해
    public void takeDamage(int damage) {
        int actualDamage = damage - defence;
        if (actualDamage < 0) {actualDamage = 0;}
        hp -= actualDamage;
        if (hp <= 0) {
            System.out.println(name + "이(가) 사망했습니다!!");
        } else {
            System.out.println(name + "이(가) " + actualDamage + "의 피해를 받음 (남은 HP: " + hp + ")");
        }
    }
    // Q W E R 스킬
    public abstract void useQ(Champion target);
    public abstract void useW(Champion target);
    public abstract void useE(Champion target);
    public abstract void useR(Champion target);
    // 이름, 체력, 공격력, 방어력 간접 접근
    public String getName() {
        return name;
    }
    public int getAttackDamage() {
        return attackDamage;
    }
    public void incrHp(int value) {
        hp += value;
        System.out.println(name + "의 체력을 회복했습니다 (남은 HP: " + hp + ")");
    }
    public void incrDefence(int value) {
        defence += value;
        System.out.println(name + "의 방어력이 증가했습니다 (현재 방어력: " + defence + ")");
    }

    // 전투 결과 확인
    @Override
    public String toString() {
        return "{name='" + name + '\'' + ", level=" + level + ", hp=" + hp + ", attackDamage=" + attackDamage + ", defense=" + defence + '}';
    }
}

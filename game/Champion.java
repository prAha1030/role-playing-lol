package game;

public abstract class Champion {
    // 전투 횟수 카운팅
    private static int battleCount = 0;
    public int getBattleCount() {
        return battleCount;
    }
    public void plusBattleCount() {
        battleCount++;
    }

    private final String name;
    private int level;
    private int hp;
    private int attackDamage;
    private int defence;

    public Champion(String name) {
        this.name = name;
        this.level = 1;
        this.hp = GameConstants.BASIC_HP;
        this.attackDamage = GameConstants.BASIC_ATTACK_DAMAGE;
        this.defence = GameConstants.BASIC_DEFENCE;
    }
    // 기본 공격
    public void attackTo(Champion target) {
        System.out.println(name + "의 기본 공격.");
        target.takeDamage(attackDamage);
        battleCount++;
    }
    // 받은 피해
    public void takeDamage(int damage) {
        int actualDamage = damage - defence;
        if (actualDamage < 0) {actualDamage = 0;}
        hp -= actualDamage;
        if (hp <= 0) {
            System.out.println(name + "이(가) 사망했습니다!!");
        } else {
            System.out.println(name + "이(가) " + actualDamage + "의 피해를 받음 (현재 HP: " + hp + ")");
        }
    }
    // 패시브 스킬
    public abstract  void passive();
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
        System.out.println(name + "의 체력이 증가했습니다 (현재 HP: " + hp + ")");
    }
    public void incrAttackDamage(int value) {
        attackDamage += value;
        System.out.println(name + "의 공격력이 증가했습니다 (현재 공격력: " + attackDamage + ")");
    }
    public void incrDefence(int value) {
        defence += value;
        System.out.println(name + "의 방어력이 증가했습니다 (현재 방어력: " + defence + ")");
    }
    // 레벨업
    public final void levelUP() {
        if (this.level == GameConstants.MAX_LEVEL) {
            System.out.println("이미 최고 레벨입니다.");
        }
        level++;
        System.out.println(name + " 레벨업! 현재 레벨: " + level);
    }
    // 부활 시스템
    public final void resurrect() {
        if (hp <= 0) {
            hp = GameConstants.BASIC_HP / 5;
            System.out.println(name + "이(가) 부활했습니다. (현재 HP: " + hp + ")");
        } else {
            System.out.println("부활 가능한 상태가 아닙니다.");
        }
    }
    // 전투 결과 확인
    @Override
    public String toString() {
        return "{name='" + name + '\'' + ", level=" + level + ", hp=" + hp + ", attackDamage=" + attackDamage + ", defense=" + defence + '}';
    }
}

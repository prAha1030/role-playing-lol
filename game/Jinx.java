package game;

public class Jinx extends Champion {
    // 징크스 소환
    public Jinx(String name) {
        super(name);
    }
    // 기본 공격
    @Override
    public void attackTo(Champion target) {
        super.attackTo(target);
    }
    // 받은 피해
    @Override
    public void takeDamage(int damage) {
        super.takeDamage(damage);
    }
    // 징크스 패시브 스킬
    @Override
    public void passive() {
        System.out.println(getName() + "의 신난다! 활성화");
        incrHp(50);
        incrAttackDamage(10);
        incrDefence(10);
    }
    // 징크스 스킬 Q W E R
    @Override
    public void useQ(Champion target) {
        System.out.println(getName() + "의 휘릭휘릭!");
        target.takeDamage(getAttackDamage() + 10);
        plusBattleCount();
    }
    @Override
    public void useW(Champion target) {
        System.out.println(getName() + "의 빠직빠직!");
        target.takeDamage(getAttackDamage() + 20);
        plusBattleCount();
    }
    @Override
    public void useE(Champion target) {
        System.out.println(getName() + "의 와작와작!");
        target.takeDamage(getAttackDamage() + 30);
        plusBattleCount();
    }
    @Override
    public void useR(Champion target) {
        System.out.println(getName() + "의 펑!");
        target.takeDamage(getAttackDamage() + 40);
        plusBattleCount();
    }
}

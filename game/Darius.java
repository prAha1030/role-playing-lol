package game;

public class Darius extends Champion{
    // 다리우스 소환
    public Darius(String name) {
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
    // 다리우스 패시브 스킬
    @Override
    public void passive() {
        System.out.println(getName() + "의 잔혹한 살기 활성화");
        incrHp(100);
        incrAttackDamage(10);
    }
    // 다리우스 스킬 Q W E R
    @Override
    public void useQ(Champion target) {
        System.out.println(getName() + "의 회전베기!");
        target.takeDamage(getAttackDamage() + 10);
        plusBattleCount();
    }
    @Override
    public void useW(Champion target) {
        System.out.println(getName() + "의 찍기!");
        target.takeDamage(getAttackDamage() + 20);
        plusBattleCount();
    }
    @Override
    public void useE(Champion target) {
        System.out.println(getName() + "의 광폭화!");
        incrAttackDamage(15);
        plusBattleCount();
    }
    @Override
    public void useR(Champion target) {
        System.out.println(getName() + "의 무자비한 학살!");
        target.takeDamage(getAttackDamage() + 40);
        plusBattleCount();
    }
}

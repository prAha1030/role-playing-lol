package game;

public class Garen extends Champion {

    // 가렌 소환
    public Garen(String name) {
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
    // 가렌 패시브 스킬
    @Override
    public void passive() {
        System.out.println(getName() + "의 강인한 정신 활성화");
        incrHp(100);
        incrDefence(10);
    }
    // 가렌 스킬 Q W E R
    @Override
    public void useQ(Champion target) {
        System.out.println(getName() + "의 가로베기!");
        target.takeDamage(getAttackDamage() + 10);
        plusBattleCount();
    }
    @Override
    public void useW(Champion target) {
        System.out.println(getName() + "의 세로베기!");
        target.takeDamage(getAttackDamage() + 15);
        plusBattleCount();
    }
    @Override
    public void useE(Champion target) {
        System.out.println(getName() + "의 갑옷 강화!");
        incrDefence(20);
        plusBattleCount();
    }
    @Override
    public void useR(Champion target) {
        System.out.println(getName() + "의 십자베기!");
        target.takeDamage(getAttackDamage() + 30);
        plusBattleCount();
    }
}

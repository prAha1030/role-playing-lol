package game;

public class Garen extends Champion {

    // 가렌 1렙 설정값
    public Garen(String name) {
        super(name, 600, 50, 40);
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
    // 가렌 스킬 Q W E R
    @Override
    public void useQ(Champion target) {
        System.out.println(getName() + "의 가로베기!");
        target.takeDamage(getAttackDamage() + 10);
    }
    @Override
    public void useW(Champion target) {
        System.out.println(getName() + "의 세로베기!");
        target.takeDamage(getAttackDamage() + 15);
    }
    @Override
    public void useE(Champion target) {
        System.out.println(getName() + "의 갑옷 강화!");
        incrDefence(20);
    }
    @Override
    public void useR(Champion target) {
        System.out.println(getName() + "의 십자베기!");
        target.takeDamage(getAttackDamage() + 30);
    }
}

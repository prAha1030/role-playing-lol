package game;

public class Ashe extends Champion {

    // 애쉬 1렙 설정값
    public Ashe(String name) {
        super(name, 450, 60, 35);
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
    // 애쉬 스킬 Q W E R
    @Override
    public void useQ(Champion target) {
        System.out.println(getName() + "의 더블샷!");
        target.takeDamage(getAttackDamage() + 15);
    }
    @Override
    public void useW(Champion target) {
        System.out.println(getName() + "의 트리플샷!");
        target.takeDamage(getAttackDamage() + 25);
    }
    @Override
    public void useE(Champion target) {
        System.out.println(getName() + "의 코코아 원샷!");
        incrHp(20);
    }
    @Override
    public void useR(Champion target) {
        System.out.println(getName() + "의 수정화살!");
        target.takeDamage(getAttackDamage() + 40);
    }
}

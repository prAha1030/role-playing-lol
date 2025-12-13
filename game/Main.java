package game;

public class Main {
    public static void main(String[] args) {
        System.out.println("==== 소환사의 협곡에 오신 것을 환영합니다. ====");

        Champion garen1 = new Garen("가렌좋아");
        Champion ashe1 = new Ashe("나는애쉬");

        // 전투 시작 시 패시브 바로 활성화 : 전투 시작이랑 패시브를 묶은 메서드 추가?
        // 기능 구현을 위해 전투 시작 메서드에 전투에 참여하는 챔피언 객체 변수 활용?
        System.out.println("=== 전투 시작 ===");
        ashe1.passive();
        garen1.passive();
        ashe1.attackTo(garen1);
        garen1.attackTo(ashe1);
        ashe1.useQ(garen1);
        ashe1.useR(garen1);
        garen1.levelUP();
        ashe1.useR(garen1);
        ashe1.useR(garen1);
        ashe1.useR(garen1);
        ashe1.useR(garen1);
        ashe1.useR(garen1);
        ashe1.useR(garen1);
        garen1.resurrect();

        System.out.println("전투 횟수 : " + garen1.getBattleCount());
        System.out.println("=== 전투 종료 ===");
        System.out.println("=== 전투 결과 ===");

        System.out.println(garen1);
        System.out.println(ashe1);
    }
}
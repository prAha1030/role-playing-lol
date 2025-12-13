package game;

public class Main {
    public static void main(String[] args) {
        System.out.println("==== 소환사의 협곡에 오신 것을 환영합니다. ====");

        Champion garen1 = new Garen("가렌좋아");
        Champion ashe1 = new Ashe("나는애쉬");

        System.out.println("=== 전투 시작 ===");

        ashe1.attackTo(garen1);
        garen1.attackTo(ashe1);
        ashe1.useQ(garen1);
        garen1.useQ(ashe1);
        ashe1.useW(garen1);
        garen1.useW(ashe1);
        ashe1.useE(ashe1);
        garen1.useE(garen1);
        ashe1.useR(garen1);
        garen1.useR(ashe1);

        System.out.println("전투 횟수 : " + garen1.getBattleCount());
        System.out.println("=== 전투 종료 ===");
        System.out.println("=== 전투 결과 ===");

        System.out.println(garen1);
        System.out.println(ashe1);
    }
}
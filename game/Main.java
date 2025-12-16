package game;

public class Main {
    public static void main(String[] args) {
        System.out.println("==== 소환사의 협곡에 오신 것을 환영합니다. ====");

        // 팀전 모의전투
        // 챔피언 구성
        ChampionPool pool = new ChampionPool();
        pool.addChampion(new Garen("가렌좋아"));
        pool.addChampion(new Ashe("나는애쉬"));
        pool.addChampion(new Darius("다리우스왕"));
        pool.addChampion(new Jinx("징크스다"));
        // 팀 생성
        Team<Champion> blue = new Team<>("블루");
        Team<Champion> red = new Team<>("레드");
        // 팀 배치
        blue.addMember(pool.get("가렌좋아"));
        blue.addMember(pool.get("나는애쉬"));

        red.addMember(pool.get("다리우스왕"));
        red.addMember(pool.get("징크스다"));
        // 승리 기준 팀 전체 체력이 0이 될 경우
        System.out.println("블루팀 전체 체력: " + blue.getTotalHp());
        System.out.println("레드팀 전체 체력: " + red.getTotalHp());

        // 개인전 모의전투
//        Champion garen1 = new Garen("가렌좋아");
//        Champion ashe1 = new Ashe("나는애쉬");
//        Champion darius1 = new Darius("다리우스왕");
//        Champion jinx1 = new Jinx("징크스다");
        // 전투 시작 시 패시브 바로 활성화 : 전투 시작이랑 패시브를 묶은 메서드 추가?
        // 기능 구현을 위해 전투 시작 메서드에 전투에 참여하는 챔피언 객체 변수 활용?
//        System.out.println("=== 전투 시작 ===");
//        ashe1.passive();
//        garen1.passive();
//        ashe1.attackTo(garen1);
//        garen1.attackTo(ashe1);
//        ashe1.useQ(garen1);
//        ashe1.useR(garen1);
//        garen1.levelUP();
//        ashe1.useR(garen1);
//        ashe1.useR(garen1);
//        ashe1.useR(garen1);
//        ashe1.useR(garen1);
//        ashe1.useR(garen1);
//        ashe1.useR(garen1);
//        garen1.resurrect();
//        System.out.println("전투 횟수 : " + garen1.getBattleCount());
//        System.out.println("=== 전투 종료 ===");
//        System.out.println("=== 전투 결과 ===");
//        System.out.println(garen1);
//        System.out.println(ashe1);
//        System.out.println(jinx1);
//        System.out.println(darius1);
    }
}
package game;

import java.util.ArrayList;
import java.util.List;

public class Team<T extends Champion> {
    private String name;
    private List<T> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }
    // 팀에 챔피언 추가
    public void addMember(T champion) {
        members.add(champion);
        System.out.println(name + "팀에 " + champion.getName() + "의 합류!");
    }
    // 팀 총합 HP
    public int getTotalHp() {
        return members.stream().mapToInt(Champion::getHp).sum();
    }
}
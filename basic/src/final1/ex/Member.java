package final1.ex;

public class Member {
    private final String id; // 한 번 할당하면, 바꾸면 안 됨
    // id가 바뀌면, 전체 시스템을 크게 수정해야 됨. 이를 애초에 막을 수 있음.
    private String name;

    public Member(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public void changeData(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println("id: " + id + " name: " + name);
    }
}

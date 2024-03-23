package condition.ex;

public class DistanceEx {
    public static void main(String[] args) {
        int dist = 5;

        if (dist <= 1) {
            System.out.println("도보를 이용하세요.");
        } else if (dist <= 10) {
            System.out.println("자전거를 이용하세요.");
        } else if (dist <= 100) {
            System.out.println("자동차를 이용하세요.");
        } else {
            System.out.println("비행기를 이용하세요.");
        }
    }
}

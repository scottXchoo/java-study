package access.ex;

public class MaxCounter {
    private int count = 0;
    private int max;

    public MaxCounter(int max) {
        this.max = max;
    }

    public void increment() {
        if (count < max) {
            count += 1;
        } else {
            System.out.println("더 증가할 수 없다.");
        }
    }

    public int getCount() {
        return count;
    }
}

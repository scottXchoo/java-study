package pack;

import pack.a.User; // import는 딱 하나만 사용 가능

public class PackageMain3 {
    public static void main(String[] args) {
        User userA = new User();
        pack.b.User userB = new pack.b.User();
    }
}

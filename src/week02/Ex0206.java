package week02;

import java.util.HashSet;
import java.util.Set;

public class Ex0206 {
    public static void main(String[] args) {
        Set<Member> set = new HashSet<>();
        set.add(new Member("홍길동", 30));
        set.add(new Member("홍길동", 30));
        set.add(new Member("홍길동", 20));

        System.out.println(set.size());

        Member member1 = new Member();
        member1.setName("이몽룡");
        member1.setAge(40);

        Member member2 = new Member("홍길순", 20);
    }
}


class Member {
    private String name;
    private int age;

    public Member() {}; 

    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

}

// 생성자의 이름은 클래스명과 같다
// 생성자는 생략 가능하다
// 생성자는 반환타입이 없다

package week01;

public class Ex0115 {
    public static void main(String[] args) {
        // 문자(열) 비교
        char c1 = 'A';
        char c2 = 'A';

        System.out.println(c1 == c2); // 결과값 true

        String str1 = "A";
        String str2 = "A";

        System.out.println(str1 == str2); // 결과값 true
        
        String str3 = new String("A"); // new -> heap 메모리에 값을 담아두고 그 주소를 바라봄
        String str4 = new String("A");
        System.out.println(str3 == str4); // 결과값 false
        System.out.println(str1 == str3); // 결과값 false
    }
}

// stack 메모리 -> 자료형 데이터
// heap 메모리

// ==  -> 숫자나 글자, 문자 비교 + 메모리의 주소값도 비교
// equals -> 단순하게 숫자나 글자, 문자만 비교

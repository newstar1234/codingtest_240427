package week01;

public class Ex0114 {
    public static void main(String[] args) {
        // 문자열 String
        String str = "Good Morning";
        System.out.println("charAt : " + str.charAt(7)); // 공백 포함
        System.out.println("startsWith : " + str.startsWith("good")); // 결과값 -> true / false
        System.out.println("endssWith : " + str.endsWith("good")); // 결과값 -> true / false
        System.out.println("equals : " + str.equals("good")); // 결과값 -> true / false

        System.out.println("indexOf : " + str.indexOf("M")); // 왼쪽부터 첫번쨰 만나는 "M" -> 0부터 시작
        System.out.println("indexOf : " + str.indexOf("o")); // 왼쪽부터 첫번쨰 만나는 "o" -> 0부터 시작
        System.out.println("lastIndexOf : " + str.lastIndexOf("M")); // 뒷쪽부터 시작해서 첫번째 만나는 "M"을 왼쪽부터 셈
        System.out.println("lastIndexOf : " + str.lastIndexOf("o")); // 뒷쪽부터 시작해서 첫번째 만나는 "o"을 왼쪽부터 셈
        System.out.println("length : " + str.length()); // 배열일때는 // 문자열 -> 문자열의 길이(갯수)

        System.out.println("replace : " + str.replace("Good", "good"));
        System.out.println("replace : " + str.replace("o", "a")); // "o" -> "a" 로 전체 변경
        System.out.println("replaceAll : " + str.replaceAll("Good", "a")); // "Good" 를 "a"로 변경
        System.out.println("replaceAll : " + str.replaceAll("[Good]", "a")); // [] -> "G" "o" "d" 이면 "a"로 변경 
    
        System.out.println("substring : " + str.substring(5));
        System.out.println("substring : " + str.substring(5, 7));
    }
}


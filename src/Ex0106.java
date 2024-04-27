public class Ex0106 {
    public static void main(String[] args) {
        // 반복문 for
        // int i = 0;
        // for(i = 0; i < 5; i++) {
            // System.out.println(i);
        // }
        // System.out.println(i);

        String[] arrays = {"a", "b", "c", "d"};
        for(int i = 0; i < arrays.length; i++) {
            System.out.println(arrays[i]);
        }

        for(String arr : arrays) {
            System.out.println(arr);
        }

        // 클래스는 length()
        // list, ArrayList는 size
    }
}

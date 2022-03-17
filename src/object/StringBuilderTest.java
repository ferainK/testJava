package object;

public class StringBuilderTest {
    public static void main(String[] args) {
        StringBuilder res1 = new StringBuilder("응가 덩어리");
        StringBuilder res2 = new StringBuilder(" 푸지지지지직");

        System.out.println(res1.append(res2));

        String res3 = """
                나의 살던 고향은
                꽃 피던 사안 꼬올
                """;

        String res4 = """
                응 촌놈~
                """;

        System.out.println(res3 + res4);
    }
}

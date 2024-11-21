import DP.dpQuestions.LongestCommonSequence;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        LongestCommonSequence ls = new LongestCommonSequence() ;
        System.out.println(ls.solve("abcde","ace", 0, 0));
    }
}

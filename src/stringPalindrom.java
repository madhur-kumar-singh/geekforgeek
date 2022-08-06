public class stringPalindrom {
    public static void main(String[] args) {
        String s = "aba";
        String S = "";
        for (int i = s.length()-1; i >= 0; i--) {
            S += s.charAt(i);

        }
        if (s.equalsIgnoreCase(S))
            System.out.println("Is Palindrom");
    }
}

import java.util.Scanner;
public class bishop {



        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            while (n-- > 0) {
                int m = 8;
                String[] s = new String[m];
                for (int i = 0; i < m; i++) {
                    s[i] = sc.next();

                }
                for (int i = 1; i < s.length - 1; i++) {
                    for (int j = 1; j < s[i].length() - 1; j++) {
                        if (s[i - 1].charAt(j - 1) == '#' && s[i + 1].charAt(j - 1) == '#' && s[i + 1].charAt(j + 1) == '#' && s[i - 1].charAt(j + 1) == '#') {
                            System.out.println((i +1) + " " + (j + 1));
                        }
                    }
                }
            }
        }
    }


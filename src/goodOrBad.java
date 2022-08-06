public class goodOrBad {
    public static void main(String[] args) {
        String s="aeioup??";
        System.out.println(check(s));


    }
    public  static int check(String s){
        int countVowels=0;
        int countConsonants=0;

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a' || s.charAt(i)=='e' ||s.charAt(i)=='o' || s.charAt(i)=='u' || s.charAt(i)=='i')
            {
                countVowels++;
                countConsonants=0;

            }
            else if(s.charAt(i)!='?'){
                countVowels=0;
                countConsonants++;
            }

        }
        if(countVowels>=5 || countConsonants>=3)
            return 0;
        else
            return 1;
    }
}

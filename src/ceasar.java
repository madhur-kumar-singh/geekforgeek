public class ceasar {
    public static void main(String[] args) {
        String s="CaesarCipher";
        int num=2;
        convert(s,num);
    }
    public static void convert(String s,int num){
        String newString="";
        for(int i=0;i<s.length();i++) {
            if ((int) s.charAt(i) >= 97 && (int) s.charAt(i) <= 123 || (int) s.charAt(i) >= 65 && (int) s.charAt(i) <= 91)
                newString += (char) ((int) s.charAt(i) + num);
            else
                newString += s.charAt(i);
        }
        System.out.println(newString);
    }
}

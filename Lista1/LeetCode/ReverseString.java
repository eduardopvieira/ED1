public class ReverseString {
   
    public static void reverseString(char[] s) {
        int len = s.length;
        char[] revString = new char[len];
       
        for (int i = 0; i < len; i++) {
            char letra  = s[len-1-i];
            revString[i] = letra;
        }
        System.out.println(revString);
    }
    public static void main(String[] args) {
        char[] s = {'H', 'e', 'l', 'l', 'o'};
        reverseString(s);
    }
}

public class Main {

    // 1. parenthesesCheck
    public static boolean parenthesesCheck(String str){
        int count=0;
        for (int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if (c=='('){
                count++;
            } else if (c==')') {
                count--;
            }
            if (count<0){
                return false;
            }
        }
        return count==0;
    }

    // 2. reverseInteger
    public static String reverseInteger(int num){
        String numString = num+"";
        String result1 ="";
        for (int i=numString.length()-1;i>=0;i--){
            result1 += numString.charAt(i);
        }
        return result1;
    }

    // 3. encryptThis
    public static String encryptThis(String str){
        String result2="";
        for (int i=0;i<str.length();i++){
            int index=str.length()-
            if ()

        }
    }

    // 4. decipherThis


}
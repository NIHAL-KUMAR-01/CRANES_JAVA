package Lab_Program_13;

public class LongestCommonPrefix {
    public static void commomPrefix(String arr[]){
        int maxLen = Integer.MAX_VALUE;
        String smallestStr="";
        for(String s : arr){
            if(maxLen > s.length()){
                maxLen = s.length();
                smallestStr = s;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < smallestStr.length(); i++) {
            char currentChar = smallestStr.charAt(i);
            boolean yes = true;
            for (String eachWord : arr) {
                if (eachWord.charAt(i) != currentChar) {
                    yes = false;
                    break;
                }
            }
            if (yes) {
                sb.append(currentChar);
            } else {
                break;
            }
        }

        System.out.println("Longest Commom Prefix: " + sb.toString());
    }
    public static void main(String[] args) {
        commomPrefix(new String[]{"chem", "chesical", "chemistry"});
    }
}
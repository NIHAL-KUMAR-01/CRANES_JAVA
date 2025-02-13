public class String_5 {
    public static void main(String[] args) {
        String name = " Nihal Kumar";
        name = name.toLowerCase();
        String vowel = "aeiou";
        int count = 0;

        for (int i = 0; i < name.length(); i++) {
            if (vowel.indexOf(name.charAt(i)) != -1) { 
                count++;
            }
        }

        System.out.println("Number of vowels in the string: " + count);
    }
}


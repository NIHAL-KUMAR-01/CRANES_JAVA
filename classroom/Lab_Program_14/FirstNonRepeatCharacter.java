package Lab_Program_14;
public class FirstNonRepeatCharacter {
    public static void main(String[] args) {
        String input = "programming";

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            boolean isUnique = true;

            for (int j = 0; j < input.length(); j++) {
                if (i != j && input.charAt(j) == currentChar) {
                    isUnique = false;
                    break; 
                }
            }

            if (isUnique) {
                System.out.println("First non-repeating character: " + currentChar);
                return;
            }
        }

        System.out.println("No non-repeating character found.");
    }
}


public class UniqueCharacterFinder {
    public static void findUniqueCharacters(String inputString) {
        StringBuilder uniqueChars = new StringBuilder();
        
        for (int i = 0; i < inputString.length(); i++) {
            char currentChar = inputString.charAt(i);
            boolean isUnique = true;
            
            for (int j = 0; j < uniqueChars.length(); j++) {
                if (uniqueChars.charAt(j) == currentChar) {
                    isUnique = false;
                    break;
                }
            }
            
            if (isUnique) {
                uniqueChars.append(currentChar);
            }
        }
        
        System.out.println("Unique characters: " + uniqueChars);
        System.out.println("Number of unique characters: " + uniqueChars.length());
    }

    public static void main(String[] args) {
        findUniqueCharacters("abcd");
    }
}
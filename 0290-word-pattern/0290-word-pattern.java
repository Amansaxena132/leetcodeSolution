class Solution {

    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (pattern.length() != words.length) return false; // Quick length check

        Map<Character, String> charToWord = new HashMap<>();
        Map<String, Character> wordToChar = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String word = words[i];

            if (!charToWord.getOrDefault(c, word).equals(word)
               || !wordToChar.getOrDefault(word, c).equals(c)) {
                return false; 
            }

            charToWord.put(c, word);
            wordToChar.put(word, c);
        }

        return true;
    }
}

public class ExerciseOnString {
        
        // The goal of this exercise is to convert a string to a new string where each character in the new string is "(" if
        //that character appears only once in the original string, or ")" 
        //if that character appears more than once in the original string.
        //Ignore capitalization when determining if a character is a duplicate.
        
        static String encode(String word){
            int[] arrayOfDuplicateValue = new int[127];
            word = word.toLowerCase();
            String str = "";
            int indexToIncreaseOnArray;
            for (int i = 0; i < word.length(); i++) {
                indexToIncreaseOnArray = getIndexToIncreaseArray(word, i);
                arrayOfDuplicateValue[indexToIncreaseOnArray]++;
            }
            for (int i = 0; i < word.length(); i++) {
                indexToIncreaseOnArray = getIndexToIncreaseArray(word, i);
                str += arrayOfDuplicateValue[indexToIncreaseOnArray] != 1 ? ')': '(';
            }
            word = str;
            return word;
        }

    private static int getIndexToIncreaseArray(String word, int i) {
        int indexToIncreaseOnArray;
        if(word.charAt(i)>='a' && word.charAt(i)<='z'){
            indexToIncreaseOnArray = (word.charAt(i))-97;
        }
        else{
            indexToIncreaseOnArray = (word.charAt(i));
        }
        return indexToIncreaseOnArray;
    }
}

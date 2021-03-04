public class ExerciseOnString {
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

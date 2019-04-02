public class PalindromeChecker {


    public static boolean isPalindrome(String text) {


        if (text == null) {
            return false;
        }

        if (text.length() == 0) {
            return false;
        }
        char firstLetter = text.charAt(0);
        text = text.replaceAll("\\s+","");

        for (int i = 1; i < text.length(); i++) {
            if (text.charAt(i - 1) != text.charAt(text.length() - i)) {
                return false;
            }
        }

        return true;

    }

}

/*zwraca trune */
/* 5. powinien zwracac false kiedy index na pozycji n i dlugosc - nty char jest inna */
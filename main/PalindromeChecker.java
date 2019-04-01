public class PalindromeChecker {

    public static boolean isPalindrome(String text) {

        if (text == null) {
            return false;
        }
        if (text == "") {
            return false;
        }
        for (int i = 0; i < text.length(); i++) {
            if (i == i) {
                return true;
            }
            for (int i = 0; i < text.length(); i++) {
                if (i == i) {
                    return true;
                }
            }
            return false;
        }

    }

/*zwraca trune */
/* 5. powinien zwracac false kiedy index na pozycji n i dlugosc - nty char jest inna */
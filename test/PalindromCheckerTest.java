import org.junit.Assert;
import org.junit.Test;

public class PalindromCheckerTest {

    // tu znajduja sie testy, zadanie polega na zaimplementowaniu zgodnie z TDD (test driven development) metody testowanej tu
    // jezeli masz bledy, to wystarczy na classpatha dodac junit4
    // innymi slowami - lec po kazdym tescie po kolei, od gory do dolu, dopisujac troche logiki, tak zeby kolejny test przechodzil
    // zeby odpalic wszystkie testy CTRL + SHIFT + F10 bedac na linijce 4, jak bedziesz na linijce z metoda, odpali sie tylko jeden test
    // jak na razie przechodza 3 testy z 6

    @Test
    public void shouldReturnFalseWhenNull() {
        // given
        String tested = null;
        // when
        boolean result = PalindromeChecker.isPalindrome(tested);
        // then
        Assert.assertFalse(result);
    }

    @Test
    public void shouldReturnFalseWhenLength0() {
        // given
        String tested = "";
        // when
        boolean result = PalindromeChecker.isPalindrome(tested);
        // then
        Assert.assertFalse(result);
    }

    @Test
    public void shouldReturnTrueWhenAllCharsSame() {
        // given
        String tested = "aaaaa";
        // when
        boolean result = PalindromeChecker.isPalindrome(tested);
        // then
        Assert.assertTrue(result);
    }

    @Test
    public void shouldReturnTrueWhenIndexedOnPositionNAndLengthMinusNCharIsTheSameOne() {
        // given
        String tested = "oko";
        // when
        boolean result = PalindromeChecker.isPalindrome(tested);
        // then
        Assert.assertTrue(result);
    }

    @Test
    public void shouldReturnFalseWhenIndexedOnPositionNAndLengthMinusNCharIsAnotherOne() {
        // given
        String tested = "okno";
        // when
        boolean result = PalindromeChecker.isPalindrome(tested);
        // then
        Assert.assertFalse(result);
    }

    @Test
    public void shouldReturnTrueWhenPalindromeIgnoringSpaces() {
        // given
        String tested = "i co idioci";
        // when
        boolean result = PalindromeChecker.isPalindrome(tested);
        // then
        Assert.assertTrue(result);
    }

}
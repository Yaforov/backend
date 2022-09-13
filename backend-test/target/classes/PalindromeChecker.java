
public class PalindromeChecker {

    /**
     * Написать 2-3 метода которые что то делают
     * и сделать на каждый необходимый набор юнит тестов
     */

    // A roza upala na Lapu Azora
    // 1) abba
    // 2) aba
    // 3) a  aab a aa
    // 4) a  aab a a
    // 5) abbc
    // 6) Ab bB a
    public boolean isPalindrome(String text) {
        return text.replaceAll("\\W", "")
                .equalsIgnoreCase(new StringBuilder(text.replaceAll("\\W", ""))
                        .reverse().toString());
    }

    public boolean isSravntnieBolheNull(int a) {
        if (a > 0) {
            return true;
        }
        return false;
    }
}
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PalindromeCheckerTest {
    private static PalindromeChecker resolver;

    @BeforeAll
    static void beforeAll() {
        resolver = new PalindromeChecker();
    }

    @Test
    @DisplayName("abba - true ")
    void baseTest() {
        boolean test = resolver.isPalindrome("abba");
        assertThat(test).isEqualTo(true);
    }

    @Test
    @DisplayName("aba - true")
    void baseTest1() {
        boolean test = resolver.isPalindrome("aba");
        assertThat(test).isEqualTo(true);
    }

    @Test
    @DisplayName("a  aab a aa - true")
    void baseTest2() {
        boolean test = resolver.isPalindrome("a  aab a aa");
        assertThat(test).isEqualTo(true);
    }

    @Test
    @DisplayName("a  aab a a - false")
    void baseTest3() {
        boolean test = resolver.isPalindrome("a  aab a a");
        assertThat(test).isEqualTo(false);
    }

    @Test
    @DisplayName("abbc -false")
    void baseTest4() {
        boolean test = resolver.isPalindrome("abbc");
        assertThat(test).isEqualTo(false);
    }

    @Test
    @DisplayName("Ab bB a - true")
    void baseTest5() {
        boolean test = resolver.isPalindrome("Ab bB a");
        assertThat(test).isEqualTo(true);
    }

    @Test
    @DisplayName("A roza upala na Lapu Azora - true")
    void baseTest6() {
        boolean test = resolver.isPalindrome("A roza upala na Lapu Azora");
        assertThat(test).isEqualTo(true);
    }
    @Test
    @DisplayName("is Null")
    void baseTest7() {
        boolean test = resolver.isSravntnieBolheNull(0);
        assertThat(test).isEqualTo(false);
    }
    @Test
    @DisplayName("is Pologitelnoe")
    void baseTest8() {
        boolean test = resolver.isSravntnieBolheNull(7);
        assertThat(test).isEqualTo(true);
    }
    @Test
    @DisplayName("is Otrizatelnoe")
    void baseTest9() {
        boolean test = resolver.isSravntnieBolheNull(-7);
        assertThat(test).isEqualTo(false);
    }

}


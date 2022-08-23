import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class AccountTests {
    private final String name;
    private final boolean expectedResult;

    public AccountTests(String name, boolean expectedResult) {
        this.name = name;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters(name = "Name={0}; result={1}")
    public static Object[][] getName() {
        return new Object[][]{
            {"Hei Arnold", true},
            {"HeiArnold", false},
            {" Hei Arnold", false},
            {"Hei Arnold ", false},
            {" HeiArnold", false},
            {"HeiArnold ", false},
            {"He", false},
            {"Hei Arnoldjghujhgthg", false},
            {"Hei Arnoldjghujhgt", true},
            {"Hei  Arnold", false},
            {null, false},
            {"", false}
        };
    }

    @Test
    public void checkName() {
        Account account = new Account(name);
        assertEquals("ОК", expectedResult, account.checkNameToEmboss());
    }
}
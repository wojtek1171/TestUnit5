package sda.user;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.assertTrue;

@RunWith(JUnitParamsRunner.class)
public class UserDatabaseTest {

    private UserDatabase userDB;
    private User testUser;

    @Before
    public void setUp() {
        this.userDB = new UserDatabase();
        this.testUser = new User("asa@d.p", "sdadfgdfgds");

    }

    @Test
    public void addTest() {

        userDB.add(testUser);
        int result = userDB.getByLogin("asa@d.p").getId();

        Assert.assertEquals(1,result);
    }

    @Test
    @Parameters({"dd", "assss", "asdasdasdasd"})
    public void containsEmailTest ( String email) {
        testUser = new User(email, "sdadfgdfgds");
        userDB.add(testUser);
        boolean result = userDB.containsEmail(testUser.getEmail());
        assertTrue(result);
    }
}

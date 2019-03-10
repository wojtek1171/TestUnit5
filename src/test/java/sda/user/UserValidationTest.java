package sda.user;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertTrue;

@RunWith(JUnitParamsRunner.class)
public class UserValidationTest {

    private UserValidation userVal;
    private User testUser;

    @Before
    public void setUp() {

        this.userVal = new UserValidation();
        this.testUser = new User("asa@d.p", "sdadfgdfgds");

    }

    @Test
    public void validEmailTest() {

        boolean result = userVal.validEmail(testUser.getEmail());
        Assert.assertTrue(result);
    }

    @Test
    public void validPasswordTest() {

        boolean result = userVal.validPassword(testUser.getPassword());
        Assert.assertTrue(result);
    }

    @Test
    public void validUserTest() {

        boolean result = userVal.validUser(testUser);
        Assert.assertTrue(result);
    }

    @Test
    @Parameters({"dd", "assss", "asdasdasdasd"})
    public void validEmailTest2 ( String email) {
        testUser = new User(email, "sdadfgdfgds");
        boolean result = userVal.validEmail(testUser.getEmail());
        assertTrue(result);
    }




}

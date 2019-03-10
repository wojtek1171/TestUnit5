package sda.user;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

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



}

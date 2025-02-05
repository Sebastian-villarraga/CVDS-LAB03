package edu.eci.cvds.tdd.library.user;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserTest {

    @Test
    public void testSetAndGetName() {
        User user = new User();
        user.setName("Andrés");
        assertEquals("Andrés", user.getName());
    }

    @Test
    public void testSetAndGetId() {
        User user = new User();
        user.setId("Sebastian21");
        assertEquals("Sebastian21", user.getId());
    }
}

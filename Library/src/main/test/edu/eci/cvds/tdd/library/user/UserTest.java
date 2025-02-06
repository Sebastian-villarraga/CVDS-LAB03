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

    @Test
    public void testSetNameNull() {
        User user = new User();
        user.setName(null);
        assertNull(user.getName(), "El nombre no debería ser nulo");
    }

    @Test
    public void testSetIdNull() {
        User user = new User();
        user.setId(null);
        assertNull(user.getId(), "El ID no debería ser nulo");
    }

    @Test
    public void testSetNameEmpty() {
        User user = new User();
        user.setName("");
        assertEquals("", user.getName(), "El nombre no debería estar vacío");
    }

    @Test
    public void testSetIdEmpty() {
        User user = new User();
        user.setId("");
        assertEquals("", user.getId(), "El ID no debería estar vacío");
    }

    @Test
    public void testSetNameWithSpecialCharacters() {
        User user = new User();
        user.setName("!@# $%^&*()");
        assertEquals("!@# $%^&*()", user.getName(), "El nombre con caracteres especiales debería ser aceptado");
    }

    @Test
    public void testSetIdWithSpecialCharacters() {
        User user = new User();
        user.setId("user!@123");
        assertEquals("user!@123", user.getId(), "El ID con caracteres especiales debería ser aceptado");
    }
}

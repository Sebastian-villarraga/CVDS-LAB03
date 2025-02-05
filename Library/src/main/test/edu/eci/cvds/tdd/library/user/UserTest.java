package edu.eci.cvds.tdd.library.user;

<<<<<<< HEAD
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
=======
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class UserTest {

    private User user;

    // Configuración inicial para cada prueba
    @Before
    public void setUp() {
        user = new User();
    }

    // Prueba para el método getName y setName
    @Test
    public void testSetGetName() {
        String expectedName = "Juan Perez";
        user.setName(expectedName);
        String actualName = user.getName();
        assertEquals("El nombre no coincide", expectedName, actualName);
    }

    // Prueba para el método getId y setId
    @Test
    public void testSetGetId() {
        String expectedId = "12345";
        user.setId(expectedId);
        String actualId = user.getId();
        assertEquals("El ID no coincide", expectedId, actualId);
    }

    // Prueba para el método getName con valor nulo
    @Test
    public void testGetNameWhenNameIsNull() {
        // Al principio, el nombre debería ser null
        assertNull("El nombre debería ser null al principio", user.getName());
    }

    // Prueba para el método getId con valor nulo
    @Test
    public void testGetIdWhenIdIsNull() {
        // Al principio, el ID debería ser null
        assertNull("El ID debería ser null al principio", user.getId());
>>>>>>> bc3dead29a5d7d629d60b89d5366c69a1651099c
    }
}

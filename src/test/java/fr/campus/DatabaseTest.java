package fr.campus;

import org.junit.Test;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import static org.junit.Assert.*;

public class DatabaseTest {

    @Test
    public void shouldConnect() {
        try {
            Connection connexion = Database.getConnection();
            assertNotNull(connexion);
        }catch(SQLException e){
            assertTrue(false);
        }
    }
    @Test
    public void shouldContainHeroes() {
        List<?> heroes = Database.getHeroes();
        assertNotNull(heroes);
        assertEquals(2, heroes.size());
    }
}

package fr.campus;

import org.junit.Test;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import static org.junit.Assert.*;

public class DatabaseTest {

    @Test
    public void shouldConnect() { // je test ma connection
        try {
            Connection connexion = Database.getConnection();
            assertNotNull(connexion);
        }catch(SQLException e){
            assertTrue(false);
        }catch (IOException e){
            assertTrue(false);
        }
    }
    @Test
    public void shouldContainHeroes() { // je test si ma requête fonctionne
        List<?> heroes = Database.getHeroes();
        assertNotNull(heroes);
        assertEquals(2, heroes.size());
    }
}

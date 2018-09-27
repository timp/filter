package uk.pizey.tim;

import static junit.framework.TestCase.assertNotNull;
import static junit.framework.TestCase.assertNull;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import java.io.InputStream;
import java.util.Properties;


public class MainTest {


    /**
     * Test for the construction of Main and the 
     * main method being called
     *
     */
    @Test
    public void testFilteredProperties() throws Exception{
        Properties p = new Properties();
        InputStream input = this.getClass().getResourceAsStream(
                "filtered.properties");
        assertNotNull(input);
        p.load(input);
        assertNull(p.getProperty("undefinedKey"));

        assertEquals("${notDefined}", p.getProperty("missing"));
        assertEquals("${env.notDefined}", p.getProperty("missingEnv"));
        assertEquals("${settings.notDefined}", p.getProperty("missingSetting"));

        assertEquals("defined", p.getProperty("defined"));
        assertNotNull(p.getProperty("home"));
        assertTrue(p.getProperty("localRepository").endsWith("repository"));
        assertEquals("firstKeyValue", p.getProperty("key1"));

    }
}



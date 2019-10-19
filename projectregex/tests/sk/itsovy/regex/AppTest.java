package sk.itsovy.regex;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    App a = new App();


    @Test
    void calInstallment() {
        assertEquals(0,a.calInstallment(0,56,85));
        assertEquals(300,a.calInstallment(500,10,2));
    }

    @Test
    void calHypotenuse() {
    }

    @Test
    void reverse() {
    }

    @Test
    void formatName(){
        assertEquals("Jano Zavacky",a.formatName("jAno ZAvACky"));
        assertEquals("Adam Horvath",a.formatName("adam horvath"));
        assertEquals("Adam Kovac",a.formatName("adam    kovac"));
    }
}
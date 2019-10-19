package sk.itsovy.regex;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


//setUp() metoda na zaciaku vytvori objekty a vsetko co potrebujeme na testy
//                   -alebo vytvori userov pre databazu,....
//tearDown() sa vymazu a zacistia




class RegexTest {

            Regex r = new Regex();


    @Test
    void checkMail() {
        assertTrue(r.checkMail("janko@azet.sk"));
        assertTrue(r.checkMail("tomhanks@70sx.sk"));
        assertTrue(r.checkMail("15@86.sk"));
        assertTrue(r.checkMail("i-a-0-7@azet.sk"));
        assertTrue(r.checkMail("janko@azet.sk"));
        assertTrue(r.checkMail("SG_SG.S@azet.sk"));

        assertFalse(r.checkMail("@"));
        assertFalse(r.checkMail("jNO.COM"));
        assertFalse(r.checkMail("it@jNO.54"));
        assertFalse(r.checkMail("jan novak@sme.sk"));
        assertFalse(r.checkMail("j@global.logic"));

    }

    @Test
    void checkIBAN() {
        assertTrue(r.checkIBAN("SK08 1548 4586 5846 1562 1548"));
        assertTrue(r.checkIBAN("SK99 9999 9999 9999 9999 9999"));
        assertTrue(r.checkIBAN("SK0815484586584615621548"));

        assertFalse(r.checkIBAN("ad25 1536 1524 2548 2541 8687"));
        assertFalse(r.checkIBAN("ad25 1536 1524 258 241 8687"));
        assertFalse(r.checkIBAN("ad25 1536 15242558 2441 8687"));
        assertFalse(r.checkIBAN("ad25 15536 15242558 2441 8687"));
        assertFalse(r.checkIBAN(""));
        assertFalse(r.checkIBAN("15486464684454654115"));


    }

    @Test
    void checkPhoneNumber() {
    }
}
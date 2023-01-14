package tdd_project;

import org.junit.Test;

import static org.junit.Assert.*;

public class ServiceTest {

    @Test
    public void getNthUpperCharacterEmptyString() {
        //setup
        Service service = new Service();
        String result = service.getNthUpperCharacter("", 3);
        //verify
        assertEquals("", result);
    }

    @Test
    public void getNthUpperCharacterNEqualToZero() {
        //setup
        Service service = new Service();
        String result = service.getNthUpperCharacter("", 0);
        //verify
        assertEquals("", result);
    }

    @Test
    public void getNthUpperCharacterNIsNegative() {
        //setup
        Service service = new Service();
        String result = service.getNthUpperCharacter("", -1);
        //verify
        assertEquals("", result);
    }

    @Test
    public void getNthUpperCharacterNoUpperCase() {
        //setup
        Service service = new Service();
        String result = service.getNthUpperCharacter("itclinical", 1);
        //verify
        assertEquals("", result);
    }

    @Test
    public void getNthUpperCharacterAllUpperCase() {
        //setup
        Service service = new Service();
        String result = service.getNthUpperCharacter("ITCLINICAL", 1);
        //verify
        assertEquals("ITCLINICAL", result);
    }


    @Test
    public void getNthUpperCharacterNIsOne() {
        //setup
        Service service = new Service();
        String result = service.getNthUpperCharacter("ITCLiNicAl", 1);
        //verify
        assertEquals("ITCLNA", result);
    }

    @Test
    public void getNthUpperCharacterNIsTwo() {
        //setup
        Service service = new Service();
        String result = service.getNthUpperCharacter("ITCLiNicAl", 2);
        //verify
        assertEquals("TLN", result);
    }

    @Test
    public void getNthUpperCharacterNIsBiggerThanTheString() {
        //setup
        Service service = new Service();
        String result = service.getNthUpperCharacter("ITCLiNicAl", 100);
        //verify
        assertEquals("", result);
    }

    @Test
    public void getNthUpperCharacterReturnUpperOrSpecialChar() {
        //setup
        Service service = new Service();
        String result = service.getNthUpperCharacter("!tCL1Nical", 1);
        String result2 = service.getNthUpperCharacter("!tCliniC@l!1!", 1);

        //verify
        assertEquals("!CL1N", result);
        assertEquals("!CC@!1!", result2);
    }

    @Test
    public void getNthUpperCharacterNullCase() {
        //setup
        Service service = new Service();
        String result = service.getNthUpperCharacter(null, 1);

        //verify
        assertEquals("", result);
    }

    @Test
    public void getNthUpperCharacterOnlySpecialChar() {
        //setup
        Service service = new Service();
        String result = service.getNthUpperCharacter("!tcl!nical!", 1);
        //verify
        assertEquals("!!!", result);
    }

}

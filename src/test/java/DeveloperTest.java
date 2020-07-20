import staff.techStaff.Developer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Tim Canterbury", "DE505050F", 31000);
    }

    @Test
    public void hasName(){
        assertEquals("Tim Canterbury", developer.getName());
    }

    @Test
    public void hasNationalInsuranceNUmber(){
        assertEquals("DE505050F", developer.getNINumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(31000, developer.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary(){
        developer.raiseSalary(2);
        assertEquals(33150, developer.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals(310, developer.payBonus(), 0.01);
    }
}

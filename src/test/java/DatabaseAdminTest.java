import staff.techStaff.DatabaseAdmin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Gareth Keenan", "GH505050I", 27500);
    }

    @Test
    public void hasName(){
        assertEquals("Gareth Keenan", databaseAdmin.getName());
    }

    @Test
    public void hasNationalInsuranceNUmber(){
        assertEquals("GH505050I", databaseAdmin.getNINumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(27500, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary(){
        databaseAdmin.raiseSalary(5);
        assertEquals(28875, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals(275, databaseAdmin.payBonus(), 0.01);
    }
}

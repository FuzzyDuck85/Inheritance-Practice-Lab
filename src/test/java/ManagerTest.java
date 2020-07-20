import staff.management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {
    Manager manager;

    @Before
    public void before(){
        manager = new Manager("David Brent", "AB505050C", 38000, "Paper");
    }

    @Test
    public void hasName(){
        assertEquals("David Brent", manager.getName());
    }

    @Test
    public void hasNationalInsuranceNUmber(){
        assertEquals("AB505050C", manager.getNINumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(38000, manager.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(6);
        assertEquals(40280, manager.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals(380, manager.payBonus(), 0.01);
    }

    @Test
    public void hadDept(){
        assertEquals("Paper", manager.getDeptName());
    }

    @Test
    public void canChangeName(){
        manager.setName("Mr Blobby");
        assertEquals("Mr Blobby", manager.getName());
    }

    @Test
    public void cannotEnterNullForName(){
        manager.setName(null);
        assertEquals("Invalid Entry", manager.getName());
    }


}

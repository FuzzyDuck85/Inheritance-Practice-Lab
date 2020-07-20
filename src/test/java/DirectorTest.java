import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;
import staff.management.board.Director;

import static org.junit.Assert.assertEquals;

public class DirectorTest {
    Director director;

    @Before
    public void before(){
        director = new Director("Dawn Tinsley", "JK505050L", 46000, "Paper", 750000);
    }

    @Test
    public void hasName(){
        assertEquals("Dawn Tinsley", director.getName());
    }

    @Test
    public void hasNationalInsuranceNUmber(){
        assertEquals("JK505050L", director.getNINumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(46000, director.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary(){
        director.raiseSalary(8);
        assertEquals(49680, director.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals(920, director.payBonus(), 0.01);
    }

    @Test

    public void hadDept(){
        assertEquals("Paper", director.getDeptName());
    }

    @Test

    public void hasBudget(){
        assertEquals(750000, director.getBudget(), 0.01);
    }

}

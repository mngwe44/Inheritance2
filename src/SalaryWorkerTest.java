import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SalaryWorkerTest {
    SalaryWorker salaryWorker = new SalaryWorker("Alice", "Johnson", "S001", "Mrs.", 1983, 52000);

    @Test
    void testCalculateWeeklyPay() {
        assertEquals(1000.00, salaryWorker.calculateWeeklyPay(40), 0.01); // 52000/52
        assertEquals(1000.00, salaryWorker.calculateWeeklyPay(50), 0.01); // Still 52000/52
    }

    @Test
    void testToCSV() {
        assertEquals("Alice,Johnson,S001,Mrs.,1983,0.0,52000.0", salaryWorker.toCSV());
    }

    @Test
    void testToXML() {
        assertTrue(salaryWorker.toXML().contains("<AnnualSalary>52000.0</AnnualSalary>"));
    }

    @Test
    void testToJSON() {
        assertTrue(salaryWorker.toJSON().contains("\"AnnualSalary\": 52000.0"));
    }
}
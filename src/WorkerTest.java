import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WorkerTest {
    Worker worker = new Worker("John", "Doe", "W001", "Mr.", 1985, 25.00);

    @Test
    void testCalculateWeeklyPay_NoOvertime() {
        assertEquals(1000.00, worker.calculateWeeklyPay(40), 0.01);
    }

    @Test
    void testCalculateWeeklyPay_WithOvertime() {
        assertEquals(1375.00, worker.calculateWeeklyPay(50), 0.01); // 40*25 + 10*37.5
    }

    @Test
    void testCalculateWeeklyPay_ZeroHours() {
        assertEquals(0.00, worker.calculateWeeklyPay(0), 0.01);
    }

    @Test
    void testToCSV() {
        assertEquals("John,Doe,W001,Mr.,1985,25.0", worker.toCSV());
    }

    @Test
    void testToXML() {
        assertTrue(worker.toXML().contains("<HourlyPayRate>25.0</HourlyPayRate>"));
    }

    @Test
    void testToJSON() {
        assertTrue(worker.toJSON().contains("\"HourlyPayRate\": 25.0"));
    }
}

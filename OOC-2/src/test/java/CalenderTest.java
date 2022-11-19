import assignment1.Calender;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalenderTest {
    @Test
    public void testDay(){
        Calender c = new Calender(12,3,2022);

        String nextDate =  c.calenderMaking(3,12,2022);
        assertEquals("13-3-2022",nextDate);

    }

    @Test
    public void testMonth()
    {
        Calender c = new Calender(31,3,2022);
        String nextMonth = c.calenderMaking(3,31,2022);
        assertEquals("1-4-2022",nextMonth);

    }
    @Test
    public void testYear()
    {
        Calender c = new Calender(31,12,2022);
        String nextYear = c.calenderMaking(12,31,2022);
        assertEquals("1-1-2023",nextYear);

    }

    @Test
    public void leapYearTest()
    {
        Calender c = new Calender(29,2,2004);
        boolean IsLeapYear = true;
        c.IfLeapYear();
        assertEquals(true,IsLeapYear);
        String nextDate = c.calenderMaking(2,29,2004);
        assertEquals("1-3-2004",nextDate);
    }
}

package assignment1;

public class Calender {
    int day;
    int month;
    int year;
    int arr[]={1,2,3,4,5,6,7,8,9,10,11,12};

    public boolean IfLeapYear()
    {

        if(month == 2)
        {
            if(year %400 == 0 || year %4 ==0 && year%100 !=0)
            {
                return true;
            }
        }
        return false;

    };

    public boolean ifMonthWith30Days(int month)
    {
        if(month == 1 || month == 3 || month == 5 ||
                month == 7 || month == 8 || month == 10)
        {
            return true;
        }
        return false;
    }

    public boolean ifMonthWith31Days(int month)
    {
        if(month == 4 || month == 6 || month == 9 ||
                month == 11 )
        {
            return true;
        }
        return false;
    }

    public boolean fabruary(int month)
    {
        if(month==2)
        {
            return true;
        }
        return false;
    }


    public void calenderMaking(int month,int day,int year) {
        if (ifMonthWith30Days(month) && day == 31) {
            day = 1;
            month++;
        } else if (ifMonthWith30Days(month) && day == 30) {
            day = 1;
            month++;
        } else if ((month == 12) && day == 31) {
            day = 1;
            month++;
            year++;
        } else if (fabruary(month)) {
            if (IfLeapYear() && day == 29) {
                day = 1;
                month++;
            } else {
                if (day == 28) {
                    day = 1;
                    month++;
                }
            }

        }


    }
}

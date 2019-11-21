package Day21.HW21_2;

public class Time {

    String[] stringWeekDay = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
    int intWeekDay;
    int day;
    int month;
    int year;
    int hours;
    int minutes;
    int seconds;

    public Time() {
    }

    public Time(int intWeekDay, int day, int month, int year, int hours, int minutes, int seconds) {
        setDay(day);
        setMonth(month);
        setYear(year);
        setHours(hours);
        setMinutes(minutes);
        setSeconds(seconds);
    }

    public Time(int day, int month, int year, int intWeekDay) {
        setIntWeekDay(intWeekDay);
        setDay(day);
        setMonth(month);
        setYear(year);
    }

    public String[] getStringWeekDay() {
        return stringWeekDay;
    }

    public int getIntWeekDay() {
        return intWeekDay;
    }

    public void setIntWeekDay(int intWeekDay) {
        if (intWeekDay < 1 || intWeekDay > 7) {
            printSetError("weekday");
            return;
        }
        this.intWeekDay = intWeekDay;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        if (hours > 24 || hours < 0) {
            printSetError("hours");
            return;
        }
        this.hours = hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        if (minutes > 60 || minutes < 0) {
            printSetError("minutes");
            return;
        }
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        if (seconds < 0 || seconds > 60) {
            printSetError("seconds");
            return;
        }
        this.seconds = seconds;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (day < 1 || day > 31) {
            printSetError("days");
            return;
        }
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month < 1 || month > 12) {
            printSetError("months");
            return;
        }
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year < 0) {
            printSetError("years");
            return;
        }
        this.year = year;
    }

    private void printSetError(String reason) {
        System.out.println("Setting " + reason + " error");
    }

    public void addHours(int aHour) {
        hours += aHour;
        if (hours > 24) {
            day += hours / 24;
            hours %= 24;
        }
        if (day > 31) {
            month += day / 31;
            day %= 31;
        }
        if (month > 12) {
            year += month / 12;
            month %= 12;
        }
    }


//    public String getDate() {
//        return "" + stringWeekDay[intWeekDay] + " " + day + "/" + month + "/" + year + " " + hours + ":" + minutes;
//    }

    @Override
    public String toString() {
        return "" + stringWeekDay[intWeekDay] + " " + day + "/" + month + "/" + year + " " + hours + ":" + minutes;
    }
}
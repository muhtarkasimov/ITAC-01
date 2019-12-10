package Day36.CW36_2;

public class CW36_2 {

    public static void main(String[] args) {

        WeekDays day = WeekDays.Friday;

//        if (day.ordinal() == WeekDays.Monday.ordinal()
//                || day.ordinal() == WeekDays.Wednesday.ordinal()
//                || day.ordinal() == WeekDays.Friday.ordinal()) {
//            System.out.println("I am studying on " + day);
//        } else {
//            System.out.println("I am not studying on " + day);
//        }

        switch (day) {
            case Monday:
            case Wednesday:
            case Friday:
                System.out.println("I am studying on " + day);
                break;
            default:
                System.out.println("I am not studying on " + day);
        }

    }
}

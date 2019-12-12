package Day36.CW36_2;

public enum WeekDays {
    Monday("Понедельник"),
    Tuesday("Вторник"),
    Wednesday("Среда"),
    Thursday("Четверг"),
    Friday("Птяница"),
    Saturday("Суббота"),
    Sunday("Воскресение");

    private String rusName;

    WeekDays(String rusName) {
        this.rusName = rusName;
    }

    public String getRusName() {
        return rusName;
    }
}

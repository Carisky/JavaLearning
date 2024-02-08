package src.enums;

public enum Month {
    JENUARY(31,"Winter"),
    FEBRUARY(28,"Winter"),
    MARCH(30,"Spring");
    private int countDays;
    private String season;

    Month(int countDays, String season) {
        this.countDays = countDays;
        this.season = season;
    }


}

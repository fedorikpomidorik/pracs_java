package practical_works.prac_4;

public enum Seasons {
    WINTER(-2),
    SPRING(12),
    SUMMER(28),
    AUTUMN(10);

    private final int averageTemperature;

    public static void printSeasonDescription(Seasons season) {
        switch (season) {
            case SPRING -> System.out.println("Я люблю весну");
            case SUMMER -> System.out.println("Я люблю лето");
            case AUTUMN -> System.out.println("Я люблю осень");
            case WINTER -> System.out.println("Я люблю зиму");
        }
    }

    public int getAverageTemperature() {
        return averageTemperature;
    }

    Seasons(int averageTemperature) {
        this.averageTemperature = averageTemperature;
    }

    public String getDescription() {
        if (this == SUMMER) {
            return "Теплое время года";
        } else {
            return "Холодное время года";
        }
    }
}
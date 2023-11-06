package practical_works.prac_4;

public class Tester {
    public static void main(String[] args) {
        Seasons myFavoriteSeason = Seasons.AUTUMN;
        System.out.println("Мое любимое время года: " + myFavoriteSeason);
        System.out.println("Средняя температура: " + myFavoriteSeason.getAverageTemperature() + "°C");
        System.out.println("Описание времени года: " + myFavoriteSeason.getDescription());
        System.out.println();
        Seasons.printSeasonDescription(myFavoriteSeason);
        System.out.println();
        for (Seasons season : Seasons.values()) {
            System.out.println("Время года: " + season);
            System.out.println("Средняя температура: " + season.getAverageTemperature() + "°C");
            System.out.println("Описание времени года: " + season.getDescription());
        }
    }
}

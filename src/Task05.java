public class Task05 {
    public static void main(String[] args) {
        int s = 12345678;
        int sec = s%60;
        int m = (s - sec)/60;
        int min = m%60;
        int h = (m-min)/60;
        int hours = h%24;
        int d = (h-hours)/24;
        int days = d%7;
        int weeks = (d-days)/7;
        System.out.println(weeks + "недель" + days+ "дня" + hours + "часа" + min + "минут" + sec + "секунд");
    }
}

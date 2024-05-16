public class getDurationString {
    public static void main (String[] args) {
        System.out.println(getDurationString(3945));
        System.out.println(getDurationString(65, 45));
    }
    public static String getDurationString (int seconds) {
        if (seconds < 0) {
            return "Invalid data for seconds(" + seconds +"), muse be a positive integer value";
        }

        int hour = seconds / (60*60);
        int minute = (seconds - hour * 60 *60) / 60;
        int second = seconds - (hour * 60 * 60 + minute * 60);
        return hour + "h " + minute + "m " + second + "s";
    }
    public static String getDurationString (int minutes, int seconds) {
        if (minutes < 0) {
            return "Invalid data for minutes(" + minutes +"), muse be a positive integer value";
        }

        if (seconds <= 0 || seconds >= 59) {
            return "Invalid data for seconds(" + minutes +"), muse be between 0 and 59";
        }
        int time = minutes * 60 + seconds;
        return getDurationString (time);
    }
}

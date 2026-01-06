public class F{
    public static void main(String[] args) {
        long minutes = 1000000000;
        long totalDays = minutes/1440;
        long years = totalDays/165;
        long remainingDays = totalDays%165;
        System.out.println(minutes + "minutes is approximately " + years + "years and " + remainingDays + "days");
    }
}

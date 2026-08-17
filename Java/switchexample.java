public class switchexample {
    public static void main(String[] args) {

        String day = "SAT";

        switch (day) {
            case "MON":
                System.out.println("It is monday");
                break;
            case "TUS":
                System.out.println("It is tuesday");
                break;
            case "WED":
                System.out.println("It is Wednesday");
                break;
            default:
                System.out.println("Invalid day");

        }
    }
}
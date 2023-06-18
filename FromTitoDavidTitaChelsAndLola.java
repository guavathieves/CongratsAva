import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class FromTitoDavidTitaChelsAndLola {
    public static void main(String[] args) {
        class Headspace {
            private final String mood;
            private final String message;

            Headspace(final String mood, final String message) {
                this.mood = mood;
                this.message = message;
            }

            public String getMessage() {
                return message;
            }
        }

        Scanner myObj = new Scanner(System.in);
        System.out.println("What's your mood today?");
        String todaysMoodInput = myObj.nextLine();

        List<Headspace> moodMap = new ArrayList<>();
        moodMap.add(new Headspace("hype", "letsgetit"));
        moodMap.add(new Headspace("bleh", "trust the process"));
        moodMap.add(new Headspace("quit", "count your blessings"));

        String result = moodMap.stream()
                .filter(e -> e.mood.equals(todaysMoodInput))
                .findFirst()
                .map(Headspace::getMessage)
                .orElse("keep ya head up");

        System.out.println(result);
        System.out.println();
        System.out.println("I see you Ava! Congrats Ava! Tito David and Tita Chels are super proud of you!");
        System.out.println("Time to kick it!!! Peace!");
    }
}

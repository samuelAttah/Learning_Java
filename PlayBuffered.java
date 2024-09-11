import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PlayBuffered {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Kindly Input your userName");
            String userName = reader.readLine();
            if (userName.length() == 0) {

                System.out.println("Invalid userName try again later");
            } else {
                System.out.printf("Welcome %s", userName);

            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}

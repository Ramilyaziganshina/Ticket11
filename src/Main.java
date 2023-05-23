import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[][] pair = {{"1", "11"}, {"2", "22"}};
        String[] result = new String[pair.length];
        for (int i = 0; i < pair.length; i++) {
            result[i] = "\"" + pair[i][0] + "\" " + pair[i][1];
        }
        System.out.println(Arrays.toString(result));
    }
}
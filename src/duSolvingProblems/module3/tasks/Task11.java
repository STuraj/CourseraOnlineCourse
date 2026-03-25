package duSolvingProblems.module3;

public class Task11 {

        public static String findName(String id) {
            if (id.equals("A1")) {
                return "Alice";
            }
            return "";
        }

        public static void main(String[] args) {
            String result = findName("B2");
            if (result.isEmpty()) {
                System.out.println("No match found");
            } else {
                System.out.println(result);
            }
        }
    }


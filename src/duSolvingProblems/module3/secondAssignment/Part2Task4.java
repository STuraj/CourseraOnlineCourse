package duSolvingProblems.module3.secondAssignment;

public class Part2Task4 {
    public void findAbc(String input) {
        int index = input.indexOf("abc");

        while (true) {
            if (index == -1 || index >= input.length() - 3) {
                break;
            }

            String found = input.substring(index + 1, index + 4);
            System.out.println("Found: " + found);

            // print index before updating
            System.out.println("Index before update: " + index);

            // update index
            index = input.indexOf("abc", index + 1);

            // print index after updating
            System.out.println("Index after update: " + index);
        }
    }

    public static void main(String[] args) {
        new Part2Task4().findAbc("abcdkfjsksioehgjfhsdjfhksdfhuwabcabcajfieowj");
    }
}

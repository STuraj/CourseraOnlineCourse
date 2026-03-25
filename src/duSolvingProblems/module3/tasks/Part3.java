package duSolvingProblems.module3;

public class Part3 {
    //Write the method named twoOccurrences that has two String parameters named stringa and stringb.
    // This method returns true if stringa appears at least twice in stringb, otherwise it returns false.
    // For example, the call twoOccurrences(“by”, “A story by Abby Long”) returns true as there are two occurrences of
    // “by”, the call twoOccurrences(“a”, “banana”) returns true as there are three occurrences of “a” so “a” occurs at
    // least twice, and the call twoOccurrences(“atg”, “ctgtatgta”) returns false as
    // there is only one occurence of “atg”.
    public class StringOccurrence {

        public static boolean twoOccurrences(String stringa, String stringb) {
            int firstIndex = stringb.indexOf(stringa); // ilk occurrence
            if (firstIndex == -1) {
                return false; // heç tapılmadı
            }

            // ikinci occurrence üçün axtarış
            int secondIndex = stringb.indexOf(stringa, firstIndex + stringa.length());

            return secondIndex != -1; // tapıldısa true, yoxdursa false
        }

        // Test metodu
        public static void main(String[] args) {
            System.out.println(twoOccurrences("by", "A story by Abby Long")); // true
            System.out.println(twoOccurrences("a", "banana"));                // true
            System.out.println(twoOccurrences("atg", "ctgtatgta"));           // false
        }
    }
}
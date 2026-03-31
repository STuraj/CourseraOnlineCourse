package duSolvingProblems.module5;

import java.util.*;
public class Task1 {



        public static void main(String[] args) {
            List<String[]> records = new ArrayList<String[]>();
            records.add(new String[]{"Emma", "F"});
            records.add(new String[]{"Liam", "M"});
            records.add(new String[]{"Olivia", "F"});

            for (String[] rec : records) {
                String babyName = rec[0];  // index 0 is the name
                String babyGender = rec[1];  // index 1 is the gender
                System.out.println(babyGender + " - " + babyName);
            }
        }
    }


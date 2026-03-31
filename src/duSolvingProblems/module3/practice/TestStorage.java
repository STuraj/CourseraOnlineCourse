

package duSolvingProblems.module3.practice;
import edu.duke.StorageResource;

import java.util.*;


public class TestStorage {
    public static void main(String[] args) {
        // List<String> sr = new ArrayList<>();

        StorageResource sr = new StorageResource();
        sr.add("Alpha");
        sr.add("Beta");
        boolean addGamma = true;
        if (addGamma) {
            sr.add("Gamma");
        }
        sr.add("Delta");
        for (String s : sr.data()) {
            System.out.print(s + " ");
        }
    }
}


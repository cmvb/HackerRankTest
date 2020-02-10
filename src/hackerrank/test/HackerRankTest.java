package hackerrank.test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author veracm
 */
public class HackerRankTest {

    public static void main(String[] args) throws IOException {
        List<String> text = new ArrayList<>();
        text.add("code");
        text.add("aaagmnrs");
        text.add("anagrams");
        text.add("doce");
        text.add("code");
        text.add("edoc");
        text.add("anagrams");
        text.add("doce");

        List<String> result = new ArrayList<>();
        Set<String> anagramas = new HashSet<>();

        int i = 0;
        for (String t : text) {
            List<String> tList = Arrays.asList(t.split(""));
            Collections.sort(tList);

            int j = 0;
            for (String e : text) {
                List<String> eList = Arrays.asList(e.split(""));
                Collections.sort(eList);

                if (i != j) {
                    Object[] charsT = tList.toArray();
                    String tStr = Arrays.toString(charsT).replaceAll(",", "").replaceAll(" ", "").replaceAll("\\[", "").replaceAll("\\]", "");
                    Object[] charsE = eList.toArray();
                    String eStr = Arrays.toString(charsE).replaceAll(",", "").replaceAll(" ", "").replaceAll("\\[", "").replaceAll("\\]", "");
                    if (Arrays.equals(charsT, charsE) && !anagramas.contains(tStr)) {
                        result.add(t);
                        anagramas.add(eStr);
                    }
                }
                j++;
            }
            i++;
        }
        Collections.sort(result);
        System.out.println(result);
    }
}

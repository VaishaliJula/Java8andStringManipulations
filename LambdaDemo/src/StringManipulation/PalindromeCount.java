package StringManipulation;

import java.util.HashSet;
import java.util.Set;

public class PalindromeCount {

    public Set<String> findAllPalindromesUsingBruteForceApproach(String input) {
        Set<String> palindromes = new HashSet<>();
        for (int i = 0; i < input.length(); i++) {
            for (int j = i + 1; j <= input.length(); j++) {
                if (isPalindrome(input.substring(i, j))) {
                    palindromes.add(input.substring(i, j));
                }
            }
        }
        System.out.println("Palidromes"+palindromes);
        System.out.println(palindromes.size());
        return palindromes;
    }

    private boolean isPalindrome(String input) {
        StringBuilder plain = new StringBuilder(input);
        StringBuilder reverse = plain.reverse();
        return (reverse.toString()).equals(input);
    }

    public static void main(String[] args) {
        PalindromeCount palindromeCount = new PalindromeCount();
        palindromeCount.findAllPalindromesUsingBruteForceApproach("tatcactat");
    }
}

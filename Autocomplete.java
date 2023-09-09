import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

public class Autocomplete {

    // creates termArray instance variable
    private Term[] termArray;


    // Initializes the data structure from the given array of terms.
    public Autocomplete(Term[] terms) {
        if (terms == null) {
            throw new IllegalArgumentException();
        }
        else {
            for (int i = 0; i < terms.length; i++) {
                if (terms[i] == null) {
                    throw new IllegalArgumentException();
                }
            }
        }
        termArray = terms.clone();
        Arrays.sort(termArray, Term::compareTo);
    }

    // Returns all terms that start with the given prefix,
    // in descending order of weight.
    public Term[] allMatches(String prefix) {
        if (prefix == null) {
            throw new IllegalArgumentException();
        }
        else {
            Term term = new Term(prefix, 0);
            int startInt = BinarySearchDeluxe.firstIndexOf(termArray, term,
                                                           Term.byPrefixOrder(prefix.length()));
            int finalInt = BinarySearchDeluxe.lastIndexOf(termArray,
                                                          term,
                                                          Term.byPrefixOrder(prefix.length()));
            if (startInt != -1 && finalInt != -1) {
                Term[] secondArray = Arrays.copyOfRange(termArray,
                                                        startInt, finalInt + 1);
                Arrays.sort(secondArray, Term.byReverseWeightOrder());
                return secondArray;
            }
            else {
                Term[] emptyArray = new Term[0];
                return emptyArray;
            }
        }

    }

    // Returns the number of terms that start with the given prefix.
    public int numberOfMatches(String prefix) {
        if (prefix == null) {
            throw new IllegalArgumentException();
        }
        else {
            return this.allMatches(prefix).length;
        }
    }

    // unit testing (required)
    public static void main(String[] args) {
        Term test1 = new Term("hello", 0);
        Term[] test2 = new Term[] { test1, test1 };
        Autocomplete test3 = new Autocomplete(test2);
        StdOut.println(test3.allMatches("he"));
        StdOut.println(test3.numberOfMatches("he"));
    }
}

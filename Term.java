import edu.princeton.cs.algs4.StdOut;

import java.util.Comparator;

public class Term implements Comparable<Term> {

    // creates weight instance variable
    private long weight;
    // creates query instance variable
    private String query;


    // Initializes a term with the given query string and weight.
    public Term(String query, long weight) {
        if (query == null) {
            throw new IllegalArgumentException();
        }
        else if (weight < 0) {
            throw new IllegalArgumentException();
        }
        else {
            this.weight = weight;
            this.query = query;
        }

    }

    // Compares the two terms in descending order by weight.
    public static Comparator<Term> byReverseWeightOrder() {
        return new Comparator<Term>() {
            public int compare(Term o1, Term o2) {
                return Long.compare(o2.weight, o1.weight);
            }
        };
    }


    // Compares the two terms in lexicographic order,
    // but using only the first r characters of each query.
    public static Comparator<Term> byPrefixOrder(int r) {
        if (r < 0) {
            throw new IllegalArgumentException();
        }
        else {
            return new Comparator<Term>() {
                public int compare(Term o1, Term o2) {
                    String query1;
                    String query2;
                    if (o1.query.length() < r) {
                        query1 = o1.query;
                    }
                    else {
                        query1 = o1.query.substring(0, r);
                    }
                    if (o2.query.length() < r) {
                        query2 = o2.query;
                    }
                    else {
                        query2 = o2.query.substring(0, r);
                    }
                    return query1.compareTo(query2);
                }
            };
        }

    }

    // Compares the two terms in lexicographic order by query.
    public int compareTo(Term that) {
        return this.query.compareTo(that.query);
    }

    // Returns a string representation of this term in the following format:
    // the weight, followed by a tab, followed by the query.
    public String toString() {
        String builder = this.weight + "\t" + this.query;
        return builder;
    }


    // unit testing (required)
    public static void main(String[] args) {
        Term test = new Term("hello", 5);
        Term test1 = new Term("fence", 5);
        Comparator<Term> a = byReverseWeightOrder();
        StdOut.println(a);
        Comparator<Term> b = byPrefixOrder(2);
        StdOut.println(b);
        StdOut.println(test.compareTo(test1));
        StdOut.println(test.toString());

    }
}

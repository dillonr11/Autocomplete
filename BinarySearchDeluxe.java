import edu.princeton.cs.algs4.StdOut;

import java.util.Comparator;

public class BinarySearchDeluxe {
    // Returns the index of the first key in the sorted array a[]
    // that is equal to the search key, or -1 if no such key.
    public static <Key> int firstIndexOf(Key[] a, Key key, Comparator<Key>
            comparator) {
        if (a == null || key == null || comparator == null) {
            throw new IllegalArgumentException();
        }
        else {
            int lo = 0;
            int hi = a.length - 1;
            while (lo <= hi) {
                int mid = lo + (hi - lo) / 2;
                if (a[mid] == null) {
                    throw new IllegalArgumentException();
                }
                else {
                    if (comparator.compare(key, a[mid]) == 0 && mid == 0) {
                        return mid;
                    }
                    if (mid != 0) {
                        if (comparator.compare(key, a[mid]) == 0 &&
                                comparator.compare(key, a[mid - 1]) >= 1) {
                            return mid;
                        }
                    }
                    if (comparator.compare(key, a[mid]) >= 1) {
                        lo = mid + 1;
                    }
                    else {
                        hi = mid - 1;
                    }
                }

            }
            return -1;
        }

    }

    // Returns the index of the last key in the sorted array a[]
    // that is equal to the search key, or -1 if no such key.
    public static <Key> int lastIndexOf(Key[] a, Key key,
                                        Comparator<Key> comparator) {
        if (a == null || key == null || comparator == null) {
            throw new IllegalArgumentException();
        }
        else {
            int lo = 0;
            int hi = a.length - 1;
            while (lo <= hi) {
                int mid = lo + (hi - lo) / 2;
                if (a[mid] == null) {
                    throw new IllegalArgumentException();
                }
                else {
                    if (comparator.compare(key, a[mid]) == 0 &&
                            mid == a.length - 1) {
                        return mid;
                    }
                    if (mid != a.length - 1) {
                        if (comparator.compare(key, a[mid]) == 0 &&
                                comparator.compare(key, a[mid + 1]) <= -1) {
                            return mid;
                        }
                    }
                    if (comparator.compare(key, a[mid]) <= -1) {
                        hi = mid - 1;
                    }
                    else {
                        lo = mid + 1;
                    }
                }
            }
            return -1;
        }
    }


    // unit testing (required)
    public static void main(String[] args) {
        Term test1 = new Term("hello", 0);
        Term[] test = new Term[] { test1, test1 };
        StdOut.println(firstIndexOf(test, test1, Term::compareTo));
        StdOut.println(lastIndexOf(test, test1, Term::compareTo));
    }
}

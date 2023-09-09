Programming Assignment 3: Autocomplete


/* *****************************************************************************
 *  Describe how your firstIndexOf() method in BinarySearchDeluxe.java
 *  finds the first index of a key that is equal to the search key.
 **************************************************************************** */

The firstIndexOf() method finds the first index of a key, by doing a normal
binary search, but instead of returning the first instance of key, it checks to
see if there is a key one to the left that is the same as the middle, and if so
then the binary search continues until there are no keys that are the same to
the left.

/* *****************************************************************************
 *  Identify which sorting algorithm (if any) that your program uses in the
 *  Autocomplete constructor and instance methods. Choose from the following
 *  options:
 *
 *    none, selection sort, insertion sort, mergesort, quicksort, heapsort
 *
 *  If you are using an optimized implementation, such as Arrays.sort(),
 *  select the principal algorithm.
 **************************************************************************** */

Autocomplete() : Quicksort(Term::compareTo).

allMatches() : Quicksort(Term.byReverseWeightOrder()).

numberOfMatches() : Quicksort(Term.byReverseWeightOrder()).

/* *****************************************************************************
 *  How many compares (in the worst case) does each of the operations in the
 *  Autocomplete data type make, as a function of both the number of terms n
 *  and the number of matching terms m? Use Big Theta notation to simplify
 *  your answers.
 *
 *  Recall that with Big Theta notation, you should discard both the
 *  leading coefficients and lower-order terms, e.g., Theta(m^2 + m log n).
 **************************************************************************** */

Autocomplete():     Theta(NlogN)

allMatches():       Theta(MlogN)

numberOfMatches():  Theta(MlogN)




/* *****************************************************************************
 *  Known bugs / limitations.
 **************************************************************************** */

None.

/* *****************************************************************************
 *  Describe whatever help (if any) that you received.
 *  Don't include readings, lectures, and precepts, but do
 *  include any help from people (including course staff, lab TAs,
 *  classmates, and friends) and attribute them by name.
 *
 *  Also include any resources (including the web) that you may
 *  may have used in creating your design.
 **************************************************************************** */

Asked Prof. Han a question about time complexity.

/* *****************************************************************************
 *  Describe any serious problems you encountered.
 **************************************************************************** */

None.

/* *****************************************************************************
 *  If you worked with a partner, assert below that you followed
 *  the protocol as described on the assignment page. Give one
 *  sentence explaining what each of you contributed.
 **************************************************************************** */

Yes we followed the protocol.
Dillon Remuck: Implemented the code for all three classes, and
debugged Silas's ideas.
Silas Palmer: Helped conceptualize code ideas and solutions to the problems.

/* *****************************************************************************
 *  List any other comments here. Feel free to provide any feedback
 *  on how much you learned from doing the assignment, and whether
 *  you enjoyed doing it.
 **************************************************************************** */


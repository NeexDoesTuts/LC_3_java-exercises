/*Strings:
The first sentence of Alice's Adventures in Wonderland is below.
Store this sentence in a string, and then prompt the user for a
term to search for within this string. Print whether or not the
search term was found. See if you can make the search
case-insensitive, so that searching for "alice", for example,
prints true.
*/

package lesson1;
import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
        String alice = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        String searchTerm;
        Scanner in;
        Boolean found;
        in = new Scanner(System.in);

        System.out.println("What would you like to search for?");
        searchTerm = in.nextLine();

        found = alice.toLowerCase().contains(searchTerm.toLowerCase());

        if (found) System.out.println(searchTerm + " is found.");
        else System.out.println(searchTerm + " is not found. Case does not matter.");

    }
}

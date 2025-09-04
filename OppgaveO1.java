/*
Welcome to JDoodle!

You can execute code here in 88 languages. Right now you’re in the Java IDE.

  1. Click the orange Execute button ▶ to execute the sample code below and see how it works.

  2. Want help writing or debugging code? Type a query into JDroid on the right hand side ---------------->

  3.Try the menu buttons on the left. Save your file, share code with friends and open saved projects.

Want to change languages? Try the search bar up the top.
*/

public class OppgaveG1 {
    public static void main(String args[]) {
        int n = 15 ; // initialise n with a value, e.g 15
// the for-loop now runs from i=1 to i < n (i.e. from 1 to 14.
        for (int i =1; i < n; i++) {
            System.out.println(i); // Print the current value of i
        }
// Test with negative value
        n = -5;
        System.out.println("\nTesting with n = " +n+ ":");
        for(int i =1; i<n; i++) {
            System.out.println(i);
            // The loop condition is i < n. We start with i = 1.

//Is 1 < -5? No, it is false.

//Because the condition is false before the first iteration, the loop's code block never runs. No numbers will be printed.
        }

    }
}
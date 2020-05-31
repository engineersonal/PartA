package com.upgrad.stack;

import java.util.Stack;

/**
 * Part A
 * You have been hired to work at a new startup company called Upzilla, and Upzilla’s goal is to make the best web browser for the next generation of computers.
 * <p>
 * Your first project at Upzilla is to implement the browsing history feature, where you track the websites that the user has visited.
 * <p>
 * <p>
 * <p>
 * In this project, you need to implement the following functions:
 * <p>
 * public Boolean isBrowsingHistoryEmpty()
 * <p>
 * Returns true if the browsing history is empty
 * <p>
 * Or false if the browsing history is not empty
 * <p>
 * public String mostRecentlyVisitedSite()
 * <p>
 * Returns url of the website that the user most recently visited
 * <p>
 * public void addSiteToHistory(String url)
 * <p>
 * Adds a website url to the browsing history
 * <p>
 * public void goBackInTime(int n)
 * <p>
 * Removes the n most recently websites from the browsing history
 * <p>
 * Where 1 <= n <= m, and m is the number of urls stored in the browsing
 * <p>
 * If there the user has an empty browsing history, then do nothing
 * <p>
 * public void printBrowsingHistory()
 * <p>
 * Prints out all of the website urls in the browsing history to the command prompt
 * <p>
 * If the user has an empty browsing history, then print “Browsing history is empty”
 * <p>
 * <p>
 * <p>
 * Additional notes:
 * <p>
 * isBrowsingHistoryEmpty, mostRecentlyVisitedSite, addSiteToHistory should run in O(1) time complexity
 * <p>
 * goBackInTime and printBrowsingHistory should run in O(N) time complexity
 */
public class PartA {
    //Stack of strings to hold the urls or the browsing history
    private static Stack<String> history = new Stack<String>();

    /**
     * This method returns true or false based on whether Browsing History is empty or not
     *
     * @return the boolean value true or false
     */
    public static Boolean isBrowsingHistoryEmpty() {
        //If the stack history is empty return true else return false
        if (history.isEmpty()) {
            return true;
        }
        return false;
    }

    /**
     * This method returns the most recently visited site or url
     *
     * @return the String top of the stack history
     */
    public static String mostRecentlyVisitedSite() {
        //Return the top of the stack history using peek method
        if (!history.isEmpty()) {
            return history.peek();
        }
        return "";
    }

    /**
     * This method adds a website url to the browsing history
     *
     * @param url: the input String url or site
     */
    public static void addSiteToHistory(String url) {
        //Add the String url to the stack history
        if (url != null && !url.isEmpty()) {
            history.push(url);
        }
    }

    /**
     * This method removes the n most recently websites from the browsing history
     *
     * @param n: the number of elements to be popped from the stack history
     */
    public static void goBackInTime(int n) {
        //If n is less then or equal to the size of the stack history and the stack history is not empty
        //remove n number of elements from the stack history
        //And check that 1<=n<=m, where m is the size of the stack history
        //And the stack history shouldn't be empty else do nothing
        if ((n >= 1 && n <= history.size()) && (!history.isEmpty())) {
            for (int i = 1; i <= n; i++) {
                history.pop();
            }
        }
    }

    /**
     * This method prints out all of the website urls in the browsing history to the command prompt
     */
    public static void printBrowsingHistory() {
        //If the browsing history exists, print it else print "Browsing history is empty"
        if (!history.isEmpty()) {
            System.out.println(history);
        } else {
            System.out.println("Browsing history is empty");
        }
    }

    public static void main(String[] args) {
        System.out.println(isBrowsingHistoryEmpty()); // Checking if Browsing History is Empty
        addSiteToHistory("www.google.co.in"); // Navigating to Google
        addSiteToHistory("www.facebook.com"); // Navigating to Facebook
        addSiteToHistory("www.upgrad.com"); // Navigating to UpGrad
        System.out.println(isBrowsingHistoryEmpty()); // Checking if Browsing History is Empty
        System.out.println(mostRecentlyVisitedSite()); // Fetching most recently visited site (UpGrad)
        addSiteToHistory("www.youtube.com"); // Navigating to Youtube
        goBackInTime(2); // Going back by 2 sites
        addSiteToHistory("www.yahoo.com"); // Navigating to UpGrad platform site
        System.out.println(mostRecentlyVisitedSite()); // Fetching most recently visited site (UpGrad Learn Platform)
        printBrowsingHistory(); // Printing browsing history

    }

}

/**
 * Your code should have the following Output:
 * <p>
 * true
 * false
 * www.upgrad.com
 * www.yahoo.com
 * [www.google.co.in, www.facebook.com, www.yahoo.com]
 */

# Part A: Stacks and Queues

**You have been hired to work at a new startup company called Upzilla, and Upzilla’s goal is to make the best web browser for the next generation of computers.**
  
**Your first project at Upzilla is to implement the browsing history feature, where you track the websites that the user has visited.nd has the following functionality:**

`This project has the following functions:`

**public Boolean isBrowsingHistoryEmpty()**

`Returns true if the browsing history is empty`

`Or false if the browsing history is not empty`

**public String mostRecentlyVisitedSite()**

`Returns url of the website that the user most recently visited`

**public void addSiteToHistory(String url)**

`Adds a website url to the browsing history`

**public void goBackInTime(int n)**

`Removes the n most recently websites from the browsing history`

`Where 1 <= n <= m, and m is the number of urls stored in the browsing`

`If there the user has an empty browsing history, then do nothing`

**public void printBrowsingHistory()**

`Prints out all of the website urls in the browsing history to the command prompt`

`If the user has an empty browsing history, then print “Browsing history is empty”`

`Note: isBrowsingHistoryEmpty, mostRecentlyVisitedSite, addSiteToHistory should run in O(1) time complexity and goBackInTime and printBrowsingHistory should run in O(N) time complexity`

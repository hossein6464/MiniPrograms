package finalproject;

/*
                                                  455. Assign Cookies
                                      https://leetcode.com/problems/assign-cookies/
                                            Represented By Hossein 12-06-2021

Assume you are an awesome parent and want to give your children some cookies. But, you should give each child at most one cookie.
Each child i has a greed factor g[i], which is the minimum size of a cookie that the child will be content with; and each cookie
j has a size s[j]. If s[j] >= g[i], we can assign the cookie j to the child i, and the child i will be content. Your goal is to
maximize the number of your content children and output the maximum number.

Example 1:
Input: g = [1,2,3], s = [1,1]
Output: 1
Explanation: You have 3 children and 2 cookies. The greed factors of 3 children are 1, 2, 3.
And even though you have 2 cookies, since their size is both 1, you could only make the child whose greed factor is 1 content.
You need to output 1.

Example 2:
Input: g = [1,2], s = [1,2,3]
Output: 2
Explanation: You have 2 children and 3 cookies. The greed factors of 2 children are 1, 2.
You have 3 cookies and their sizes are big enough to gratify all of the children,
You need to output 2.

Constraints:
1 <= g.length <= 3 * 104
0 <= s.length <= 3 * 104
1 <= g[i], s[j] <= 231 - 1

Solution:
We assume we have two unsorted arrays. One array for the children and their greed factor and one array for the cookies and their size;
First step would be to sort both arrays. The child with the smallest greed factor to the largest and the cookies with the smallest size
to the largest.
Now, to satisfy children we create a loop where we go through an array of cookies and check each cookie size. Comparing each cookie size with
each child's greed factor. If we satisfy a child's greed meaning cookie size either bigger or equal to the child's greed, we increment a counter
and move to the next cookie. If we can not satisfy a child we will move to the next cookie without incrementing our counter.
Finally, we return our counter and print the number of children satisfied

 */


public class FindContentChildren {
    public static void main(String[] args) {
        int[] children = {1,2};
        int[] cookies = {1, 2, 3};

        System.out.println(String.valueOf(findContentChildren(children, cookies)));

    }

    public static int findContentChildren(int[] child, int[] cookies) {

        // calling sortArray method to sort both children and cookies
        int[] sortedChild = sortArray(child);
        int[] sortedCookies = sortArray(cookies);

        int satisfiedChildrenCounter = 0;

        //
        for (int i = 0; satisfiedChildrenCounter < sortedChild.length && i < sortedCookies.length; i++) {
            if (sortedCookies[i] >= sortedChild[satisfiedChildrenCounter]) {
                satisfiedChildrenCounter++;
            }
        }
        return satisfiedChildrenCounter;
    }

    public static int[] sortArray(int array[]) {

        for (int i = 0; i < array.length - 1; i++) {
            // Find the minimum in the list
            int currentMin = array[i];
            int currentMinIndex = i;
            // Find new min in the rest of the array from our current position
            for (int j = i + 1; j < array.length; j++) {
                if (currentMin > array[j]) {
                    currentMin = array[j];
                    currentMinIndex = j;
                }
            }
            // Swap list[i] with list[currentMinIndex]
            if (currentMinIndex != i) {
                array[currentMinIndex] = array[i];
                array[i] = currentMin;
            }
        }
        return array;
    }
}


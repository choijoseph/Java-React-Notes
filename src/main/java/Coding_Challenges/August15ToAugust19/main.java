package Coding_Challenges.August15ToAugust19;

import java.util.ArrayList;
import java.util.Random;

public class main {
/*    1) Walk on the Axis:
    There are N+1 lights. Lights are placed at (0, 0), (1, 0), (2, 0) ... (N, 0). Initially all the lights are on. You want to turn off all of them one after one. You want to follow a special pattern in turning off the lights.
    You will start at (0, 0).First, you walk to the right most light that is on, turn it off. Then you walk to the left most light that is on, turn it off. Then again to the right most light that is on and so on. You will stop after turning off all lights. You want to know how much distance you walked in the process. Note that distance between (a,0) and (b,0) is |a-b|.
    Input
    The first line of the input contains an integer T denoting the number of test cases. Each test case has a single integer N on separate line.

    Output
    For each test case, output the distance you walked.
            Constraints
· 1 ≤ T ≤ 10^5
            · 1 ≤ N ≤ 10^5

    Sample 1:
    Input:
            2
            1
            2

    Output:
            2
            5

    Explanation:
    Testcase #2 You are initially at (0, 0) Rightmost on-light is (2, 0). Distance = 2. Now you are at (2, 0). Left most on-light is (0, 0). Distance = 2. Now you are at (0, 0) Right most on-light is(1, 0). Distance = 1. Now you are at (1, 0) and all lights are turned off. Total distance walked = 5.*/

    public static void walkOnTheAxis(ArrayList<Integer> input){
        for(int i = 1; i < input.size(); i++){
            System.out.println(getDistance(input.get(i)));
        }
    }

    // helper function to get the distance of a single input
    public static int getDistance(int lights){
        int totalDistance = 2 * lights;
        int remainingLights = lights - 1;
        while(remainingLights > 0){
            totalDistance += remainingLights;
            remainingLights -= 1;
        }
        return totalDistance;
    }

/*    2) Your Name is Mine:

    In an attempt to control the rise in population, Archer was asked to come up with a plan. This time he is targeting marriages. Archer, being as intelligent as he is, came up with the following plan:
    A man with name M is allowed to marry a woman with name W, only if M is a subsequence of W or W is a subsequence of M.
    A is said to be a subsequence of B, if A can be obtained by deleting some elements of B without changing the order of the remaining elements.
    Your task is to determine whether a couple is allowed to marry or not, according to Archer's rule.
    Input
    The first line contains an integer T, the number of test cases. T test cases follow. Each test case contains two space separated strings M and W.
    Output
    For each test case print "YES" if they are allowed to marry, else print "NO".(quotes are meant for clarity, please don't print them)
    Constraints
· 1 ≤ T ≤ 100
            · 1 ≤ |M|, |W| ≤ 25000 (|A| denotes the length of the string A.)
            · All names consist of lowercase English letters only.

    Sample 1:

    Input:

            3
    john johanna
    ira ira
    kayla Jayla

    Output:

    YES
            YES
    NO

    Explanation:
    Case 1: Consider S = "johanna". So, S[0] = 'j', S[1] = 'o', S[2] = 'h' and so on. If we remove the indices [3, 4, 6] or [3, 5, 6] from S, it becomes "john". Hence "john" is a subsequence of S, so the answer is "YES".
    Case 2: Any string is a subsequence of itself, as it is formed after removing "0" characters. Hence the answer is "YES".
    Case 3: "jayla" cannot be attained from "kayla" as removing any character from "kayla" would make the string length smaller than "jayla",also there is no 'j' in "kayla". Similar reasoning can be applied to see why "kayla" can't be attained from "jayla".Hence the answer is "NO".*/

    public static void yourNameIsMine(int T, String[][] marriagePairs){
        for(String[] pair: marriagePairs){
            System.out.println(canMarry(pair));
        }
    }

    public static String canMarry(String[] marriagePair){
        // coupleA is the shorter name, while coupleB is the longer name
        StringBuilder coupleA = new StringBuilder();
        StringBuilder coupleB = new StringBuilder();

        if(marriagePair[0].length() < marriagePair[1].length()){
            coupleA.append(marriagePair[0]);
            coupleB.append(marriagePair[1]);
        }
        else{
            coupleA.append(marriagePair[1]);
            coupleB.append(marriagePair[0]);
        }

        int pointer = 0;

        while(coupleB.length() >= coupleA.length()){
            if(coupleA.charAt(pointer) != coupleB.charAt(pointer)){
                coupleB.deleteCharAt(pointer);
            }
            else if(coupleB.toString().contains(coupleA.toString())){
                return "YES";
            }
            else{
                pointer += 1;
            }
        }
        return "NO";
    }

    public static void main(String[] args){
        // Walk On Axis problem execution
        Random rand = new Random();
        int randomInputs = rand.nextInt(10);

        ArrayList<Integer> walkOnAxisInputs = new ArrayList<>();
        walkOnAxisInputs.add(randomInputs);

        while(randomInputs > 0){
            walkOnAxisInputs.add(rand.nextInt(100));
            randomInputs -= 1;
        }

        System.out.println("Problem 1:");
        System.out.println("Inputs:");
        for(int i = 0; i < walkOnAxisInputs.size(); i++){
            System.out.println(walkOnAxisInputs.get(i));
        }
        System.out.println("Outputs:");
        walkOnTheAxis(walkOnAxisInputs);

        // Your Name is Mine problem execution
        int testCases = 3;
        String[][] marriagePairs = {
                {"john", "johanna"},
                {"ira", "ira"},
                {"kayla", "Jayla"},
        };

        System.out.println("Problem 2:");
        System.out.println("Outputs:");
        yourNameIsMine(testCases, marriagePairs);
    }
}

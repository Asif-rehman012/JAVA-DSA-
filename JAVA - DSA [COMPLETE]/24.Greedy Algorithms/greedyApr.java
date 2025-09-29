import java.util.ArrayList;
import java.util.*;

public class greedyApr {

    // for lec 10
    static class Job {
        int deadline;
        int profit;
        int id;

        public Job(int i, int d, int p) {
            id = i;
            deadline = d;
            profit = p;
        }

    }

    public static void main(String[] args) {

        // ! Lec 3 Activity Selection CODE****
        // int start[] = { 1, 3, 0, 5, 8, 5 };
        // int end[] = { 2, 4, 6, 7, 9, 9 };

        // // sorting
        // int activities[][] = new int[start.length][3];
        // for (int i = 0; i < start.length; i++) {
        // activities[i][0] = i;
        // activities[i][1] = start[i];
        // activities[i][2] = end[i];
        // }

        // // lambda function -> shortform
        // Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));
        // // end time basis sorted
        // int maxAct = 0;
        // ArrayList<Integer> ans = new ArrayList<>();

        // // Ist activity
        // maxAct = 1;
        // // ans.add(0); //without sorting
        // // int lastEnd = end[0];
        // ans.add(activities[0][0]); // use activities when unsorted
        // int lastEnd = activities[0][2];
        // for (int i = 1; i < end.length; i++) {
        // if (activities[i][1] >= lastEnd) {
        // // activity select
        // maxAct++;
        // ans.add(activities[i][0]);
        // lastEnd = activities[i][2];
        // }
        // }

        // System.out.println("max activities = " + maxAct);
        // for (int i = 0; i < ans.size(); i++) {
        // System.out.println("A" + ans.get(i) + " ");
        // }

        // ! LEc 6 Fractional KnapSack CODE
        // int val[] = { 60, 100, 120 };
        // int weight[] = { 10, 20, 30 };
        // int W = 50;

        // double ratio[][] = new double[val.length][2];
        // // 0th col => idx; 1st col => ratio

        // for (int i = 0; i < val.length; i++) {
        // ratio[i][0] = i;
        // ratio[i][1] = val[i] / (double) weight[i];
        // }

        // // ascending order sorting
        // Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

        // int capacity = W;
        // int finalVal = 0;
        // for (int i = ratio.length - 1; i >= 0; i--) { // iss sai decending mai chalai
        // ge
        // int idx = (int) ratio[i][0]; // type cast
        // if (capacity >= weight[idx]) { // include full item
        // finalVal += val[idx];
        // capacity -= weight[idx];
        // } else {
        // // include fractional item
        // finalVal += (ratio[i][1] * capacity);
        // capacity = 0;
        // break;
        // }
        // }

        // System.out.println("finaal value = " + finalVal);

        // ! L7 Min absolute pair difference code
        // int A[] = { 1, 2, 3 };
        // int B[] = { 2, 1, 3 };

        // Arrays.sort(A);
        // Arrays.sort(B);

        // int minDiff = 0;
        // for (int i = 0; i < A.length; i++) {
        // minDiff += Math.abs(A[i] - B[i]);
        // }
        // System.out.println("min absolute diff of pairs = " + minDiff);

        // ! L8 Max Length chain of pairs CODE (Same as activity selection but pairs)
        // int pairs[][] = { { 5, 24 }, { 39, 60 }, { 5, 28 }, { 27, 40 }, { 50, 90 } };

        // // phalai sorting ki hai
        // Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1]));

        // // first walai pair ko pick kr diya hai
        // int chainLen = 1;
        // int chainEnd = pairs[0][1]; // Last selected pair end // chain end

        // // cond lga di hai
        // for (int i = 1; i < pairs.length; i++) {
        // if (pairs[i][0] > chainEnd) {
        // chainLen++;
        // chainEnd = pairs[i][1];
        // }
        // }
        // System.out.println("max length of chain = " + chainLen);

        // ! L9 Indian coins Change problem code
        // Integer coins[] = { 1, 2, 5, 10, 20, 50, 100, 500, 2000 };

        // Arrays.sort(coins, Comparator.reverseOrder());

        // int countOfcoins = 0;
        // int amount = 590;
        // ArrayList<Integer> ans = new ArrayList<>();

        // for (int i = 0; i < coins.length; i++) {
        // if (coins[i] <= amount) {
        // while (coins[i] <= amount) {
        // countOfcoins++;
        // ans.add(coins[i]);
        // amount -= coins[i];
        // }
        // }
        // }

        // System.out.println("total (min) coins used = " + countOfcoins);

        // for (int i = 0; i < ans.size(); i++) {
        // System.out.println(ans.get(i) + " ");
        // }
        // System.out.println();

        // ! L10 Job Sequencing Problem (CODE)

        // int jobsInfo[][] = { { 4, 20 }, { 1, 10 }, { 1, 40 }, { 1, 30 } };

        // ArrayList<Job> jobs = new ArrayList<>();

        // for (int i = 0; i < jobsInfo.length; i++) {
        // jobs.add(new Job(i, jobsInfo[i][0], jobsInfo[i][1]));

        // }

        // Collections.sort(jobs, (obj1, obj2) -> obj2.profit - obj1.profit);//
        // .deadline , id pai sort hota argar given
        // // hota
        // // descending order of profit

        // ArrayList<Integer> seq = new ArrayList<>();
        // int time = 0;
        // for (int i = 0; i < jobs.size(); i++) {
        // Job curr = jobs.get(i);
        // if (curr.deadline > time) {
        // seq.add(curr.id);
        // time++;
        // }
        // }
        // // print seq
        // System.out.println("max jobs = " + seq.size());
        // for (int i = 0; i < seq.size(); i++) {
        // System.out.print(seq.get(i) + " ");
        // }
        // System.out.println();

        // ! L12 chocla problem (Choclate pieces)
        int n = 4, m = 6;
        Integer costVer[] = { 2, 1, 3, 1, 4 }; // m-1
        Integer costHor[] = { 4, 1, 2 }; // n-1

        Arrays.sort(costVer, Collections.reverseOrder());
        Arrays.sort(costHor, Collections.reverseOrder());

        int h = 0, v = 0;
        int hp = 1, vp = 1;
        int cost = 0;

        while (h < costHor.length && v < costVer.length) {
            if (costVer[v] <= costHor[h]) { // horizontal cut
                cost += (costHor[h] * vp);
                hp++;
                h++;
            } else {
                cost += (costVer[v] * hp);
                vp++;
                v++;
            }

        }

        while (h < costHor.length) {
            cost += (costHor[h] * vp);
            hp++;
            h++;
        }

        while (v < costVer.length) {
            cost += (costVer[v] * hp);
            vp++;
            v++;
        }
        System.out.println("min cost of choclate cuts = " + cost);
    }
}

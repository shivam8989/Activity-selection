package Greedy_Algorithim;
import java.util.*;
public class Activity_Selection {
    public static void main(String args []){
        int start [] = {10, 12, 20};
        int end [] = {20,25,30};
        // end time basis sorted
        int maxAct = 0;
         ArrayList<Integer> ans = new ArrayList<>();

         // first Activity
        maxAct = 1;
        ans.add(0);
        int lastend = end[0];
        for(int i = 0; i<end.length; i++){
            if(start[i]>=lastend){
                // activity select
                maxAct++;
                ans.add(i);
                lastend = end[i];
            }
        }
        System.out.println("Max Activity = "+maxAct);
        for(int i = 0; i<ans.size(); i++){
            System.out.print("A"+ans.get(i)+" ");
        }
        System.out.println();

    }
}

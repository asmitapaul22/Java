package Arrays_and_Strings_Level2;

import java.util.*;

public class Majority_Element_General {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n= scn.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=scn.nextInt();
        }
        int k=scn.nextInt();
        ArrayList<Integer> result=majorityElementGeneral(arr,k);
        System.out.println(result);
    }
    public static ArrayList<Integer> majorityElementGeneral(int[] arr,int k)
    {
        HashMap<Integer,Integer> Hmap=new HashMap<>();
        //fill frequency map
        for(int i=0;i<arr.length;i++)
        {
            if(Hmap.containsKey(arr[i])==true)
            {
                Hmap.put(arr[i],Hmap.get(arr[i])+1);
            }else{
                Hmap.put(arr[i],1);
            }
        }
        ArrayList<Integer> result=new ArrayList<>();
        //travel in hashmap and fill the result arraylist
        for(int key : Hmap.keySet())
        {
            if(Hmap.get(key)>arr.length/k)
            {
                result.add(key);
            }
        }
        //sort the result arraylist
        Collections.sort(result);
        return result;

    }
}

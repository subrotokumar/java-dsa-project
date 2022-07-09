package Hashing;

import java.util.HashSet;
import java.util.Scanner;

public class CountDistinctElement {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        int[] a=new int[n];
        for (int i = 0; i < n; i++) {
            a[i]= scanner.nextInt();
        }
        countDistinctElement(a);
        scanner.close();
    }

    static void countDistinctElement(int a[]){
        HashSet<Integer> set =new HashSet<>();
        for(int i: a){
            set.add(i);
        }
        System.out.println(set.size());
    }
}

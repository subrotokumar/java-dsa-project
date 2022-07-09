package Hashing;

import java.util.HashSet;
import java.util.Scanner;

public class UnionAndIntersection {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        int[] a=new int[n];
        for (int i = 0; i < n; i++) {
            a[i]= scanner.nextInt();
        }
        int m= scanner.nextInt();
        int[] b=new int[n];
        for (int i = 0; i < m; i++) {
            b[i]= scanner.nextInt();
        }
        scanner.close();

        union(a,b);
        System.out.println();
        intersection(a,b);
    }

    static void union(int[] a, int[] b){
        HashSet<Integer> set =new HashSet<>();
        for(int i: a){
            set.add(i);
        }
        for(int i:b){
            set.add(i);
        }
        for(Integer i: set){
            System.out.print(i+ " ");
        }
    }

    static void intersection(int[] a, int[] b){
        HashSet<Integer> set =new HashSet<>();
        for(int i: a){
            set.add(i);
        }
        for(int i:b){
            if(!set.contains(i)) {
                set.remove(i);
            }
        }
        for(Integer i: set){
            System.out.print(i+ " ");
        }
    }
}

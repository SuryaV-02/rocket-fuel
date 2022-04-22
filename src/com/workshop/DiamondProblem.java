package com.workshop;

import java.util.Scanner;

public class DiamondProblem {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        n = n + (n-1);
        int boom = (n/2);
        int currNum = 1;

        System.out.println(n + " " + boom);
        for(int i=0;i<n;++i){
            for(int j=0;j<boom;++j){
                System.out.print(" ");
            }
            for (int k=0; k<currNum;++k){
                System.out.print("*");
            }
            System.out.println();
            if(i >= n/2 ){
                currNum -=2;
                ++boom;
            }else{
                --boom;
                currNum +=2;
            }
        }
    }
}

//https://quescol.com/interview-preparation/diamond-pattern-program-in-c
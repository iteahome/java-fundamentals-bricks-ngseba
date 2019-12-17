package com.company;

public class Main {

    public static void main(String[] args) {
    int bricks =13;
    int i = 0;
    int p = 0;
    int m = 0;
    while(bricks > 0)
    {
        i++;
        p = i;
        m = i*2;
        bricks = bricks - m - p;
    }
    if(bricks + m >0)
        System.out.println("Moltu");
    else
        System.out.println("Paltu");
    }

}

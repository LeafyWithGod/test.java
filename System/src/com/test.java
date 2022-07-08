package com;

public class test {
    public static void main(String[] args)
    {/*
        int x=5;
        switch(x){
            case 1:
            case 2:x*=2;
            case 3:x*=3;
    }
    System.out.println(x);

    int j=0;
    do{
        if(j==5)
            break;
        System.out.println(j+" ");
        j++;
    }while(j<10);
    */
        long p1=System.currentTimeMillis();
        for(int a=0;a<10000;a++)
        {
            System.out.println(a);
        }
        long p2=System.currentTimeMillis();
        System.out.println(p2-p1);
    }
}

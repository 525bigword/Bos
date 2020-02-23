package com.xr.boot;

import org.junit.Test;

public class A {
    @Test
    public void a(){
        int a=1;
        int b=2;
        b(a,b);
        System.out.println(b);
}
    public int b(int a,int b){

       return a+b;
    }
}

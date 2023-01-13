package com.driver;
import java.sql.SQLOutput;
import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
//    System.out.println("This is it");

    public static class Product{
        int x;
        int y;

        public Product(){
            System.out.println("Constructor initiated");
        }
//        public void Product(int x, int y){
//            this.x = x;
//            this.y = y;
//        }

        public static int product(int x, int y){
            return x*y;
        }
        public int product(int x, int y, int z){
            return x*y*z;
        }
        public double product(double x, double y){
//            System.out.println("Double"+ x*y);
            return x*y;
        }
    }

    public static void main(String[] args)
    {
        Product p = new Product();
        p.product(2, 8);
//        System.out.println(p.product(2,4));

        p.product(2, 5, 6);
        p.product(2.0, 3.4);
    }

}
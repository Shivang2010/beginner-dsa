package com.shivang;
import java.util.Arrays;
public class VarArgs {
    public static void main(String[] args) {
        fun(2, 3, 4, 5, 86, 23, 65, 86);
    }
        static void fun(int...var){
            System.out.println(Arrays.toString(var));
        }
    }


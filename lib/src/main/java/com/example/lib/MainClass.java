package com.example.lib;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class MainClass {


    public static void main(String[] args) {

       List<String> mLinkList = new LinkedList<>();
       mLinkList.add("arafat");
       mLinkList.add("kamal");
       mLinkList.add("tamzid");
       mLinkList.add(3, "hi");
       mLinkList.remove(3);

       for(String i : mLinkList) {
           System.out.println(i);
       }

    }

}

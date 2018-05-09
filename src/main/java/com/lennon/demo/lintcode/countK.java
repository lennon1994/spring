package com.lennon.demo.lintcode;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * 计算数字k在0到n中的出现的次数，k可能是0~9的一个值
 * 例如n=12，k=1，在 [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]，我们发现1出现了5次 (1, 10, 11, 12)
 */

@Slf4j
public class countK {

    public static void main (String[] args) {

        int n = 1;
        int k = 1;
        Map<String,Integer> count = new HashMap<> ();


        List<Integer> all = new ArrayList<> ();
        //构造数组
        for(int i=0;i<=n;i++){
            all.add (i);
        }

        for(Integer i :all){
            String str= String.valueOf (i);
            for(int j=0;j<str.length ();j++){
//                int sum = counter (str,str.charAt (j));
                int sum = 1;
                count.put (String.valueOf (str.charAt (j)),sum+count.getOrDefault (String.valueOf (str.charAt (j)),0));
            }

        }

        log.info (""+count);

log.info (""+count.get (k));

    }


    public static int counter(String s,char c){
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==c){
                count++;
            }
        }
        return count;
    }



}

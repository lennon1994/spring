package com.lennon.demo.lintcode;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class fiveTen {

    public static void main (String[] args) {


        System.out.println ();
        log.info ("");


        int[] a = {};
        int[] b = {};
        int aSize = a.length;
        int bSize = b.length;
        if(aSize<bSize){
            int[] flag = a;
            a = b;
            b = flag;
        }
        //a 小 b 大



        int[] result = new int[a.length+b.length];
        //i:a数组下标    j：b数组下标  k：新数组下标
        int i=0,j=0,k=0;
//                按位循环比较两个数组，较小元素的放入新数组，下标加一（注意，较大元素对应的下标不加一），直到某一个下标等于数组长度时退出循环
        while(i<a.length && j<b.length)
            if(a[i] <= b[j]) {
                result[k++] = a[i++];
            }else{
                result[k++] = b[j++];
            }
        /* 后面连个while循环是用来保证两个数组比较完之后剩下的一个数组里的元素能顺利传入 *
         * 此时较短数组已经全部放入新数组，较长数组还有部分剩余，最后将剩下的部分元素放入新数组，大功告成*/
        while(i < a.length)
            result[k++] = a[i++];
        while(j < b.length)
            result[k++] = b[j++];
//        return result;


    }
}

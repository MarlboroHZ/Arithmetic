package com.jh.string;

import org.junit.jupiter.api.Test;

/**
 * className: DelAdjacentRepetition
 * description: 删除字符串中的所有相邻重复项
 *
 * @author: wjh
 * @date: 2021/03/09 1:38 下午
 * @copyright (c) 2021, all rights reserved
 **/
public class DelAdjacentRepetition {

    @Test
    public void removeRepeatString(){
        String S = "aksdjfkjsjsjjsfkjjkskdjfkjsfs";
        StringBuffer sb=new StringBuffer();
        int top=-1;
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            if (top>=0 && sb.charAt(top) == c){
                sb.deleteCharAt(top);
                --top;
            }else {
                sb.append(c);
                top++;
            }
        }
        System.out.println(sb.toString());
    }
}

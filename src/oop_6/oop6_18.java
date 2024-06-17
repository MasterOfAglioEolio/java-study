package oop_6;

import java.sql.SQLOutput;

public class oop6_18 {

    public static boolean isNumber(String str1){
        // 주어진 문자열이 모두 숫자로만 이루어져있는지 확인
        // 모두 숫자로 이루어져있으면 true 아니면 false
        // 만일 주어진 문자열이 null이거나 빈 문자열이면"", false
        if (str1.length()==0){
        //if (str1.isEmpty())
            return false;
        }

        for(int i=0;i<str1.length();i++){
            System.out.println(str1.charAt(i));
           if (str1.charAt(i)>='0' && str1.charAt(i)<='9'){
               continue;
           }
           else{
               return false;
           }
        }
        return true;


    }

    public static void main(String[] args){
        String str="123";
        System.out.println(str+"는 숫자입니까?"+isNumber(str));

        str="1234o";
        System.out.println(str+"는 숫자입니까?"+isNumber(str));
    }
}

/*
public class Main{
    String str = new String("good");
    char[ ] ch = { 'a' , 'b' , 'c' };
    public static void main(String args[]){
        Main ex = new Main();
        ex.change(ex.str,ex.ch);
        System.out.print(ex.str + " and ");
        System.out.print(ex.ch);
    }
    public void change(String str,char ch[ ]){
        str = "test ok";
        ch[0] = 'g';
    }
}*/

/*
public class Main {
    public static void main(String[] args) {
        String str = "asdasasv";
        String str2 = "asa";
        System.out.println(str.contains(str2));
    }
}*/

/*class Solution {
    public int firstUniqChar(String s) {
        int[] arr = new int[26];
        for(int i = 0;i < s.length();i++) {
            arr[s.charAt(i) - 'a'] += 1;
        }

        for(int i = 0;i < s.length();i++) {

            if(arr[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        return -1;

    }
}*/

/*
class Solution {
    public int lengthOfLastWord(String s) {
        String[] str = s.split(" ");
        int length = str.length;
        return str[length-1].length();
    }
}*/

/*
public class Main {
    public static void main(String[] args) {
        String s = "Hello World";
        int index = s.lastIndexOf(" ");
        String ret = s.substring(index);

        System.out.println(ret);
    }
}
*/

/*
class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        int index = s.lastIndexOf(" ");
        if (index != -1) {
            String str = s.substring(index);
            return str.length()-1;
        }
        return s.length();

    }
}*/

/*
public class Main {
    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        str = str.toLowerCase();
        System.out.println(str);
    }
}
*/



//class Solution {
//    public boolean isChar(char ch) {
//        // if (ch >= 'a' && ch <= 'z' || ch >= '0' && ch <= '9') {
//        //     return true;
//        // }
//        // return false;
//        if (Character.isDigit(ch) || Character.isLetter(ch)) {
//            return true;
//        }
//        return false;
//    }
//
//    public boolean isPalindrome(String s) {
//        // 1. 将字符串中所有字符转小写
//        s = s.toLowerCase();
//        // 2. 将字符串转数组
//        //char[] chArr = s.toCharArray();
//        int left = 0;
//        int right = s.length()-1;
//
//
//        /*
//        a~z ：97~122
//        0～9 : 48～57
//        */
//
//        while (left < right) {
//
//            while (left < right && !isChar(s.charAt(left))) {
//                left++;
//            }
//            while (left < right && !isChar(s.charAt(right))) {
//                right--;
//            }
//
//            if (s.charAt(right) != s.charAt(left)) {
//                return false;
//            }
//            left++;
//            right--;
//        }
//        return true;
//    }
//}

/*
public class Main {
    public static int countSegments(String s) {

        if (s.length() > 0) {
            String[] arr = s.split(" ");
            return arr.length;
        }
        return 1;
    }
    public static void main(String[] args) {
        System.out.println(countSegments(""));
    }
}*/

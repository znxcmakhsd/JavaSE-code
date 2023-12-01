1. https://leetcode.cn/problems/first-unique-character-in-a-string/description/
java:
// class Solution {
//     public int firstUniqChar(String s) {
//         int[] count = new int[26];
//         for(int i = 0;i < s.length();i++) {
//             char ch = s.charAt(i);
//             count[ch-97]++;
//         }
//         for(int i = 0;i < s.length();i++) {
//             char ch = s.charAt(i);
//             if (count[ch-97] == 1) {
//                return i;
//             }
//         }
//         return -1;
//     }
// }
C:
// int firstUniqChar(char* s) {
//     int count[26];
//     for (int i = 0; i < 26; i++) {
//         count[i] = 0;
//     }
//     int sz = strlen(s);
//     for (int i = 0;i < sz;i++) {
//         char ch = *(s+i);
//         count[ch - 97]++;
//     }
//     for (int i = 0;i < sz;i++) {
//         char ch = *(s+i);
//         if (count[ch - 97] == 1) {
//             return i;
//         }
//     }
//     return -1;
// }


2. https://leetcode.cn/problems/length-of-last-word/submissions/
java:
方法1
// class Solution {
//     public int lengthOfLastWord(String s) {
//         String[] arr = s.split(" ");
//         int length = arr.length;
//         return arr[length-1].length();
//     }
// }
方法2
// class Solution {
//     public int lengthOfLastWord(String s) {
//         s = s.trim();
//         int index = s.lastIndexOf(" ");
//         String str = s.substring(index+1,s.length());
//         return str.length();
//     }
// }
方法3:
// class Solution {
   
//     public int lengthOfLastWord(String s) {
//          // 1. 从后往前找过滤空格 
//         int index = 0;
//         int count = 0;
//         for(int i = s.length()-1;i >= 0;i--) {
//             if (s.charAt(i) != ' ') {
//                 index = i;
//                 break;
//             }
//         }
//         // 2. 开始计数
//         for(int i = index;i >= 0;i--) {
//             if (s.charAt(i) != ' ') {
//                 count++;
//             }else {
//                 break;
//             }
//         }
//         return count;
//     }  
//}

3. https://leetcode.cn/problems/valid-palindrome/description/
// class Solution {
//     // 判断是否是字符
//     public boolean isChar(char ch) {
//         if (ch >= 97 && ch <= 122 || ch >= '0' && ch <= '9') {
//             return true;
//         }
//         return false;
//     }
//     public boolean isPalindrome(String s) {
//         // 1. 大写转小写
//         s = s.toLowerCase();
//         int left = 0;
//         int right = s.length()-1;
//         while (left < right) {
//             while (left < right && !isChar(s.charAt(left)) ) {
//                 left++;
               
//             }
            
//             while (right > left && !isChar(s.charAt(right)) ) {
//                 right--;
                
//             }
            
//             char charRight = s.charAt(right);
//             char charLeft = s.charAt(left);
//             if (charLeft == charRight) {
//                 left++;
//                 right--;
//             }else {
//                 return false;
//             }
//         }
//         return true;
//     }
// }

4.https://leetcode.cn/problems/to-lower-case/description/
// class Solution {
//     public String toLowerCase(String s) {
//         StringBuilder stringBuilder = new StringBuilder();
//         for(int i = 0;i < s.length();i++) {
//             stringBuilder.append(s.charAt(i));
//         }
//         String str = stringBuilder.toString();
//         return str.toLowerCase();
//     }
// }


5. https://www.nowcoder.com/practice/784efd40ed8e465a84821c8f3970b7b5?tpId=182&tqId=34772&ru=/exam/oj
// import java.util.Scanner;
// // 注意类名必须为 Main, 不要有任何 package xxx 信息
// public class Main {
//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         //StringBuilder stringBuilder = new StringBuilder();
//         // 注意 hasNext 和 hasNextLine 的区别
//         while (in.hasNextLine()) { // 注意 while 处理多个 case
//             String str = in.nextLine();
//             StringBuilder stringBuilder = new StringBuilder();
//             int[] arr = new int[58];
//             for(int i = 0;i < str.length();i++) {             
//                 char ch = str.charAt(i);
//                 if(arr[ch-65] == 0) {
//                     arr[ch-65]++;
//                     stringBuilder.append(ch);
//                 }
//             }
//             //String getline = in.nextLine();
//             System.out.println(stringBuilder.toString());


//         }
//     }
// }

6. https://leetcode.cn/problems/merge-sorted-array/description/
// class Solution {
//     public void merge(int[] nums1, int m, int[] nums2, int n) {
//         int i = m-1;
//         int j = n-1;
//         int k = nums1.length-1;

//         while(i >= 0 && j >= 0) {
//             if (nums1[i] > nums2[j]) {
//                 nums1[k] = nums1[i];
//                 k--;
//                 i--;
//             }else {
//                 nums1[k] = nums2[j];
//                 k--;
//                 j--;
//             }
//         }
//         while(i >= 0) {
//             nums1[k] = nums1[i];
//             k--;
//             i--;
//         }
//         while(j >= 0) {
//             nums1[k] = nums2[j];
//             k--;
//             j--;
//         }
//     }
// }

// 7. https://leetcode.cn/problems/number-of-segments-in-a-string/description/
// class Solution {
//     public int countSegments(String s) {
//         if (s.isEmpty()){
//             return 0;
//         }
//         String[] str = s.split(" ");
//         int count = 0;
//         for(int i = 0;i < str.length;i++) {
//             if(str[i].length() != 0) {
//                 count++;
//             }
//         }
//         return count;
//     }
// }
// class Solution {
//     public int countSegments(String s) {
//         int count = 0;
//         for(int i = 0;i < s.length();i++) {
//             if ((i == 0 || (s.charAt(i-1) == ' ')) && (s.charAt(i) != ' ')) {
//                 count++;
//             }
//         }
//         return count;
//     }
// }
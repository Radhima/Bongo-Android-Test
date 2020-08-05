import java.util.*;  
   
public class AnagramString {  
    static void isAnagram(String str1, String str2) {  
        String s1 = str1.replaceAll("\\s", "");  
        String s2 = str2.replaceAll("\\s", "");  
        boolean status = true;  
        if (s1.length() != s2.length()) {  
            status = false;  
        } else {  
            char[] ArrayS1 = s1.toLowerCase().toCharArray();  
            char[] ArrayS2 = s2.toLowerCase().toCharArray();  
            Arrays.sort(ArrayS1);  
            Arrays.sort(ArrayS2);  
            status = Arrays.equals(ArrayS1, ArrayS2);  
        }  
        if (status) {  
            System.out.println(s1 + " and " + s2 + " are anagrams");  
        } else {  
            System.out.println(s1 + " and " + s2 + " are not anagrams");  
        }  
    }  
   
    public static void main(String[] args) {
        
        int times;
        int i;
        String str1, str2;
        Scanner sc= new Scanner(System.in); 
        System.out.print("Enter number of string pairs: \n");
        times=sc.nextInt();
        str1=sc.nextLine();
        for(i=0; i<times; i++)
        {
            System.out.print("Enter first string: ");  
            str1= sc.nextLine();
            System.out.print("Enter second string: ");  
            str2= sc.nextLine();   
            isAnagram(str1, str2);
        }
    }  
}  
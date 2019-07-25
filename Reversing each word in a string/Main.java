import java.io.*; 
import java.util.*; 
  
class Main { 
  static void reverseWords(String str) 
{ 
    Stack<Character> st=new Stack<Character>(); 
   
    for (int i = 0; i < str.length(); ++i) { 
        if (str.charAt(i) != ' ') 
            st.push(str.charAt(i));  
        else { 
            while (st.empty() == false) { 
                System.out.print(st.pop()); 
                  
            } 
            System.out.print(" "); 
        } 
    }
    while (st.empty() == false) { 
        System.out.print(st.pop()); 
          
    } 
} 
public static void main(String[] args) 
{ 
 Scanner s=new Scanner(System.in);
  String str=s.nextLine();
  reverseWords(str); 
  } 
} 
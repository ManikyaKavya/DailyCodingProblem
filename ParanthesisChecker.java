/*Given a string of round, curly, 
and square open and closing brackets, 
return whether the brackets are balanced (well-formed).*/

import java.util.*; 
  
public class ParanthesisChecker { 
  
    static boolean areParanthesisBalanced(String expr) 
    { 
        Deque<Character> stack = new ArrayDeque<Character>(); 
        for (int i = 0; i < expr.length(); i++) { 
            char x = expr.charAt(i);  
            if (x == '(' || x == '[' || x == '{') { 
                stack.push(x); 
                continue; 
            }  
            if (stack.isEmpty()) 
                return false; 
  
            switch (x) { 
            case ')': 
                stack.pop(); 
                if (x == '{' || x == '[') 
                    return false; 
                break; 
  
            case '}': 
                stack.pop(); 
                if (x == '(' || x == '[') 
                    return false; 
                break; 
  
            case ']': 
                stack.pop(); 
                if (x == '(' || x == '{') 
                    return false; 
                break; 
            } 
        } 
        return (stack.isEmpty()); 
    } 
    public static void main(String[] args) 
    { 
        Scanner sc= new Scanner(System.in);
        String expr = sc.nextLine();
        sc.close();
        if (areParanthesisBalanced(expr)) 
            System.out.println("True "); 
        else
            System.out.println("False"); 
    } 
}

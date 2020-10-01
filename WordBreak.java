/*Given a dictionary of words and a string made up of those words (no spaces), 
return the original sentence in a list. 
If there is more than one possible reconstruction, 
return any of them. If there is no possible reconstruction, then return null.*/

import java.util.*; 

public class WordBreak 
{ 

	private static Set<String> dictionary = new HashSet<>(); 
	
	public static void main(String []args) 
	{ 
		
        String temp_dictionary[]=new String[100];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. of words");
        int num=sc.nextInt();sc.nextLine();
        System.out.println("Enter words");
        for(int i=0;i<num;i++)
        {
            String word= sc.nextLine();
            temp_dictionary[i]=word;
        }
		for (String temp :temp_dictionary) 
		{ 
			dictionary.add(temp); 
		} 
        System.out.println("Enter the word to check:");
        String check=sc.nextLine(); 
		System.out.println(wordBreak(check)); 
		
	} 
	public static boolean wordBreak(String word) 
	{ 
		int size = word.length(); 
		
		if (size == 0) 
		return true; 
		
		//else check for all words 
		for (int i = 1; i <= size; i++) 
		{ 

			if (dictionary.contains(word.substring(0,i)) && 
					wordBreak(word.substring(i,size))) 
			return true; 
		} 
		return false; 
	} 
} 


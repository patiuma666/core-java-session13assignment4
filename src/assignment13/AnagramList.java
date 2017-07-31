//showing the set of anagrams from a list of words .

package assignment13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class AnagramList { //creating a class AnagramList


	public static void main(String[] args) { //creating a main method
		// TODO Auto-generated method stub
		
		List<String> list = new ArrayList<String>();//created an object
		
		//here in the we are adding the list of String values
		list.add("listen");
		list.add("pot");
		list.add("part");
		list.add("opt");
		list.add("trap");
		list.add("silent");
		list.add("top");
		list.add("hello");
		list.add("hits");
		list.add("what");
		list.add("shit");
		
		    System.out.println(findAnagrams(list)); //it prints all the anagrams
     
	}
	//here we have taken a method of Map which shows a value list of anagrams and a key of String and input is list of words
		private static Map<String, List<String>>findAnagrams (List<String> words){
			 Map<String, List<String>> anagrams= null;  // created a HashMap string as a key and list as string 
			 
			 if(words == null || words.size() ==0){  //here it is check the list of words of is empty and return as null
				 return null;
				 
			 }
			    anagrams = new HashMap<String, List<String>>(); //HashMap is an implementation and we are implementing the anagrams 
			   
			    // for example pot takes the word and get into the charArray and sorted them after that they comes to string and forms a string 
			    for(String word : words){                    //creating a for loop which checks the words which we have given
			    	char [] charArray = word.trim().toCharArray();
			    	Arrays.sort(charArray);
			    	String sortedWord = String.valueOf(charArray);
			    	
			    	if(anagrams.containsKey(sortedWord)){            //here it checks weather contains a key and get the sorted word 
			    		  List<String> newList = anagrams.get(sortedWord);     
			    		  newList.add(word);
			    		  anagrams.put(sortedWord, newList);//we put a new list of sorted word
			    		  
			    	}
			    	else{                  //  if the map doesn't contain the sorted word we are creating a new array list of type string
			    		List<String> list = new ArrayList<String>();
			    		list.add(word);
			    		anagrams.put(sortedWord, list);
			    	}
			    }
			 return anagrams; //this returns the anagrams
		}
	}



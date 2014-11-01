import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;


public class Tester {

	/**
	 * @param args
	 * @throws Exception 
	 */
	
	public static void main(String[] args) throws Exception {
		
		SearchDictionary sd = new SearchDictionary();
		
		Scanner s = new Scanner(new File("HP_5.txt"));
		
		HashSet<String> hs = new HashSet<>();
		while (s.hasNext()) {
			String ss = s.next();
			hs.add(ss);
			sd.addWord(ss);
		}
		System.out.println(hs.size());
		Iterable<String> xaxa = sd.query("*");
//		for (String string : xaxa) {
//			System.out.println(string);
//		
//		}
		ArrayList<String> a =(ArrayList<String>) xaxa;
	    System.out.println(a.size());
		
//		sd.addWord("abc");
//		sd.addWord("cba");
//		sd.addWord("abd");
//		sd.addWord("abcd");
//		sd.addWord("abc");
//		System.out.println(sd.hasWord("abc"));
//		System.out.println(sd.hasWord("abcd"));
//		System.out.println(sd.hasWord("cba"));
//		System.out.println(sd.hasWord("abd"));
//		//System.out.println(sd.hasWord("fake"));
//		
//		//sd.delWord("abc");
//		System.out.println("---------------");
//		System.out.println(sd.hasWord("abc"));
//		System.out.println(sd.hasWord("abcd"));
//		System.out.println(sd.hasWord("cba"));
//		System.out.println(sd.hasWord("abd"));
//		
//		System.out.println("---------------");
//		System.out.println("---------------");
//		Iterable<String> xaxa = sd.query("");
//		for (String string : xaxa) {
//			System.out.println(string);
//		}
		
		
	
	}

}

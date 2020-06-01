/*
	William Clift
	Data Structures
	Spring 2020

	 2020 - N-Gramizer Assignment.
*/

import java.util.*;
import java.io.*;

public class ngram{

	public static void main(String[] args){

			long starttime = System.nanoTime();

			int n = Integer.parseInt(args[0]);

			Scanner in = new Scanner(System.in);
			String sentence =in.nextLine();

			ngramizer allgrams = new ngramizer(n, "<s> "+sentence+" </s>");

			List<String> ngrams = allgrams.ngrams_backoff();

			
			for(int i=0; i<ngrams.size(); i++){
				System.out.print(ngrams.get(i));
			}
			
			long endttime = System.nanoTime();
			//System.out.println((endttime-starttime)/1000000);
		
	}
}

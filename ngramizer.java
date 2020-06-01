/*
	William Clift
	Data Structures
	Spring 2020

	 2020 - N-Gramizer Assignment.
*/
import java.util.*;
import java.io.*;

public class ngramizer{

	private List<String> ngrams = new LinkedList<String>();
	private String[] words;
	private int n = 0;

	public ngramizer(int n, String sentence){
		this.n = n;
		this.words = words(sentence);
	}

	private String[] words(String sentence){
		String[] words = sentence.split(" ");
		return words;
	}

	public List<String> ngrams(int n){

		Queue<String> q = new LinkedList<String>();

		for(int i=0; i<n-1; i++){
			q.add(words[i]);
		}

		for(int i = 0; i+n-1<words.length; i++){
			String ngram = "";
			q.add(words[i+n-1]);

			for(String s : q){
				ngram += s + " ";
			}

			ngram += "\n";
			q.remove();

			this.ngrams.add(ngram);
		}
		return this.ngrams;
	}

	public List<String> ngrams_backoff(){

		for(int i=this.n; i>0; i--){
			this.ngrams.add("\n");
			ngrams(i);
		}

		return this.ngrams;
	}
	
}

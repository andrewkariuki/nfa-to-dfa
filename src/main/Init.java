package main;

import java.io.IOException;

public class Init {
	
	public static void main(String[] args) throws IOException, IOException {
		
		//System.out.println("this project accepts DFA and NFA");
		
		ParseNFAtoDFA parseNFAtoDFA = new ParseNFAtoDFA();
		
		//DFA is on args[0] & NFA is on args[3]
		String nfaTodfa = args[0];
		String Strings = args[1];
		String Answers = args[2];
		
		parseNFAtoDFA.main(nfaTodfa, Strings, Answers);
	}
}

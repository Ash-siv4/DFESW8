package com.qa.intermediate2;

import java.util.HashMap;
import java.util.Map;

public class MorseTranslator {
	
	static HashMap<String,String> morseCode = new HashMap<>();

	static String[] alphabet = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j",

			"k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v",

			"w", "x", "y", "z", "1", "2", "3", "4", "5", "6", "7", "8",

			"9", "0" };

	static String[] morse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.",

			"....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.",

			"--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-",

			"-.--", "--..", ".----", "..---", "...--", "....-", ".....",

			"-....", "--...", "---..", "----.", "-----" };
	
	public static void createMap(){
		for(int i=0;i<alphabet.length;i++) {
			morseCode.put(alphabet[i], 
					morse[i]);
		}
		System.out.println(morseCode);
	}
	
	public static String translate(String input) {
		return "";
	}

}

package com.voicecommand;

import edu.cmu.sphinx.api.Configuration;
import edu.cmu.sphinx.api.LiveSpeechRecognizer;
import edu.cmu.sphinx.api.SpeechResult;
import java.io.IOException;

public class VoiceCommand {
	public static void main(String[] args) throws IOException {
		// Configuration Object
		Configuration configuration = new Configuration();

		// Set path to the acoustic model.
		configuration.setAcousticModelPath("resource:/edu/cmu/sphinx/models/en-us/en-us");
		// Set path to the dictionary.
		configuration.setDictionaryPath("9505.dict");
		// Set path to the language model.
		configuration.setLanguageModelPath("9505.lm");

		// Recognizer Object, Pass the Configuration object
		LiveSpeechRecognizer recognize = new LiveSpeechRecognizer(configuration);

		// Start Recognition Process (The bool parameter clears the previous cache if
		// true)
		recognize.startRecognition(true);

		// Create SpeechResult Object
		SpeechResult result;

		// Checking if recognizer has recognized the speech
		while ((result = recognize.getResult()) != null) {
			// Get the recognize speech
			//Get the recognized speech
            String command = result.getHypothesis();
            //System.out.println("Input command is:"+command);
            String work = null;
            Process p;
 
            if(command.equalsIgnoreCase("open file manager")) {
                work = "notepad.exe";
                System.out.println("Open file manager");
            } else if (command.equalsIgnoreCase("close file manager")) {
                work = "taskkill /IM \"notepad.exe\" /F";
                System.out.println("Close file manager");
            } else if (command.equalsIgnoreCase("open browser")) {
                work = "C://Program Files (x86)//Google//Chrome//Application//chrome.exe";
                System.out.println("Open browser");
            } else if (command.equalsIgnoreCase("close browser")) {
                work = "taskkill /IM \"chrome.exe\" /F";
                System.out.println("Close browser");
            }
            //In case command recognized is none of the above hence work might be null
            if(work != null) {
                //Execute the command
                p = Runtime.getRuntime().exec(work);
            }
		}
	}

}

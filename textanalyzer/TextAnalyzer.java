/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package textanalyzer;

/**
 *
 * @author Shreyash
 */
public class TextAnalyzer {

    /**
     * @param args the command line arguments
     */
    private String inputText;
    private int textLength;
    private int numberOfLines;
    private int numberOfTabs;
    private int numberOfSpaces;
    private String uniqueCharacterString = "";
    private int wordCount;
    private int uniqueCharacterCount;
    private char charFind;
    private String wordFinder;
    private int numberOfWords;

    public int getNumberOfWords() {
        String[] s = inputText.split("[\s\t\n]");
        return inputText.isBlank() ? 0 : s.length;
    }

    public int getTextLength() {
        return inputText.length();
    }

    public int getNumberOfLines() {
        String[] lines = inputText.split("\n");
        return inputText.isEmpty() ? 0 : lines.length;
    }

    public int getNumberOfTabs() {
        String[] tabs = inputText.split("\t");
        return inputText.isEmpty() ?  0 : tabs.length - 1;
    }

    public int getNumberOfSpaces() {
        String[] spaces = inputText.split("\s");
        return inputText.isEmpty() ? 0 :  spaces.length - 1;
    }

    public String getUniqueCharacter() {
 
        for(int i = 0; i < inputText.length(); i++){
            if(inputText.charAt(i) == '\s' || inputText.charAt(i) == '\t'|| inputText.charAt(i) == '\n'){
                uniqueCharacterString = uniqueCharacterString + "";
            }else if(!uniqueCharacterString.contains(inputText.charAt(i) + "")){
                
                uniqueCharacterString = uniqueCharacterString + inputText.charAt(i);
            }
        }
        return uniqueCharacterString;
    }

    public int getUniqueCharacterCount(char ch) {
        int count = 0;
        for(int i = 0; i < inputText.length(); i++){
            if(ch == inputText.charAt(i))count++;
        }
        return count;
    }
    
    

    public int getWordCount(String word) {
        int count = 0;
        String caseSensitive = word.toLowerCase();
        String[] wordsInText = this.inputText.split("[\n\t\s]");
        for(String k : wordsInText){
            if(caseSensitive.equals(k.toLowerCase()))count++;
        }
        return count;
    }
    
    

    public TextAnalyzer(String inputText) {
        this.inputText = inputText;
        textLength = this.getTextLength();
        numberOfLines = this.getNumberOfLines();
        numberOfTabs = this.getNumberOfTabs();
        numberOfSpaces = this.getNumberOfSpaces();
        numberOfWords = this.getNumberOfWords();
       
    }
    
    
   
    

}

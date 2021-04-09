****AutoSuggestion****

The code helps you create a AutoSuggestion App, where you can easily add any data structure.

*How To Use*
1. Create a text file under resource. As of now I have a static file named TextCorpus.txt.
2. Enter the words that you want to keep in your dictionary.
3. The main method is inside the App class.
4. Run and input the word for which you need to look into the corpus.

For Example,
TextCorpus.txt file has 
"Hello"
"Help"

If you input string as "He", the result displayed would be "hello" and "help".

*To add a new Data Structure*

*AutoSuggest*

AutoSuggest Interface has tow method declared.
    public void addWordList(List<String> word);
    public List<String> getAutoSuggestWords(String prefix);
  
Define the above two methods in your class and you can use it for autosuggestion.

*WordProcess*
As of now only text files can be parsed and the relevant data can be put into the AutoSuggest structure.
We can extend it to any format.


# AutoSuggestion

The code helps you create a AutoSuggestion App, where you can easily add any data structure.

How To Use

Create a text file under resource. As of now I have a static file named TextCorpus.txt.
Enter the words that you want to keep in your dictionary.
The main method is inside the App class.
Run and input the word for which you need to look into the corpus.
For Example, TextCorpus.txt file has "Hello" "Help"

If you input string as "He", the result displayed would be "hello" and "help".

To add a new Data Structure

AutoSuggest

AutoSuggest Interface has tow method declared. public void addWordList(List word); public List getAutoSuggestWords(String prefix);

Define the above two methods in your class and you can use it for autosuggestion.

WordProcess As of now only text files can be parsed and the relevant data can be put into the AutoSuggest structure. We can extend it to any format.

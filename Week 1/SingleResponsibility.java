// Overview:
// Basically it means that a class can do onlyone job or it can take only one responsibility and so it is named as single responsibilyt. 
// for example conside a class name book stores the information of the book and we it has the responsibility to edit the words in the book. 

// And thus the class cannot print the words since every class is allowed to do only one job. 

public class Book {
    private String name;
    private String author;
    private String text;

    // getters and setters
}
//Then we add methods to work with the book’s text:

public String replaceWordInText(String word, String replacementWord) {
    return text.replaceAll(word, replacementWord);
}

public boolean isWordInText(String word) {
    return text.contains(word);
}

//But then we do this:

void printTextToConsole() {
    // formatting and printing the text
}

// Now the class is:

// Managing book data ✅

// Handling text operations ✅

// AND printing to console ❌

//How do we fix it?

//create new class for printing 
public class BookPrinter {
    void printTextToConsole(String text) {
        // code for printing
    }

    void printTextToAnotherMedium(String text) {
        // e.g., write to file, email, etc.
    }
}

public class stringOne {

    //Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".
        public java.lang.String helloName(String name) {
            return "Hello " +  name + "!";
    }

    //Given two strings, a and b, return the result of putting them together in the order abba, e.g. "Hi" and "Bye"
    // returns "HiByeByeHi".
        public String makeAbba(String a, String b) {
            return a + b + b + a;
        }

    //The web is built with HTML strings like "<i>Yay</i>" which draws Yay as italic text. In this example, the "i" tag
    // makes <i> and </i> which surround the word "Yay". Given tag and word strings, create the HTML string with tags
    // around the word, e.g. "<i>Yay</i>".
        public String makeTags(String tag, String word) {
            return "<"+tag+">"+word+"</"+tag+">";
        }

    //Given an "out" string length 4, such as "<<>>", and a word, return a new string where the word is in the middle
    // of the out string, e.g. "<<word>>". Note: use str.substring(i, j) to extract the String starting at index i and
    // going up to but not including index j.
        public String makeOutWord(String out, String word) {
            return out.substring(0,2) + word + out.substring(2);
        }

    //Given a string, return a new string made of 3 copies of the last 2 chars of the original string. The string length
    // will be at least 2.
        public String extraEnd(String str) {
            int len = str.length();
            return str.substring (len-2) +  str.substring (len-2) +  str.substring (len-2);
    }

}

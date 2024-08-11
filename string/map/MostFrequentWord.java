package in.dsa.string.map;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MostFrequentWord {
	
	
	 public static void main(String[] args) {
	        MostFrequentWord solution = new MostFrequentWord();
	        
	        // Testcase
	        String paragraph = "j. t? T. z! R, v, F' x! L; l! W. M; S. y? r! n; O. q; I? h; w. t; y; X? y, p. k! k, h, J, r? w! U! V; j' u; R! z. s. T' k. P? M' I' j! y. P, T! e; X. w? M! Y, X; G; d, X? S' F, K? V, r' v, v, D, w, K! S? Q! N. n. V. v. t? t' x! u. j; m; n! F, V' Y! h; c! V, v, X' X' t? n; N' r; x. W' P? W; p' q, S' X, J; R. x; z; z! G, U; m. P; o. P! Y; I, I' l' J? h; Q; s? U, q, x. J, T! o. z, N, L; u, w! u, S. Y! V; S? y' E! O; p' X, w. p' M, h! R; t? K? Y' z? T? w; u. q' R, q, T. R? I. R! t, X, s? u; z. u, Y, n' U; m; p? g' P? y' v, o? K? R. Q? I! c, X, x. r' u! m' y. t. W; x! K? B. v; m, k; k' x; Z! U! p. U? Q, t, u' E' n? S' w. y; W, x? r. p! Y? q, Y. t, Z' V, S. q; W. Z, z? x! k, I. n; x? z; V? s! g, U; E' m! Z? y' x? V! t, F. Z? Y' S! z, Y' T? x? v? o! l; d; G' L. L, Z? q. w' r? U! E, H. C, Q! O? w! s? w' D. R, Y? u. w, N. Z? h. M? o, B, g, Z! t! l, W? z, o? z, q! O? u, N; o' o? V; S! z; q! q. o, t! q! w! Z? Z? w, F? O' N' U' p? r' J' L; S. M; g' V. i, P, v, v, f; W? L, y! i' z; L? w. v, s! P?";
	        String[] banned = {"m","q","e","l","c","i","z","j","g","t","w","v","h","p","d","b","a","r","x","n"};
	        
	        System.out.println("Input: paragraph = \"" + paragraph + "\", banned = [\"m\",\"q\",\"e\",\"l\",\"c\",\"i\",\"z\",\"j\",\"g\",\"t\",\"w\",\"v\",\"h\",\"p\",\"d\",\"b\",\"a\",\"r\",\"x\",\"n\"]");
	        System.out.println("Output: " + solution.mostCommonWord(paragraph, banned)); // Expected: "y"
	    }
	
    public String mostCommonWord(String paragraph, String[] banned) {
       
    	//Convert the paragraph to lowercase and replace punctuation with spaces
        paragraph = paragraph.toLowerCase().replaceAll("[^a-zA-Z0-9]", " ");
        
        //Split the cleaned paragraph into words
        String[] words = paragraph.split("\\s+");
        
        //Use a set to store banned words for quick lookup
        Set<String> bannedSet = new HashSet<>();
        
        for(String word : banned) 
            bannedSet.add(word.toLowerCase());
        
        //Use a map to count frequencies of non-banned words
        Map<String, Integer> wordCount = new HashMap<>();
        for(String word : words){
            // Skip empty words and banned words
            if (!word.isEmpty() && !bannedSet.contains(word)) {
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            }
        }
        
        // Find the most frequent non-banned word
        String mostFrequentWord = "";
        int maxCount = 0;
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mostFrequentWord = entry.getKey();
            }
        }
        
        return mostFrequentWord;
    }
    
   
}

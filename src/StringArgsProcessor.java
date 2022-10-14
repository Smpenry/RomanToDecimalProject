public class StringArgsProcessor {


    public static void main(String[] args) {


        for(String s : args) {
            System.out.println(s);
            for(int i = 0; i < s.length(); i++) {
                // 'c' vs "c"
                System.out.print(s.charAt(i));
                System.out.print("\t");
                System.out.println(s.substring(i, i+1));
            }
        }

        // Question: How do I find if a substring exists in a string?
        String word = "chicken";
        String sub = "n";

        if(word.contains(sub))
            System.out.println(sub + " is in " + word);
        else
            System.out.println(sub + " is not in " + word);

        System.out.println(word.indexOf(sub));
    }
}


public class H10 {
    public static void main(String[] args) {
        String input = "bananowy";
        String result = removeDuplicate(input);
        System.out.println(result);
    }

    public static String removeDuplicate(String input) {
        if (input == null) {
            return null;
        }

        StringBuilder result = new StringBuilder();
        StringBuilder seen = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            {
                char ch = input.charAt(i);
                int index = input.indexOf(ch,i+1);
                if(index==-1)//-1 ozn że znak się nie powtórzył
                {
                    result.append(ch);
                }
            }
        }
        return result.toString();
    }
}

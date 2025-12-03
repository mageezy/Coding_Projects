public class valid_parentheses {
    public static void main(String[] args) {
        valid_parentheses vp = new valid_parentheses();
        String input = "([{})";
        boolean valid = vp.isValid(input);
        System.out.println("Parentheses are valid: " + valid);
    }

    public boolean isValid(String s) {
        // While s contains pairs of parentheses keep going through the loop
        while (s.contains("()") | s.contains("[]") | s.contains("{}")) {
            //replace all instances of parentheses pairs with nothing
            s = s.replaceAll("\\(\\)|\\[\\]|\\{\\}", "");
        }
        return s.isEmpty();
    }
}
class Solution {
    public String removeDuplicateLetters(String s) {
        
        Stack<Character> stack = new Stack<>();
        int alpha[] = new int[26];  

        for (int i = 0; i < s.length(); i++) {
            alpha[s.charAt(i) - 'a'] = i;
        }

        boolean[] visited = new boolean[26];

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (visited[ch - 'a']) continue;

            while (!stack.isEmpty() &&
                    stack.peek() > ch &&
                    i < alpha[stack.peek() - 'a']) {

                visited[stack.pop() - 'a'] = false;
            }

            stack.push(ch);
            visited[ch - 'a'] = true;
        }

        
        StringBuilder sb = new StringBuilder();
        for (char c : stack) sb.append(c);

        return sb.toString();
    }
}

class Solution {
    public boolean isValid(String s) {
        if (s=="") return true;
        Deque<Character> stack = new ArrayDeque<>();
        HashMap<Character, Character> map= new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)){
                char topElement = stack.isEmpty() ? 'f' : stack.pop();
                if (topElement != map.get(c)){
                    return false;
                }
            }else{
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}
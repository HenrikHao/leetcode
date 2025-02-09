package src;

public class ReverseString {
    public void reverseString(char[] s) {
        int head = 0, tail = s.length - 1;
        while (head < tail) {
            char tmp = s[head];
            s[head] = s[tail];
            s[tail] = tmp;
            head++;
            tail--;
        }
    }
}

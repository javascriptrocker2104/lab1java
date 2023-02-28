public class Palindrome {
    public static void main(String[] args) {
        args = new String[] { "java", "Palindrome", "madam", "racecar", "apple", "kayak", "song", "noon" };
        for (int i = 0; i < args.length; i++) {
            String s = args[i];
            System.out.println(s + " : " + Boolean.toString(isPalindrome(s)));
        }
    }

    // Возвращает строку в обратном порядке
    public static String reverseString(String s) {
        String res = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            res += s.charAt(i);
        }
        return res;
    }

    // Проверяет является ли слово палиндромом
    public static boolean isPalindrome(String s) {
        return s.equals(reverseString(s));
    }
}

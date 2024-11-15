package exercises;

import java.security.KeyStore;
import java.util.*;

public class HomeWork2 {


    //1. Write a Java program to get the index of all the characters of the alphabet
    public void charactersInAlphabet() {
        int i = 1;
        for (char c = 'a'; c <= 'z'; c++) {
            System.out.println("char: " + c + ", index: " + i);
            i++;
        }
    }

    //2. Write a Java program to find the second most frequent character in a given string: successes  -  cceessssu
    public List<Character> mostFrequentChars(String text) {

        Map<Character, Integer> map = new HashMap<>();
        int n = 1;

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            if (map.containsKey(c)) {
                map.replace(c, map.get(c) + 1);
            } else {
                map.put(c, n);
            }
        }


        List<Integer> values = new ArrayList<>(map.values());
        Collections.sort(values, Collections.reverseOrder());
        int value = values.get(1);

        List<Character> chars = new ArrayList<>();

        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            if(entry.getValue()==value){
                chars.add(entry.getKey());
            }
        }

        return chars;
    }




    //4. Write a Java program to print the result of removing duplicates from a given string.
    public void removeDuplicates(String text) {

        Set<Character> set = new LinkedHashSet<>();

        for (int i = 0; i < text.length(); i++) {
            set.add(text.charAt(i));
        }
        for (int i = 0; i < set.size(); i++) {
            System.out.print(set.toArray()[i]);
        }

    }


    //5. Write a Java program to divide a string into n equal parts
    public List<String> divideString(String text, int parts) {  //test stri ngnu mber sa

        int partLength = text.length() % parts == 0 ? text.length() / parts : (text.length() / parts) + 1;
        int add = partLength;
        List<String> list = new ArrayList<>();

        for (int i = 0; i < text.length(); i += add) {
            int end = Math.min(partLength, text.length());
            list.add(text.substring(i, end));
            partLength += add;
        }
        return list;
    }


    //6. Write a Java program to reverse words in a given string.
    public String reverseString(String text) {
        String reversed = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            reversed += text.charAt(i);
        }
        return reversed;
    }


    //7. Write a Java program to return the sum of the digits present in the given string. In the absence of digits, the sum is 0.
    public int sumOfDigitsInString(String text) {   // ab2cg34k

        int sum = 0;
        String digits = "123456789";
        for (int i = 0; i < text.length(); i++) {
            if (digits.contains(String.valueOf(text.charAt(i))))
                sum += text.charAt(i) - '0';
//                sum += Integer.parseInt(String.valueOf(text.charAt(i)));
        }


        return sum;
    }


    //8. Write a Java program to sort in ascending and descending order by the length of the given array of strings.
    public void orderStringArray(String[] arr) {    //{"abcd", "a", "bcd", "ab"}

        for (int i = 0; i < arr.length - 1; i++) {
            for (int k = i + 1; k < arr.length; k++) {

                if (arr[i].length() > arr[k].length()) {
                    String cash = arr[i];
                    arr[i] = arr[k];
                    arr[k] = cash;
                }
            }
        }
    }


    //9. Write a Java program to find the maximum and minimum value of an array.
    public int maxValueOfArray(int[] arr) {
        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i])
                max = arr[i];
        }
        return max;
    }


    //10. Write a program to count the occurrences of a specific value in an array.
    public int occurrencesOfValue(String[] arr, String value) {
        int occurrences = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(value))
                occurrences++;
        }
        return occurrences;
    }


}

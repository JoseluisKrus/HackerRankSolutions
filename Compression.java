public class Compression {
    public static void main(String[] args) {

        String word = "abaassasss";
        StringBuilder srt = new StringBuilder();
        int length = word.length();
        for (int i = 0; i < length; i++) {
            int count = 1;
            while (i < length - 1 && word.charAt(i) == word.charAt(i + 1)) {
                count++;
                i++;
            }
            if (count == 1) {
                srt.append(word.charAt(i));
            } else {
                srt.append(word.charAt(i));
                srt.append(count);
            }
        }
        System.out.println(srt);
    }
}


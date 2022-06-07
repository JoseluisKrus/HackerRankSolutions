public class Dna {
    public static void main(String[] args) {

        String dna = "AGCATTA";
        StringBuilder str = new StringBuilder();

        str.append(dna);
        str.reverse();
        System.out.println(str);
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char a = str.charAt(i);
            char toSwitch =' ';
            switch (a){
                case 'A':
                   toSwitch = 'T';
                   break;
                case 'T':
                    toSwitch = 'A';
                    break;
                    case 'G':
                    toSwitch = 'C';
                    break;
                    case 'C':
                    toSwitch = 'G';
                    break;
            }
            result.append(toSwitch);
        }
        System.out.println(result);
    }
}

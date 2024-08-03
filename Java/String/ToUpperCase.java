/*given string - "ritesh ramprakash chougule"
 * Expected output - "Ritesh Ramprakash Chougule"
 * the first letter of each word is capitalized in the output
 */
public class ToUpperCase {
    public static void main(String[] args) {
        String str = "ritesh ramprakash chougule";
        ToUppercase(str);
    }

    public static void ToUppercase(String str){
        StringBuilder sb = new StringBuilder("");
         sb.append(Character.toUpperCase(str.charAt(0)));

         for(int i=1 ; i<str.length(); i++){
            if (str.charAt(i) == ' ' && i< str.length()-1 ){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else{
                sb.append(str.charAt(i));
            }
         }

         System.err.println(sb);
    }
}

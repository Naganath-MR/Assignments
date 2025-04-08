package sample.org;

public class Print {

    public static void main(String[] args) {

        String name = "Ilaya Perumal 12@#";

        int lowerCount = 0;
        int upperCount = 0;
        int specialCount = 0;

        String lowerChars = "";
        String upperChars = "";
        String specialChars = "";
        
        char [] ch = name.toCharArray();

        for (char x : ch) {
            if (Character.isLowerCase(x)) {
                lowerCount++;
                lowerChars += x + " ";
            } else if (Character.isUpperCase(x)) {
                upperCount++;
                upperChars += x + " ";
            } else if (!Character.isLetterOrDigit(x)) {
                specialCount++;
                specialChars += x + " ";
            }
        }
        System.out.println( "Small letters: " +lowerChars);
        System.out.println("Total small letters: " + lowerCount);
       
        System.out.println("Uppercase letters: " +upperChars );
        System.out.println("Total uppercase letters: " + upperCount);
        
        System.out.println("Special characters: "+specialChars);
        System.out.println("Total special characters: " + specialCount);
        
    }
}

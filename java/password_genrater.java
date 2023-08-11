import java.util.*;


public class password_genrater {
    public static void main(String[] args) {
        int lenght = 8;
        System.out.println(NewPassword(lenght));
        
    }
    static char[] NewPassword(int length){
        System.out.println("new password is :");

        String capital = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String small = "abcdefghijklmnopqrstuvwxyz";
        String num = "0123456789";
        String specialChar = "@#$%&*-+_";

        String all = capital+small+num+specialChar;
        Random rndm_method = new Random();

        char [] password = new char[length];
        
        for (int i = 0; i < length; i++) {
            password[i] = all.charAt(rndm_method.nextInt(all.length()));
            
        }

        return password;
    }
    
}

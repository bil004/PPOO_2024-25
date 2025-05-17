package Es1;

public class StringOps {
    public static String longest(String[] s) {
        assert s != null && s.length > 0 : "Array nullo o vuoto passato a longest()!";

        String result = "";

        for (int i = 0; i < s.length; i++) {
            if (result.length() < s[i].length()) {
                result = s[i];
            }
        }

        return result;
    }

    public static String concatAll(String[] s) {
        assert s != null && s.length > 0 : "Array nullo o vuoto passato a concatAll()!";

        String result = "";

        for (int i = 0; i < s.length; i++) {
            assert s[i] != null : "Elemento nullo nell'array passato a concatAll()!";
            
            result = result.concat(s[i]);
        }

        return result;
    }

    public static String trim(String str) {
        assert str != null : "Stringa nulla passata a trim()!";

        int i = 0, j = str.length();

        while(i < str.length() && str.charAt(i) == ' ') 
            i++;

        while(j >= 0 && str.charAt(j - 1) == ' ') 
            j--;

        return (i <= j) ? str.substring(i, j) : "";
    }
}

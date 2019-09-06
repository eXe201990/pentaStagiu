public class FindSubstring {
    public static void main(String[] args) {

    }

    private static boolean findSubstring(String str, String substr){
        boolean result = false;

        if(str.contains(substr)){
            result = true;
        }

        return result;
    }
}

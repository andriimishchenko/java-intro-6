package lesson02;

public class StringTask {


    public static String eachNth(String str, int n){
        if (str.isEmpty())return "Empty string";
        else if (n>str.length())return "Big number";

        char[] newCharArr = str.toCharArray();
        String finalStr=new String();
        for (int i=0;i<=newCharArr.length;i+=n) finalStr+=newCharArr[i];
        System.out.println(finalStr);

        return finalStr;
    }

    public static void main(String[] args) {
        eachNth("Miracle", 2);// → "Mrce"
        eachNth("abcdefg", 2);// → "aceg"
        eachNth("abcdefg", 3);// → "adg"
    }

}

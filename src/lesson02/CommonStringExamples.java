package lesson02;

import java.util.Scanner;

public class CommonStringExamples {
    public static void main(String[] args) {

        String str = "Abracadabra";
        boolean f=true;

//uncomment me
/*
//    char charAt(int index) - Возвращает символ по указанному индексу.
        System.out.println(str);
        System.out.print("Enter index of element: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n<=str.length()) System.out.println(str.charAt(n));

//    String concat(String str) - Объединяет указанную строку с данной строкой, путем добавления ее в конце (‘+’).
        String str1 ="abra";
        String str2 = "cadabra";
        System.out.println(str1.concat(str2));

//    boolean endsWith(String suffix) - Проверяет заканчивается ли эта строка указанным окончанием.
        System.out.println(str);
        if(str.endsWith("cadabra")==f) System.out.println(f);

//    boolean equals(Object anObject) - Сравнивает данную строку с указанным объектом.
        String sObj = new String("Abra");
        String st="cadabra";
        if (st.equals(sObj)==f)System.out.println(f);

//    boolean equalsIgnoreCase(String anotherString) - Сравнивает данную строку с другой строкой, игнорируя регистр букв.
        String sCC="AbRaCaDaBrA";
        String sLC="abracadabra";
        if (sCC.equalsIgnoreCase(sLC)==f) System.out.println(f);

//    int indexOf(int ch) - Возвращает индекс первого вхождения указанного символа в данной строке.
        System.out.println(str);
        System.out.print("Enter index of found element: ");
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        System.out.println(str.indexOf('r'));

//    int indexOf(String str) - Возвращает индекс первого вхождения указанной подстроки в данной строке.
        System.out.println(str);
        System.out.print("Enter index of found element: ");
        Scanner in = new Scanner(System.in);
        String subStr = in.nextLine();
        System.out.println(str.indexOf(subStr));

//    int lastIndexOf(int ch) - Возвращает индекс последнего вхождения указанного символа в этой строке.
        System.out.println(str);
        System.out.print("Enter index of found element: ");
        Scanner scan = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        System.out.println(str.lastIndexOf('r'));

//    int lastIndexOf(String str) - Возвращает индекс последнего вхождения указанной подстроки в данной строке.
        System.out.println(str);
        System.out.print("Enter index of found element: ");
        Scanner input = new Scanner(System.in);
        String subString = in.nextLine();
        System.out.println(str.indexOf(subString));

//    int length() - Возвращает длину строки.
        System.out.println(str);
        System.out.println(str.length());

//    String replace(char oldChar, char newChar) - Возвращает новую строку, в результате, заменив все вхождения oldChar в этой строке на newChar.
        System.out.println(str);
        System.out.println(str.replace('a','e'));

//    String[] split(String regex) - Разделяет эту строку, окружая данным регулярным выражением.
        String strReg = "Abra-cadab-ra";
        System.out.println(strReg);
        String[] splitStr = strReg.split("-");
        for (String ss:splitStr) System.out.println(ss);

//    boolean startsWith(String prefix) - Проверяет, начинается ли эта строка с заданного префикса.
        System.out.println(str);
        if(str.startsWith("Abra")) System.out.println(f);

//    String substring(int beginIndex) - Возвращает новую строку, которая является подстрокой данной строки.
        System.out.println(str);
        System.out.print("Enter index of begining new substring: ");
        Scanner scanner3 = new Scanner(System.in);
        int b = scanner.nextInt();
        if(b<=str.length()) System.out.println(str.substring(b));

//    String substring(int beginIndex, int endIndex) - Возвращает новую строку, которая является подстрокой данной строки.
        System.out.println(str);
        System.out.print("Enter index of begin new substring: ");
        Scanner scB = new Scanner(System.in);
        int beg = scanner.nextInt();
        System.out.print("Enter index of end new substring: ");
        Scanner scE = new Scanner(System.in);
        int end = scanner.nextInt();
        if((beg<=str.length()||end<=str.length())&&beg<end) System.out.println(str.substring(beg,end));

//    char[] toCharArray() - Преобразует эту строку в новый массив символов.
        System.out.println(str);
        char[]chars=str.toCharArray();
        for (char symb:chars) System.out.print(symb+ " ");

//    String toLowerCase() - Преобразует все символы в данной строке в нижний регистр, используя правила данного языкового стандарта.
        String strLC="AbRaCaDaBrA";
        System.out.println(strLC);
        System.out.println(strLC.toLowerCase());

//    String toUpperCase() - Преобразует все символы в строке в верхний регистр, используя правила данного языкового стандарта.
        String strUC="AbRaCaDaBrA";
        System.out.println(strUC);
        System.out.println(strUC.toUpperCase());

//    String trim() - Возвращает копию строки с пропущенными начальными и конечными пробелами.
        String str4Trim = "    Abracadabra    ";
        System.out.println(str4Trim);
        System.out.println(str4Trim.trim());

*/
    }
}

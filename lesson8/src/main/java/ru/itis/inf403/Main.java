package ru.itis.inf403;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        searching("(^|\\s)(Я|я)(\\s|,\\.|\\?|!|$)|(^|\\s)(М|м)оё(\\s|,|\\.|\\?|!|$)|(^|\\s)(М|м)не(\\s|,|\\.|\\?|!|$)");
        searching("(^|\\s)(м|М)уза(\\s|,|\\.|!,|\\?|$)");
        searching("(^|\\s)(Л|л)юбовь(\\s|,|\\.|\\?|!|$)");
        searching("(^|\\s)(Д|д)рузья(\\s|,\\.|\\?|!|$)");
        searching("(^|\\s)(П|п)оэт(\\s|,\\.|\\?|!|$)");
        searching("[вВ]етры.+веют");
        searching("(в|В)зор.+(Вст|вст|т|Т)ревожит");
        searching("(^|\\s)(м|М)ор(я|ем||е|ю|ей|ями|ях)(\\s|,\\.|\\?|!|$)");
       System.out.println(Pattern.matches(".*\bJava\b.*","fejjie Java, xsj")); //????
    }
    public static void searching(String shab) throws FileNotFoundException {
            Scanner sc = new Scanner(new File("pushkin.txt"));
            Pattern pattern = Pattern.compile(shab);
            int cnt = 0, cnt1 = 0;
            while (sc.hasNextLine()) {
                cnt++;
                boolean ok = false;
                if (cnt1 > 4) {
                    break;
                }
                String str = sc.nextLine();
                Matcher matcher = pattern.matcher(str);
                while (matcher.find()) {
                    ok=true;
                    System.out.println(cnt);
                    ColoredPrint.print(str, matcher.start(), matcher.end());
                }
                if (ok) {
                    cnt1++;
                }
            }
        System.out.println("Найдены первые 5(если такие есть) вхождений");
    }
}
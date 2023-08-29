import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        exercise_5_8();
    }

    public  static void exercise_5_10() {
        String stringText = "Рекс Лорд Лом Шарик Бобик Шалун";
        Pattern pattern = Pattern.compile("Л[а-я]+");
        Matcher matcher = pattern.matcher(stringText);
        while (matcher.find())
        {
            System.out.println(stringText.substring(matcher.start(), matcher.end()));
        }

    }
    public  static void exercise_5_9() {
        String stringText = "SW Eltex MES1124 УД АТС-66 388-22-66-СОШ №1 MES-1124 (172.16.16.93):03 /nSW D-Link DES-1210-28/ME УД АТС-45 МБОУ DES-1210-28 " +
                "(172.16.252.170) /nSW D-Link DES-1210-28/ME 385-4 Бийск ПСЭ-32/2 32/2-106/5(ОКН) DES-1210-28(ОКН) (10.50.140.206):02 " +
                "/nкрс 2036 35 (1) штк СТШ2036-001 d2036-3(10.54.20.124) 0/0";
        Pattern pattern = Pattern.compile("([0-9]{1,3}[\\.]){3}[0-9]{1,3}");
        Matcher matcher = pattern.matcher(stringText);
        while (matcher.find()) {
            System.out.println(stringText.substring(matcher.start(), matcher.end()));
        }

    }
    public  static void exercise_5_8() {
        Motorbike motorbike = new Motorbike(2020, "Honda", "Black");
        System.out.println(motorbike.getModel() + "\n" +
                motorbike.getYear() + "\n" +
                motorbike.getColor());
    }
    public  static void exercise_5_7() {
        Machine machine_0 = new Machine("asrgewr", 500);
        machine_0.work(300);
        machine_0.work(300);
        machine_0.refuel(700);
        machine_0.work(240);
    }
    public  static void exercise_5_6_1() {
        String stringText = "До свиданья, друг мой, до свиданья.\n" +
                "Милый мой, ты у меня в груди.\n" +
                "Предназначенное расставанье\n" +
                "Обещает встречу впереди.\n" +
                "\n" +
                "До свиданья, друг мой, без руки, без слова,\n" +
                "Не грусти и не печаль бровей, —\n" +
                "В этой жизни умирать не ново,\n" +
                "Но и жить, конечно, не новей.";
        Pattern pattern = Pattern.compile("[^.!?]*(друг)[^.!?]*[.!?]");
        Matcher matcher = pattern.matcher(stringText);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }




    public  static void exercise_5_6_2() {
        String stringText = "До свиданья, друг мой, до свиданья.\n" +
                "Милый мой, ты у меня в груди.\n" +
                "Предназначенное расставанье\n" +
                "Обещает встречу впереди.\n" +
                "\n" +
                "До свиданья, друг мой, без руки, без слова,\n" +
                "Не грусти и не печаль бровей, —\n" +
                "В этой жизни умирать не ново,\n" +
                "Но и жить, конечно, не новей.";

        String [] str = stringText.split("[.!?]");
        for (String s:str) {
            if (Pattern.matches("[^.!?]*(друг)[^.!?]*", s))
                System.out.println(s + "");
        }
    }

    public  static void exercise_5_6_3() {
        String text = "До свиданья, друг мой, до свиданья.\n" +
                "Милый мой, ты у меня в груди.\n" +
                "Предназначенное расставанье\n" +
                "Обещает встречу впереди.\n" +
                "\n" +
                "До свиданья, друг мой, без руки, без слова,\n" +
                "Не грусти и не печаль бровей,-\n" +
                "В этой жизни умирать не ново,\n" +
                "Но и жить, конечно, не новей.";
        Pattern pattern = Pattern.compile("[^.!?]*(друг)[^.!?]*[.!?]");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println(text.substring(matcher.start(), matcher.end()));
        }
    }
    public  static void exercise_5_5()
    {
        String stringText = "WrongMsisdnError SuccessfulTransaction TimeOutError InternalError SuccessfulTransaction ExternalIDError " +
                "SuccessfulTransaction WrongIDError InvalidArgumentError SuccessfulTransaction SuccessfulTransaction SuccessfulTransaction WrongMsisdnError";
        Pattern pattern = Pattern.compile("\\b\\w+Error\\b");
        Matcher matcher = pattern.matcher(stringText);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }

        String [] str = stringText.split(" ");
        for (String s:str) {
            if (Pattern.matches(".*?Error", s)) {
                System.out.print(s + " ");
            }

        }

    }
    public  static void exercise_5_4()
    {
        String stringTest = "[a-zA-Z]+";
        String text = "1It is 2interesting TO 4study VERY666, Делайте обучение интересней";
        Pattern pattern = Pattern.compile(stringTest);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            //System.out.println(matcher.group());
            //System.out.println(text.substring(matcher.start(), matcher.end()));
    }
    }

    public  static void exercise_5_2()
    {
        String text = "У Сени и Сани в сенях сом с усами";
        Pattern pattern = Pattern.compile("[Сс][а-я]+");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println(text.substring(matcher.start(), matcher.end()));
            System.out.println(matcher.group());
        }
    }

    public  static void exercise_5_1()
    {
        StringBuilder strBuilder = createNum();
        findNum(strBuilder);
    }
    public static StringBuilder createNum()
    {
        StringBuilder strBuilder = new StringBuilder();
        Pattern pattern = Pattern.compile("^(\\d{3})(\\d{4})$");

        for (int aCount = 1000000; aCount <= 9999999; aCount++) {
            Matcher matcher = pattern.matcher(Integer.toString(aCount));
            if (matcher.find()) {
                strBuilder.append("+7 (926) ").append(matcher.group(1)).append("-").append(matcher.group(2)).append("; ");
            }
        }
        System.out.println(strBuilder.toString());
        return strBuilder;
    }
    public static void findNum(StringBuilder strBuilder) {
        Pattern pattern = Pattern.compile("(\\d[0]{2})-([0]{4})");
        Matcher matcher2 = pattern.matcher(strBuilder);
        while (matcher2.find()) {
            System.out.println("+7 (926) " + matcher2.group(1) + "-" + matcher2.group(2) + "; ");
        }
    }



}
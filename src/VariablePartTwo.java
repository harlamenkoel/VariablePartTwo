public class VariablePartTwo {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        byte wholeNumber1 = 101;
        short wholeNumber2 = 1001;
        int wholeNumber3 = 10001;
        long wholeNumber4 = 1_000_001L;
        float fractionalNumber1 = 1.5F;
        double fractionalNumber2 = 10.101;
        System.out.println("Значение переменной wholeNumber1 с типом byte равно " + wholeNumber1);
        System.out.println("Значение переменной wholeNumber2 с типом short равно " + wholeNumber2);
        System.out.println("Значение переменной wholeNumber3 с типом int равно " + wholeNumber3);
        System.out.println("Значение переменной wholeNumber4 с типом long равно " + wholeNumber4);
        System.out.println("Значение переменной fractionalNumber1  с типом byte равно " + fractionalNumber1);
        System.out.println("Значение переменной fractionalNumber2 с типом byte равно " + fractionalNumber2);

        System.out.println("Задание 2");
        float variable1 = 27.12F;
        long variable2 = 987_678_965_549L;
        byte variable3 = 2;
        short variable4 = 786;
        boolean isVariable5 = false;
        char variable6 = 569;
        short variable7 = -159;
        int variable8 = 27897;
        double variable9 = 67;
        System.out.println("Значение переменной variable1 с типом float равно " + variable1);
        System.out.println("Значение переменной variable2 с типом long равно " + variable2);
        System.out.println("Значение переменной variable3 с типом byte равно " + variable3);
        System.out.println("Значение переменной variable4 с типом short равно " + variable4);
        System.out.println("Значение переменной variable5 с типом boolean равно " + isVariable5);
        System.out.println("Значение переменной variable6 с типом variable6 равно " + variable6);
        System.out.println("Значение переменной variable7 с типом variable7 равно " + variable7);
        System.out.println("Значение переменной variable8 с типом variable8 равно " + variable8);
        System.out.println("Значение переменной variable9 с типом variable9 равно " + variable9);

        System.out.println("Задача 3");
        byte teacherStudents1 = 23;
        byte teacherStudents2 = 27;
        byte teacherStudents3 = 30;
        short sheets = 480;
        int sheetOnStudent = sheets / (teacherStudents1 + teacherStudents2 + teacherStudents3);
        System.out.println("На каждого ученика рассчитано " + sheetOnStudent + " листов бумаги");

        System.out.println("Задача 4");
        byte bottlesPerMinute = 16 / 2;
        int bottlesPerOneThird = bottlesPerMinute * 20;
        int bottlesPerDay = bottlesPerOneThird * 3 * 24;
        int bottlesPerThreeDay = bottlesPerDay * 3;
        int bottlesPerMonth = bottlesPerThreeDay * 10;
        System.out.println("За 20 минут работы машины произвела бутылок " + bottlesPerOneThird + " штук");
        System.out.println("За сутки работы машины произвела бутылок " + bottlesPerDay + " штук")
        ;
        System.out.println("За 3 суток работы машины произвела бутылок " + bottlesPerThreeDay + " штук");
        System.out.println("За месяц работы машины произвела бутылок " + bottlesPerMonth + " штук");


    }
}
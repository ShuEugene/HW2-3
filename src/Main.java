public class Main {
    public static void main(String[] args) {

        byte b = 1;
        System.out.println();
        System.out.println("Значение переменной b с типом byte равно " + b + ".");
        short s = 2;
        System.out.println("Значение переменной s с типом short равно " + s + ".");
        int i = 3;
        System.out.println("Значение переменной i с типом int равно " + i + ".");
        long l = 4L;
        System.out.println("Значение переменной l с типом long равно " + l + ".");
        float f = 5f;
        System.out.println("Значение переменной f с типом float равно " + f + ".");
        double d = 6;
        System.out.println("Значение переменной d с типом double равно " + d + ".");

        /*
        float f1 = 27.12f;
        long l1 = 987678965549L;
        byte b1 = 2;
        short s1 = 786;
        boolean boo1 = false;
        short s2 = 569;
        short s3 = -159;
        int i1 = 27897;
        byte b2 = 67;
        */

        System.out.println();
        byte lpPupil = 23;
        byte asPupil = 27;
        byte eaPupil = 30;
        int pupilsNumber = lpPupil + asPupil + eaPupil;
        short sheetsOfPaperNumber = 480;
        System.out.println("Всего учеников: " + pupilsNumber);
        float sheetPerPupil = (float) (sheetsOfPaperNumber / pupilsNumber);
        System.out.println("На каждого ученика расчитано " + sheetPerPupil + " листов бумаги.");

        System.out.println();
        float productPerMinute = 16.0f / 2;
        int productPerHour = (int) (productPerMinute * 60);
        int productPerDay = productPerHour * 24;
        int productPerMonth = (int) (productPerDay * 30.5);
        System.out.println("Производительность машины по производству бутылок - "
                + (int) (productPerMinute) + " бутылок в минуту.");
        System.out.println("За 20 минут машина произвела "
                + (int) (productPerMinute * 20) + " бутылок.");
        System.out.println("За сутки машина произвела "
                + productPerDay + " бутылок.");
        System.out.println("За месяц машина произвела "
                + productPerMonth + " бутылок.");

        System.out.println();
        byte canOfPaint = 120;
        byte consumptionOfWhite = 2;
        byte consumptionOfBrown = 4;
        byte classNumber = (byte) (canOfPaint / (consumptionOfWhite + consumptionOfBrown));
        System.out.println("В школе, где " + classNumber + " классов, нужно "
                + classNumber * consumptionOfWhite + " банок белой и "
                + classNumber * consumptionOfBrown + " банок коричневой краски.");

        System.out.println();
        byte bananaWeight = 80;
        float milkWeight = (float) (105 / 100);
        byte icecreamWeight = 100;
        byte eggsWeight = 70;
        float breakfastWeight = (bananaWeight * 5 + milkWeight * 200 + icecreamWeight * 2
                + eggsWeight * 4) / 1000;
        System.out.println("Вес завтрака спортсмена - " + breakfastWeight + " кг.");

        System.out.println();
        short weightToLose = 7000;
        short weightLose1 = 250;
        short weightLose2 = 500;
        System.out.println("Чтобы \"сбросить\" " + (weightToLose / 1000)
                + " кг, спортсмену понадобиться " + (weightToLose / weightLose1) + " дней, " +
                "если он будет \"сбрасывать\" по 250 г в день, и "
                + (weightToLose / weightLose2) + " дней - если по 500.");
        short averageLose = (short) ((weightLose1 + weightLose2) / 2);
        byte dayToAverageLose = (byte) ((weightToLose / averageLose) -
                (weightToLose % averageLose));
        System.out.println("Если же он будет сбрасывать от " + weightLose1 + " до "
                + weightLose2 + " г в день, в среднем на \"сбрасывание\" веса уйдёт около "
                + dayToAverageLose + " дней (день/дня).");

        System.out.println();
        float marieInitialSalary = 67760f;
        float denInitialSalary = 83690f;
        float kristineInitialSalary = 76230f;
        byte salaryRisePercent = 10;
        float marieIncreaseSalary = marieInitialSalary + (marieInitialSalary * salaryRisePercent / 100);
        float denInsreaseSalary = denInitialSalary + (denInitialSalary * salaryRisePercent / 100);
        float kristineIncreaseSalary = kristineInitialSalary + (kristineInitialSalary * salaryRisePercent / 100);
        System.out.println("Маша теперь получает " + marieIncreaseSalary + " рублей."
        + " Годовой доход вырос на " + (marieIncreaseSalary * 12 - marieInitialSalary * 12) + " рублей.");
        System.out.println("Денис теперь получает " + denInsreaseSalary + " рублей."
        + " Годовой доход вырос на " + (denInsreaseSalary * 12 - denInitialSalary * 12) + " рублей.");
        System.out.println("Кристина теперь получает " + kristineIncreaseSalary + " рублей."
        + " Годовой доход вырос на " + (kristineIncreaseSalary * 12 - kristineInitialSalary * 12) + " рублей.");
    }
}
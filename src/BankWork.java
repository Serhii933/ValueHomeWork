import java.util.Random;

public class BankWork {
    private BankName[] bankNames;

    public BankWork(int numberOfBanks) {
        Random random = new Random();
        bankNames = new BankName[numberOfBanks];
        String[] bankNames = {
                "ПРИВАТБАНК", "СенсБанк", "Сітібанк", "БанкУкраїна",
                "Ощадбанк", "Укрексімбанк", "УКРГАЗБАНК", "РайффайзенБанк",
                "УКРСИББАНК", "ПУМБ", "КРЕДІАГРІКОЛЬ", "Південний",
                "КРЕДОБАНК", "БанкКредитДніпро"
        };
        for (int i = 0; i < numberOfBanks; i++) {
            double valueCourse = 35 + random.nextDouble() * 6;
            this.bankNames[i] = new BankName(bankNames[i], valueCourse);
        }
    }
    public void findBestValueCourse() {
        double maxValueCourse = 0;
        for (int i = 0; i < bankNames.length; i++) {
            if (bankNames[i].getExchangeRate() > maxValueCourse) {
                maxValueCourse = bankNames[i].getExchangeRate();
            }
        }

        System.out.println("Найвигідніший курс обміну: " + maxValueCourse);
        System.out.println("Банки з найвигіднішим курсом обміну:");

        for (int i = 0; i < bankNames.length; i++) {
            if (bankNames[i].getExchangeRate() == maxValueCourse) {
                System.out.println(bankNames[i].getName());
            }
        }
    }
}


public class BankName {
    private String name;
    private double valueCourse;

    public BankName(String name, double valueCourse) {
        this.name = name;
        this.valueCourse = valueCourse;
    }

    public String getName() {

        return name;
    }

    public double getExchangeRate() {
        return valueCourse;
    }
}


package homework.three;

public enum YearOfIssue {
    YEAR17 (2017),
    YEAR18 (2018),
    YEAR19 (2019),
    YEAR20 (2020),
    YEAR21 (2021),
    YEAR22 (2022),
    YEAR23 (2023);

    private int yearOfIssue;
    YearOfIssue(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }
    public int yearOfIssue() {
        return yearOfIssue;
    }


}

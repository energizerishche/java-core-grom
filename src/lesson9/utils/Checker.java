package lesson9.utils;

public class Checker {
    //public
    //private
    //default (package private)
    //protected

    private int companyNamesValidatedCount = 0;

    public boolean checkCompanyName(String companyName) {
        if (this.companyNamesValidatedCount > 10) {
            return false;
        }
        this.companyNamesValidatedCount++;

        return companyName != "Google" && companyName != "Amazon";
    }
}

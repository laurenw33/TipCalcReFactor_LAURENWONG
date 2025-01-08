public class TipCalculator {

    private double tipConversion = 0.01;
    private double tipDecimal;
    private double billAmount;
    private double totalTip;

    public double tipDecimal(double x) {
        tipDecimal = x * tipConversion;
        return tipDecimal;
    }

    public double billTotal(double billAmt) {
        billAmount = billAmt * (1 + (tipDecimal));
        return billAmt;
    }

    public double billTotalPP (int numPpl) {
        return billAmount * (1 + tipDecimal) / numPpl;
    }

    public double totalTip() {
        totalTip = billAmount * tipDecimal;
        return totalTip;
    }

    public double tipPP(int numPpl) {
        return totalTip / numPpl;
    }
}

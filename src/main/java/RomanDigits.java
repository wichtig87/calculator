public enum RomanDigits {
    I("I"),
    II("II"),
    III("III"),
    IV("IV"),
    V("V"),
    VI("VI"),
    VII("VII"),
    VIII("VIII"),
    IX("IX");
    private final String romanDigit;
    RomanDigits(String romanDigit){
        this.romanDigit = romanDigit;
    }
    public String getRomanDigit(){
        return romanDigit;
    }
}

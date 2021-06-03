public class GenericsMain {
    public static Integer compareIntegerMaximum(Integer firstNumber, Integer secondNumber, Integer thirdNumber){
        Integer maximumNumber = firstNumber;
        if(secondNumber.compareTo(maximumNumber)>0)
            maximumNumber = secondNumber;
        if(thirdNumber.compareTo(maximumNumber)>0)
            maximumNumber = thirdNumber;
        return maximumNumber;
    }
    public  static Float compareFloatMaximum(Float firstNumber, Float secondNumber, Float thirdNumber){
        Float maximumNumber = firstNumber;
        if(secondNumber.compareTo(maximumNumber)>0)
            maximumNumber = secondNumber;
        if(thirdNumber.compareTo(maximumNumber)>0)
            maximumNumber = thirdNumber;
        return maximumNumber;
    }
    public  static String compareStringMaximum(String firstWord, String secondWord, String thirdWord){
        String maximumNumber = firstWord;
        if(secondWord.compareTo(maximumNumber)>0)
            maximumNumber = secondWord;
        if(thirdWord.compareTo(maximumNumber)>0)
            maximumNumber = thirdWord;
        return maximumNumber;
    }
}

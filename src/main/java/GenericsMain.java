public class GenericsMain {
    public static Integer compareIntegerMaximum(Integer firstNumber, Integer secondNumber, Integer thirdNumber){
        Integer maximumNumber = firstNumber;
        if(secondNumber.compareTo(maximumNumber)>0)
            maximumNumber = secondNumber;
        if(thirdNumber.compareTo(maximumNumber)>0)
            maximumNumber = thirdNumber;
        return maximumNumber;
    }
}

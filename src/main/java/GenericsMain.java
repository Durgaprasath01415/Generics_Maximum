public class GenericsMain<E extends Comparable> {
    E first,second,third;

    public GenericsMain(E first, E second, E third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }
    public static <E extends Comparable> E compareMaximum(E firstNumber,E secondNumber,E thirdNumber){
        E maximumNumber = firstNumber;
        if(secondNumber.compareTo(maximumNumber)>0)
            maximumNumber = secondNumber;
        if(thirdNumber.compareTo(maximumNumber)>0)
            maximumNumber = thirdNumber;
        return maximumNumber;
    }
}

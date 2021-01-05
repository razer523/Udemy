public class Hello {

    public static void main(String[] args){
        System.out.println("Hello, Me, Myself, and I!");

        int myFirstNumber = (5 + 10) + (2*10);
        int mySecondNumber = 12;
        int myThirdNumber = myFirstNumber * 2;
        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;
        System.out.println("My total number is: " + myTotal);
        int myLastOne = 1000 - myTotal;
        System.out.println("My final number is: " + myLastOne);
    }
}
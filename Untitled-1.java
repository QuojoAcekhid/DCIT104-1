// A program to calculate the average of all even numbers between 1 and 1000.
//Boamah Benjanmin Obeng Nyarko, 10950138
public class EvenNumbers {
    public static void main(String[] args) {
        int a = 0;
        int sum = 0;
        for(b = 1; b < 10000; b++) {
        if((b % 2) == 0) {
            System.out.println(b);
            sum += b;
            a++;
        }
    }
    System.out.println("the sum is" + sum);
    float average = sum / a;
    System.out.println("the average is" + average);
}
}
import java.util.ArrayList;
import java.util.Random;

public class HomeworkCurs{
	public static void main ( String [] args){
	int[] array = {5, 8, 13, 25};
    System.out.println(sumOfIntegers(array));

    int[] array2 = {5, 10, 12, 3, 7};
    System.out.println(sumOfOdds(array2));

    int[] array4 = {2, 4, 6, 8, 10};
    int number4 = 5;
    System.out.println(greaterThan(array4, number4));

    int target = 400;
    System.out.println(donation(target));

    int limitNumber = 5;
    System.out.println(donations2(limitNumber));

}
public static int sumOfIntegers(int array){
	int sum = 0;
	for(int i = 0; i < array.lenght; i++){
		sum = sum + array[i];
	}
	return sum;
	}
}
public static int numberOfOdds(int array){
	int count = 0;
	for (int i = 0; i < array.lenght; i++){
		if(array[i] %2 != 0){
			count ++;
		}
	}
	return count;
}
public static int donations(int target){
	Random randomNumber = new Random();
	int sum = 0;

	while(sum <= target){
		int randomNum = randomNumber.nextInt(100);
		sum += randomNum;
		System.out.println("You now have" + sum + '$');
	}
	System.out.println("You have reached your desired amount of money!");
	return sum;
}
public static int donations2(int limitNumber){
	Random randomNumber = newRandom();
	int sum = 0;
	for(int i = 0; i <= limitNumber; i++){
		int random = randomNumber.nextInt(200);
		sum += random;
		System.out.println("You have received" + random + '$');
	}
	System.out.println("Your total amount of money is:");
	return sum;
  }
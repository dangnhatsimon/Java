public class Manipulate {
    
}


public class GuessingGame {
	public static void main(String[] args) {   
		int mystery1 = 8 + 6;
    int mystery2 = 8 - 6;
    System.out.println(mystery2);
	}
}

public class PlusAndMinus {
	public static void main(String[] args) {   
		int zebrasInZoo = 8;
    int giraffesInZoo = 4;
    int animalsInZoo = zebrasInZoo + giraffesInZoo;
    System.out.println(animalsInZoo);
    int numZebrasAfterTrade = zebrasInZoo - 2;
    System.out.println(numZebrasAfterTrade);
	};
}

public class MultAndDivide {
	public static void main(String[] args) {   
		double subtotal = 30;
    double tax = 0.0875;
    double total = subtotal + subtotal*tax;
    System.out.println(total);
    double perPerson = total /4;
    System.out.println(perPerson);
	}
}


public class Modulo {
	public static void main(String[] args) {   
		int students = 26;
    int leftOut = students%3;
    System.out.println(leftOut);
	}
}


public class BakeSale {
	public static void main(String[] args) {   
		int numCookies = 17;
    numCookies -= 3;
    numCookies /=2;

    // Add your code above
    System.out.println(numCookies);
	}
}


public class Operations {
	public static void main(String[] args) { 

    int expression1 = 5 % 2 - (4 * 2 - 1);
    System.out.println(expression1);

    int expression2 = (3 + (2 * 2 - 5)) + 6 - 5;
    System.out.println(expression2);

    int expression3 = 5 * 4 % 3 - 2 + 1;
    System.out.println(expression3);

	}
}

public class GreaterLessThan {
	public static void main(String[] args) {   
		double creditsEarned = 176.5;
    double creditsOfSeminar = 8;
    double creditsToGraduate = 180;
    System.out.print(creditsEarned > creditsToGraduate);
    double creditsAfterSeminar = creditsEarned + creditsOfSeminar;
    System.out.print(creditsAfterSeminar > creditsToGraduate);
	}
}

public class EqualNotEqual {
	public static void main(String[] args) {   
		int songsA = 9;
    int songsB = 9;
    int albumLengthA = 41;
    int albumLengthB = 53;
    boolean sameNumberOfSongs = songsA == songsB;
    boolean differentLength = albumLengthA != albumLengthB;
	}
}

public class GreaterThanEqualTo {
  	public static void main(String[] args){
      double recommendedWaterIntake = 8;
      double daysInChallenge = 30;
      double yourWaterIntake = 235.5;
      double totalRecommendedAmount = recommendedWaterIntake*daysInChallenge;
      boolean isChallengeComplete = yourWaterIntake >= totalRecommendedAmount;
      System.out.print(isChallengeComplete);
    }       
}


public class Song {
  	public static void main(String[] args){
      String line1 = "Nah nah nah nah nah nah nah nah nah yeah";
      String line2 = "Nah nah nah nah nah nah, nah nah nah, hey Jude";
      String line3 = "Nah nah nah nah nah nah, nah nah nah, hey Jude";
      System.out.println(line1.equals(line2));
      System.out.println(line3.equals(line2));
    }       
}

public class Zoo {
  	public static void main(String[] args){
      int animals = 12;
      String species = "zebra";
      String zooDescription = "Our zoo has " + animals +" " + species+"s!";
      System.out.println(zooDescription);
    }       
}


public class Final {
	public static void main(String[] args) { 
      final double pi = 3.14;
      System.out.println(pi);
      pi = 5;
		
	}
}

public class BankAccount {
  	public static void main(String[] args){
      double balance = 1000.75;
      double amountToWithdraw = 250;
      double updatedBalance = balance - amountToWithdraw;
      double amountForEachFriend  = updatedBalance / 3;
      boolean canPurchaseTicket = amountForEachFriend >= 250;
      System.out.println(canPurchaseTicket);
      System.out.println("I gave each friend " + amountForEachFriend+"...");
    }       
}



//I used german names for the variables
public class QuersummeBerechnen {
    public static void main(String[] args) {
		int quersumme = 0;
		int zahl = 555; //Choose a desired number 
		int hilfsVariable = zahl; 
		
        do {
			quersumme = quersumme + (hilfsVariable % 10);
			
			hilfsVariable = hilfsVariable / 10;
            
		} while (hilfsVariable != 0);
		System.out.println("Die Quersumme der Zahl " + zahl + " ist: " + quersumme);
	}
}
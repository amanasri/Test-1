import java.util.ArrayList;

public class CountryMain {

	public static void main(String[] args) {

		Countries countries = new Countries();

		ArrayList<String> indianStates = new ArrayList<>();
		indianStates.add("Kerala");
		indianStates.add("Odisha");
		indianStates.add("Bihar");

		ArrayList<String> usStates = new ArrayList<>();
		usStates.add("California");
		usStates.add("Washington");
		usStates.add("Georgia");

		countries.listingCountry("India", indianStates);
		countries.listingCountry("US", usStates);

		System.out.println("Calling getCountry Method with Valid Country");
		System.out.println(countries.getCountry("India"));

		System.out.println("\n Calling getCountry Method with Invalid Country");
		System.out.println(countries.getCountry("Maldives"));

		System.out.println("\n Calling listCountryBefore Method with Country India");
		countries.listCountryBefore("India");

		System.out.println("\n Calling listCountryAfter Method with Country US");
		countries.listCountryAfter("US");

	}
}
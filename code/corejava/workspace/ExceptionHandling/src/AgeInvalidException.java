public class AgeInvalidException extends Exception {
	public void showError() {
		System.err.println("You are not eligible.. Age Must be between 20-35..");
	}
}

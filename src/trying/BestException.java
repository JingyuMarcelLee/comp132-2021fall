package trying;

public class BestException extends Exception {

	public void printStackTrace() {
		System.out.println("ha ha im" + " not telling you what crashed");
	}

	public static void crash(int i) throws BestException {
		if(i < 4) {
			throw new BestException();
		}else {
			
		}
	}

	public static void main(String[] args) {

		try {
			crash(4);
		} catch (BestException e) {
			e.printStackTrace();
		}
	}
}

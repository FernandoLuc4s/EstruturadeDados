import java.util.Random;
public class Randomico {

	public static void main(String[] args) {
		Random rnd = new Random();

		for (int i = 0; i < 10; i++) {
			System.out.println(rnd.nextInt(10)); // acessa número aleatórios entre 0 e 10
		}
	}

}

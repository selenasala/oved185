package ssala.zoo;
//faccimo un test circa per ogni metodo: test ricco che valga almeno due istanze
//test sulla getId: crearti una cage, poi un altra cage e poi vedere se rispettano i risultati.
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CageTest {

	//ogni test case deve essere come isolato dal mondo
	@Test
	void idFirst() {
		Cage<Rhino> cage = new Cage<>(3);
		
	}

}

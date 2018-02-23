package pkgTest;

import static org.junit.Assert.*;

import org.junit.Test;

import pkgCasino.die;

public class dieTest {

	@Test
	public void TestDie() {

		for (int a = 0; a < 10000; a++) {
			die d = new die();

			if ((d.getDieValue() >= 1) && (d.getDieValue() <= 6)) {

			} else {
				fail("die value is out of range: " + d.getDieValue());
			}

		}

	}

}
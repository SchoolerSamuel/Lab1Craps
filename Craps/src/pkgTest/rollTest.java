package pkgTest;

import static org.junit.Assert.*;

import org.junit.Test;

import pkgCasino.die;
import pkgCasino.roll;

public class rollTest {

	@Test
	public void TestRoll() {

		for (int a = 0; a < 10000; a++) {
			roll r = new roll();

			if ((r.getScore() <= 12) || (r.getScore() >= 2)) {

			} else {
				fail("roll value is out of range: " + r.getScore());
			}

		}

	}

}
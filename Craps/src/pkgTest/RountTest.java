package pkgTest;

import pkgCasino.Round;
import pkgCasino.eGameResult;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RountTest {

	@Test
	void test() {

		for (int a = 0; a < 10000; a++) {
			Round r = new Round();

			if (r.isNatural(r.GetFirstRoll())) {
				assertEquals(eGameResult.NATURAL, r.geteGameResult());
			}

			if (Round.isCraps((r.GetFirstRoll()))) {
				assertEquals(eGameResult.CRAPS, r.geteGameResult());
			}

			if (r.RollCount() > 1) {
				if (r.GetFirstRoll() == r.GetLastRoll()) {
					assertEquals(eGameResult.POINT, r.geteGameResult());
				} else if (r.GetLastRoll() == 7) {
					assertEquals(eGameResult.SEVEN_OUT, r.geteGameResult());
				}
			}
		}

	}

}

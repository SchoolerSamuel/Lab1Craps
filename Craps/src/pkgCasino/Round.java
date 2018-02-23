package pkgCasino;

import java.util.LinkedList;

public class Round {

	private eGameResult eGameResult;
	private LinkedList<roll> rolls = new LinkedList<roll>();

	public Round() {
		// come out roll
		rolls.add(new roll());

		if (isNatural(rolls.getLast().getScore())) {
			eGameResult = eGameResult.NATURAL;
		}

		else if (isCraps(rolls.getLast().getScore())) {
			eGameResult = eGameResult.CRAPS;
		}

		else {
			do {

				rolls.add(new roll());

			} while (rolls.getLast().getScore() != 7 && (rolls.getLast().getScore() == rolls.getFirst().getScore()));

			if (rolls.getLast().getScore() == 7) {
				eGameResult = eGameResult.SEVEN_OUT;
			} else {
				eGameResult = eGameResult.POINT;
			}
		}
	}

	public int RollCount() {
		return rolls.size();
	}

	public boolean isNatural(int iScore) {
		return ((iScore == 7) || (iScore == 11));

	}

	public static boolean isCraps(int iScore) {
		return ((iScore == 2) || (iScore == 3) || (iScore == 12));
	}

	public eGameResult geteGameResult() {
		return eGameResult;
	}

	public int GetFirstRoll() {
		return rolls.getFirst().getScore();
	}

	public int GetLastRoll() {
		return rolls.getLast().getScore();
	}

}
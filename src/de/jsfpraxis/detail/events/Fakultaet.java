package de.jsfpraxis.detail.events;

import java.math.BigInteger;

public class Fakultaet {

	public static BigInteger fakultaet(BigInteger n) {
		if (n.equals(BigInteger.ONE)) {
			return n;
		} else {
			try {
				// damit es richtig lange dauert:
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// einfach ignorieren
			}
			return n.multiply(fakultaet(n.subtract(BigInteger.ONE)));
		}
	}

}

package de.jsfpraxis.detail.vc;

/**
 * Stellt eine Kreditkartennummer dar.
 * 
 * Um das Ganze etwas komplizierter zu machen, ist eine
 * Kreditkartennummer ein Quadrupel, wobei jedes Glied aus
 * vier Ziffern besteht und durch ein Leerzeichen vom
 * nächsten Glied getrennt ist.
 *
 */
public class Kreditkartennummer {

	private String[] quads;

	public Kreditkartennummer(String q1, String q2, String q3, String q4) {
		if (q1.length() != 4 || q2.length() != 4 || q3.length() != 4 || q4.length() != 4) {
			throw new IllegalArgumentException();
		}
		char[] chars = (q1 + q2 + q3 + q4).toCharArray();
		for (int i = 0; i < chars.length; i++) {
			if (chars[i] < '0' || chars[i] > '9') {
				throw new IllegalArgumentException();
			}
		}
		quads = new String[] { q1, q2, q3, q4 };
	}

	@Override
	public String toString() {
		return quads[0] + " " + quads[1] + " " + quads[2] + " " + quads[3];
	}

	
	
}

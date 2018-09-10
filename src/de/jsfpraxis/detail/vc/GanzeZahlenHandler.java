package de.jsfpraxis.detail.vc;

import java.math.BigInteger;
import java.util.logging.Logger;

public class GanzeZahlenHandler {
	
	private static Logger logger = Logger.getLogger("de.jsfpraxis.detail.vc.GanzeZahlenHandler");
	
	private Byte byteValue;
	private Short shortValue;
	private Integer intValue;
	private Long longValue;
	private BigInteger bigIntValue;
	
	public String abschicken() {
		logger.info("byteValue:     " + byteValue + "\n" 
				   	+ "shortValue:  " + shortValue + "\n" 
				   	+ "intValue:    " + intValue + "\n" 
				   	+ "longValue:   " + longValue + "\n" 
					+ "bigIntValue: " + bigIntValue);
		return "vc.xhtml";
	}

	
	// ab hier nur Getter und Setter
	public Byte getByteValue() {
		return byteValue;
	}

	public void setByteValue(Byte byteValue) {
		this.byteValue = byteValue;
	}
	
	public Integer getIntValue() {
		return intValue;
	}

	public void setIntValue(Integer intValue) {
		this.intValue = intValue;
	}

	public Long getLongValue() {
		return longValue;
	}

	public void setLongValue(Long longValue) {
		this.longValue = longValue;
	}

	public Short getShortValue() {
		return shortValue;
	}

	public void setShortValue(Short shortValue) {
		this.shortValue = shortValue;
	}


	public BigInteger getBigIntValue() {
		return bigIntValue;
	}


	public void setBigIntValue(BigInteger bigIntValue) {
		this.bigIntValue = bigIntValue;
	}


}

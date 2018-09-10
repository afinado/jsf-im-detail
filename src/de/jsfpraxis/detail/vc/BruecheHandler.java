package de.jsfpraxis.detail.vc;

import java.math.BigDecimal;

public class BruecheHandler {
	
	private Float floatValue;
	private Double doubleValue;
	private BigDecimal bigDecimalValue;
	
	public String abschicken() {
		return null;
	}
	
	public Float getFloatValueQuadrat() {
		if (floatValue == null)
			return (float) 0.0;
		return floatValue * floatValue;
	}
	
	public Double getDoubleValueQuadrat() {
		if (doubleValue == null)
			return 0.0;
		return doubleValue * doubleValue;
	}
	
	public BigDecimal getBigDecimalValueQuadrat() {
		if (bigDecimalValue == null) 
			return new BigDecimal(0);
		return bigDecimalValue.multiply(bigDecimalValue);
	}
	
	
	// ab hier nur Getter und Setter
	public BigDecimal getBigDecimalValue() {
		return bigDecimalValue;
	}

	public void setBigDecimalValue(BigDecimal bigDecimalValue) {
		this.bigDecimalValue = bigDecimalValue;
	}

	public Double getDoubleValue() {
		return doubleValue;
	}

	public void setDoubleValue(Double doubleValue) {
		this.doubleValue = doubleValue;
	}

	public Float getFloatValue() {
		return floatValue;
	}

	public void setFloatValue(Float floatValue) {
		this.floatValue = floatValue;
	}



}

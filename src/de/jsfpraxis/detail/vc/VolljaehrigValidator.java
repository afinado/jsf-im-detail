package de.jsfpraxis.detail.vc;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * Prüft, ob ein Datum länger als 18 Jahre her ist.
 *
 */
public class VolljaehrigValidator implements ConstraintValidator<Volljaehrig, Date> {

	@Override
	public void initialize(Volljaehrig constraintAnnotation) {
		// TODO Auto-generated method stub
	}

	
	@Override
	public boolean isValid(Date date,
			ConstraintValidatorContext constraintValidatorContext) {
		// heute
		Calendar cal = new GregorianCalendar();
		// heute vor 18 Jahren
		cal.add(Calendar.YEAR, -18);
		return date.before(cal.getTime());
	}

	
}

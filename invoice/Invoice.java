package invoice;

/**
 * Class to make invoices and apply IVA
 * @author Programador Bajeril
 *
 */
public class Invoice {
	private final double IVA = 1.21d;
	private final double REDUCED_IVA = 1.04d;
	private final double SPECIAL_OFFER = 0.10d;
	double total;
	double PRECIO_BASE;
	
	public Invoice (double precio) {
		PRECIO_BASE = precio;
	}
	
	/**
	 * Applies standard vat to the total and updates its value
	 */
	public void iva_21() {
		total = PRECIO_BASE * IVA;
	}

	/**
	  Applies reduced vat to the total and updates its value
	 */
	public void iva_04() {
		total = PRECIO_BASE * REDUCED_IVA;		
	}
	
	/**
	 * Applies a special VIP discount(fixed discount) to the invoice's total price
	 */
	public void descuento_VIP() {
		total = PRECIO_BASE - (PRECIO_BASE * SPECIAL_OFFER);
	}

	public double getTotal() {
		return total;
	}

}	
	
	
	
	


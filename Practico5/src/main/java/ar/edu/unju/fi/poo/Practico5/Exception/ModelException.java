package ar.edu.unju.fi.poo.Practico5.Exception;

public class ModelException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ModelException() {
		// TODO Auto-generated constructor stub
	}
	
	public ModelException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}
	public ModelException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}
	public ModelException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	public ModelException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
}

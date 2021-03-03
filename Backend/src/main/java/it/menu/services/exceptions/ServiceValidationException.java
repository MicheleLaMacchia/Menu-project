package it.menu.services.exceptions;

@SuppressWarnings("serial")
public class ServiceValidationException extends ServiceException
{
	public ServiceValidationException() {
		super();
	}

	/**
	 * @param message
	 */
	public ServiceValidationException(String message) {
		super(message);
	}

	/**
	 * @param code
	 * @param message
	 */
	public ServiceValidationException(Integer code, String message) {
		super(message);
		this.code = code;
	}

	/**
	 * @param message
	 * @param cause
	 */
	public ServiceValidationException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * @param cause
	 */
	public ServiceValidationException(Throwable cause) {
		super(cause);
	}
}
package up.edu.br.shoppingup.commom.exception;

public class BusinessException extends RuntimeException  {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final BusinessExceptionCode code;

	public BusinessException(BusinessExceptionCode code) {
		super(code.getMessage());
		this.code = code;
	}

	public BusinessExceptionCode getCode() {
		return code;
	}

}

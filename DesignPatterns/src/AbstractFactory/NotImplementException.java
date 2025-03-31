package AbstractFactory;

/*
 * 未实现异常类
 */
public class NotImplementException extends Exception {

	/**
	 * 序列化唯一标识
	 */
	private static final long serialVersionUID = 1L;

	public NotImplementException(String message) {

		super(message);
	}

}

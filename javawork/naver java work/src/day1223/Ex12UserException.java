package day1223;

//사용자 Exception 

class UserException extends Exception {

	public UserException(String message) {
		// TODO Auto-generated constructor stub
		super(message);
	}
}

public class Ex12UserException {

	public static void inputName(String name) throws UserException {

		if (name.equals("아이유")|| name.equals("에스파")) {
			throw new UserException("거짓이름을 말하고있네요 !");//Exception 강제 발생
		}
		else {
			System.out.println("내이름은"+name+"입니다.");
		}
	}


	///////////////////////////////////

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			inputName("성시경");
		}catch(UserException e) {
			System.out.println("오류메세지:"+e.getMessage());
		}
		try {
			inputName("김태희");
		}catch (UserException e) {
			// TODO: handle exception
			System.out.println("오류메세지:"+e.getMessage());
		}

	}

}


public class MemberService {
//	String id;
//	String password;
	
	public boolean login(String id, String password) {
//		this.id = id;
//		this.password = pw;
		if ((id.equals("hong") && (password.equals("12345")))) {
			return true;
		}else {
			return false;
		}
//		if ((this.id.equals("hong") && (this.password.equals("12345")))) {
//			return true;
//		}else {
//			return false;
//		}
	}
	
	public void logout(String id) {
		System.out.println("로그아웃 되었습니다.");
	}

}


public class MemServiceEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberService memServ = new MemberService();
		boolean result = memServ.login("hong", "12345");
		if(result) {
			System.out.println("로그인 되었습니다.");
			memServ.logout("hong");
		}else {
			System.out.println("id 또는 password가 올바르지 않습니다.");
		}
	}

}

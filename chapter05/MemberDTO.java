package chapter05;

//DTO: Data Transfer Object
//	DAO(CRUD)작업에 필요한데이터를
//	전송할때편리하게 정송하기 위한 가방역할
public class MemberDTO {
		// MemberDTO는 회원관련된 정보를 담을 수 있는 가방
		// DTO의 정속 가방 4가지 기능 !!
		// 1.가방의 포켓을 정의!(가방에 넣을수 있는 값을 정의)
		// 2.가방에 값을 담는 기능 (생성자, 오버로딩)
		// 3.값을 숨기는 기능(보안)
		// 4.가방에 담겨있는 값을 보여주는 기능 
	
		// 1)가방포켓을 정의(7칸)
		String id;
		String pw;
		int age;
		String name;
		String email;
		String phone;
		String address;
		
		// 2)가방에 담는 기능
		//   -디폴트 생성자
		public MemberDTO() {} 
		//	 -오버로딩 생성자

     	// 회원가입시 필요한 7개의 값을 담는 기능 
		public MemberDTO(String id, String pw, int age, String name, String email, String phone, String address) {//생성자 메서드
			super();
			this.id = id;
			this.pw = pw;
			this.age = age;
			this.name = name;
			this.email = email;
			this.phone = phone;
			this.address = address;
		}
		//회원수정시 필요한 6개의 값을 담는 기능
		public MemberDTO(String pw, int age, String name, String email, String phone, String address) {
			super();
			this.pw = pw;
			this.age = age;
			this.name = name;
			this.email = email;
			this.phone = phone;
			this.address = address;
		}
		//회원(이름)조회시 필요한 1개의 값을 담는 기능
		public MemberDTO(String name) {
			super();
			this.name = name;
		}
		
		public MemberDTO(String id, String pw) {
			super();				// this. 변수명 =>전역변수
			this.id = id;
			this.pw = pw;
		}
		
	
	
}//클래스

package day1220_2;


public class Apple {
	//상속가능
		public void job() {
			
			System.out.println("아침 식사를 준비합니다.");
		}
	//상속가능	
		protected void study() {
			System.out.println("자바 공부를 합니다.");
		}
	//void 디폴트는  패키지가 다르면 접근이 불가	
		void draw() {
			System.out.println("그림을 공부를 합니다.");
		}
	//상속가능	
		protected void process() {
			
			System.out.println("DB 공부를 합니다.");
			
		}
}
package day1219;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Sawon {
	/*
	 * 멤버 변수 사원명=> sawonName, 직급 => position ,가족수 => famSu 
	 * 
	 */
		private String sawonName; //사원명
		private String position; //직급
		private int famSu; //가족수
	
	
	/*
	 *디폴트 생성자 
	 *
	 *사원명,직급,가족수 를 인자로 받는 생성자
	 * 
	 */
		public Sawon() {

		}
		
		public Sawon(String sawonName, String position, int famSu) {
			
			this.sawonName = sawonName;
			this.position = position;
			this.famSu = famSu;
		}
	
	/*
	 * setter & getter metod 
	 * 
	 */
		
		public String getSawonName() {
			return sawonName;
		}


		public void setSawonName(String sawonName) {
			this.sawonName = sawonName;
		}


		public String getPosition() {
			return position;
		}


		public void setPosition(String position) {
			this.position = position;
		}


		public int getFamSu() {
			return famSu;
		}


		public void setFamSu(int famSu) {
			this.famSu = famSu;
		}
	
	
	
	/*
	 *  지급에 따라 gibonPay를 구하는데 부장->450 , 과장 -> 300 , 대리->250 , 사원 ->150
	 * getGibonPay()
	 */
		
		
		
	
	/*
	 * 직급에 따라 수당을 구하는데 부장,과장->70 ,  대리,사원->50
	 * getSudang()
	 */
	
	
	
	
	/*
	 * getGibonPay() 값을 반환받아서 세금 5프로를 구해서 반환하는
	 * getTax()
	 */
	
	
	
	/*
	 * 가족수가 5인 이상이면 30 반환, 5인미만은 2인이상은 10반환, 나머지는 0
	 * getFamSudang()
	 */
	
	
	/*
	 * 실수령액을 구해서 반환하는 메서드 기본급+수당-세금+가족수당을 구해서 반환
	 * getNetPay()
	 * 
	 */
}

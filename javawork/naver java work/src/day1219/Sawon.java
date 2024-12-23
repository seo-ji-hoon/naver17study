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
	 *  지급에 따라 기본급(gibon)을 구하는데 부장->450 , 과장 -> 300 , 대리->250 , 사원 ->150
	 * 	클래스명 => getGibonPay()
	 */

	public int getGibonPay() {
		
		int gibon=switch(position) {
		
			case "부장"->4500000;
			case "과장"->3000000;
			case "대리"->2500000;
			case "사원"->1500000;
			default->0;
		
		};
		
		return gibon;
	
	}

	/*
	 * 직급에 따라 수당(sudang)을 구하는데 부장,과장->70 ,  대리,사원->50
	 * 클래스명 => getSudang()
	 */
	
	public int getSudang() {

		int sudang=switch(position) {
		
			case "부장","과장"->700000;
			case "대리","사원"->500000;
			default -> 0;
		
		};
		return sudang;
	}


	/*
	 * getGibonPay() 값을 반환받아서 세금(tax) 5프로를 구해서 반환하는
	 * 클래스명 => getTax()
	 */

		public int getTax() {
			
			int tax=getGibonPay()*5/100; //세금 5프로에 대한 계산
			return tax;
			
		}
	/*
	 * 가족수(famsu)가 5인 이상이면 가족수당(famsudang) 30 반환,
	 * 5인미만은 2인이상은 가족수당(famsudang) 10반환, 나머지는 0
	 * 
	 * 클래스명 => getFamSudang()
	 */
		public int getFamSudang() {
			
			int famsudang=0;
			
			if(famSu>=5) {
				
				famsudang=300000;
			} 
			else if (famSu>=2) {
				
				famsudang=100000;
			}
			else {
				famsudang=0;
			}
			return famsudang;	
		}

	/*
	 * 실수령액을 구해서 반환하는 메서드 기본급+수당-세금+가족수당을 구해서 반환
	 * getNetPay()
	 * 
	 */
		
		public int getNetPay() {
			
			return getGibonPay()+getSudang()-getTax()+getFamSudang();
			
		}
}

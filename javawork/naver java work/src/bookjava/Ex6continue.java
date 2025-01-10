package bookjava;

public class Ex6continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i = 1; i <= 10; i++) {
            if (i % 3 == 0) {
                // 3의 배수인 경우에는 continue 문을 실행하여 현재 반복을 건너뜁니다.
                continue;
            }
            System.out.println(i); // 3의 배수를 제외한 숫자 출력
        }
	}

}

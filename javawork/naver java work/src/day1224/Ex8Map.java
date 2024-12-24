package day1224;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Ex8Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Map 타입은 key와 value의 쌍으로 데이터를 추가한다.
		//이때 key 값은 set 타입이다. 즉, 중복허용하지 않고 비순차적
		Map<String, String> map=new HashMap<String, String>(); // Map<인터페이스> 
		
		//map에 데이터 추가
		map.put("name","송혜교");
		map.put("age","34");
		map.put("blood","AB");
		map.put("name","김태희"); //뒤에 나오는 내용이 덮어쓰게된다.
		
		System.out.println("map 의 사이즈 : "+map.size());
		
		System.out.println("map 에서 key 값으로 value값 꺼내기");
		System.out.println("이름 : "+map.get("name"));
		System.out.println("나이 : "+map.get("age"));
		System.out.println("혈액형 : "+map.get("blood"));
		System.out.println("핸드폰 : "+map.get("hp")); //없을 경우 null 값 반환
		
		System.out.println();
		///////////////////////////////////////////////////////////////////////
		System.out.println("key 값들을 자동으로 얻은후 value 값들 얻기");
		
		Set<String> keySets=map.keySet();
		
		for(String key:keySets) {
			
			String v=map.get(key);
			System.out.println(key+"=>"+v);
		}
		
	}

}

package day1220_2;

public class DbServerSystem {
	//접근지정자 일단 default로 해보고 protected로도 수정해보자
	protected String dbServerName;
	int serverPort;
	
	//생성자 1
	public DbServerSystem() {
		
		dbServerName="Oracle";
		serverPort=8000;
		
	}
	
	//생성자 2
	public DbServerSystem(String dbServerName) {
		
		this.dbServerName=dbServerName;
		this.serverPort=8080;
	}
	
	//생성자 3
	public DbServerSystem(String dbServerName,int serverPort) {

		this.dbServerName=dbServerName;
		this.serverPort=serverPort;
	}
	
	public void serverStart() {
		
		System.out.println(serverPort+"Port 로"+dbServerName+"DB 세팅완료");
	}
	
	public void serverClose() {
		
		System.out.println(dbServerName+"DB Close 함");
	}

}

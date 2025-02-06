package work.data;

import java.sql.Timestamp;

public class WorkDto {
	
	private int idx;
	private String worktitle;
	private String worktxt;
	private String location;
	private String writeday;
	private int num;

	public WorkDto() {
		// TODO Auto-generated constructor stub
	}

	public WorkDto(int idx, String worktitle, String worktxt, String location, String writeday, int num) {
		super();
		this.idx = idx;
		this.worktitle = worktitle;
		this.worktxt = worktxt;
		this.location = location;
		this.writeday = writeday;
		this.num = num;
	}

	public int getIdx() {
		return idx;
	}

	public void setIdx(int idx) {
		this.idx = idx;
	}

	public String getWorktitle() {
		return worktitle;
	}

	public void setWorktitle(String worktitle) {
		this.worktitle = worktitle;
	}

	public String getWorktxt() {
		return worktxt;
	}

	public void setWorktxt(String worktxt) {
		this.worktxt = worktxt;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getWriteday() {
		return writeday;
	}

	public void setWriteday(String writeday) {
		this.writeday = writeday;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
}

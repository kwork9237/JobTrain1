package Board;

public class BoardDTO {
	private int BoardNum;
	private String Name;
	private String Contents;
	
	public int getBoardNum() {
		return BoardNum;
	}
	
	public void setBoardNum(int BoardNo) {
		BoardNum = BoardNo;
	}
	
	public String getName() {
		return Name;
	}
	
	public void updateName(String NewName) {
		Name = NewName;
	}
	
	public String getContents() {
		return Contents;
	}
	
	public void updateContents(String NewContents) {
		Contents = NewContents;
	}
}

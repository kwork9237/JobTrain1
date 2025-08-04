package Board;

import java.util.*;

public class Main {
	public static Scanner scan = new Scanner(System.in);
	public static List<BoardDTO> boardList = new ArrayList<>();
//	public static int boardCount = 1;
	
	// auto increment 삭제후 고유번호 입력방식으로 변경
	
	public static void main(String[] args) {
		while(true) {
			printMainMenu();
			switch(scan.nextInt()) {
				case 1:
					writeBoard();
					break;
				case 2:
					viewBoard();
					break;
				case 3:
					updateBoard();
					break;
				case 4:
					deleteBoard();
					break;
				case 99:
					return;
				default:
					System.out.println("1 ~ 4 사이의 숫자를 입력하세요.");
					System.out.println();
			}
		}
	}

	public static void printMainMenu() {
		System.out.println("	게시판	");
		System.out.println("1. 게시글 쓰기");
		System.out.println("2. 게시글 목록");
		System.out.println("3. 게시글 수정");
		System.out.println("4. 게시글 삭제");
		System.out.println("99. 종료하기");
	}

	public static void writeBoard() {
		BoardDTO board = new BoardDTO();
		int iTemp;
		
		System.out.println("게시글 고유번호를 입력해 주세요.");
		iTemp = scan.nextInt();
		
		//check for boardnum
		if(!checkBoardNum(iTemp)) {
			System.out.println("중복된 게시글 고유번호입니다.");
			return;
		}
		
		
		board.setBoardNum(iTemp);
		
		System.out.println("제목을 입력해 주세요.");
		board.updateName(scan.next());
		
		System.out.println("내용을 입력해 주세요.");
		board.updateContents(scan.next());
		
//		board.setBoardNum(boardCount++);
		
		boardList.addLast(board);
		System.out.println("게시글이 작성되었습니다.");
		System.out.println();
	}
	
	public static void viewBoard() {
		if(boardList.isEmpty()) {
			System.out.println("게시물이 없습니다.");
			System.out.println();
			return;
		}
		
		BoardDTO boardData;
		System.out.println("	게시글 목록		");
		
		for(int i = 0; i < boardList.size(); i++) {
			boardData = boardList.get(i);
			System.out.println(boardData.getBoardNum() + " : " + boardData.getName());
		}
		
		System.out.println("보고싶은 게시글 고유번호를 입력하세요.");
		boardData = selectBoard(scan.nextInt());
		if(boardData != null) {
			System.out.println("제목 : " + boardData.getName());
			System.out.println("내용 : " + boardData.getContents());
			System.out.println();
		}
		
		else {
			System.out.println("존재하지 않는 게시글입니다.");
			System.out.println();
		}
	}
	
	public static void updateBoard() {
		System.out.println("수정할 게시물의 고유번호를 입력해주세요.");
		BoardDTO board = selectBoard(scan.nextInt());
		
		if(board != null) {
			System.out.println("새로운 제목을 입력해 주세요.");
			board.updateName(scan.next());
			
			System.out.println("새로운 내용을 입력해 주세요.");
			board.updateContents(scan.next());
			
			System.out.println("게시물이 수정됐습니다.");
			System.out.println();
		}
	}

	public static void deleteBoard() {
		System.out.println("삭제할 게시물의 고유번호를 선택해주세요.");
		BoardDTO board = selectBoard(scan.nextInt());
		
		if(board != null) {
			System.out.println("게시물을 정말 삭제하시겠습니까? (Y/N)");
			
			while(true) {
				String temp = scan.nextLine();
				
				switch(temp.toUpperCase()) {
					case "Y":
						boardList.remove(board);
						System.out.println("게시글이 삭제되었습니다.");
						System.out.println();
						return;
					case "N":
						return;
						
					default:
						System.out.println("Y 또는 N 중에 입력하세요.");
				}
			}
		}
	}
	
	public static BoardDTO selectBoard(int boardNum) {
		BoardDTO boardData = null;
		
		try {
			if(boardNum >= 1) {
				for(int i = 0; i < boardList.size(); i++) {
					boardData = boardList.get(i);
					
					if(boardNum == boardData.getBoardNum())
						break;
				}
			}
			
			else {
				System.out.println("잘못된 번호입니다.");
				System.out.println();
			}
		}
		
		catch(Exception e) {
			System.out.println("숫자만 입력 가능합니다.");
			System.out.println();
		}
		
		return boardData;
	}
	
	public static Boolean checkBoardNum(int boardNum) {
		if(boardList.isEmpty()) {
			return false;
		}
		
		BoardDTO boardData = null;
		
		if(boardNum >= 1) {
			for(int i = 0; i < boardList.size(); i++) {
				boardData = boardList.get(i);
				
				if(boardNum == boardData.getBoardNum())
					return false;
			}
		}
		
		return false;
	}
}

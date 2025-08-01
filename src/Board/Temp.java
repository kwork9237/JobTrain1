package Board;

public class Temp {
	/*
	// Mainmenu select 1
	public static void viewBoard() {
		if(!boardList.isEmpty()) {
			// 게시글 목록 출력
			System.out.println("	게시글 목록		");

			for(int i = 0; i < boardList.size(); i++) {
				System.out.println((i + 1) + " : " + boardList.get(i).getName());
			}
			
			System.out.println("보고 싶은 게시글을 선택하세요.");
			int temp = scan.nextInt();
			if(boardList.size() >= temp && temp >= 1) {
				BoardDTO v = boardList.get(temp - 1);
				
				System.out.println("제목 : " + v.getName());
				System.out.println("내용 : " + v.getContents());
				System.out.println();
			}
			
			else {
				System.out.println("잘못된 번호입니다.");
				System.out.println();
				viewBoard();
			}
		}
		
		else {
			System.out.println("게시물이 없습니다.");
			System.out.println();
		}
	}

	// Mainmenu select 2
	public static void writeBoard() {
		BoardDTO board = new BoardDTO();
		
		System.out.println("제목을 입력해 주세요.");
		board.updateName(scan.next());
		
		System.out.println("내용을 입력해 주세요.");
		board.updateContents(scan.next());
		
		boardList.addLast(board);
		System.out.println("게시글이 작성되었습니다.");
		System.out.println();
	}

	// Mainmenu select 3
	public static void updateBoard() {
		BoardDTO board = selectBoard();
		
		if(board != null) {
			System.out.println("새로운 제목을 입력해 주세요.");
			board.updateName(scan.next());
			
			System.out.println("새로운 내용을 입력해 주세요.");
			board.updateContents(scan.next());
			
			System.out.println("게시물이 수정됐습니다.");
			System.out.println();
		}
	}

	// Mainmenu select 4
	public static void deleteBoard() {		
		BoardDTO board = selectBoard();
		String temp;
		
		if(board != null) {
			System.out.println("게시물을 정말 삭제하시겠습니까? (Y/N)");
			
			while(true) {
				temp = scan.nextLine();
				
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
	
	public static BoardDTO selectBoard() {
		if(!boardList.isEmpty()) {
			// 게시글 목록 출력
			System.out.println("	게시글 목록		");

			for(int i = 0; i < boardList.size(); i++) {
				System.out.println((i + 1) + " : " + boardList.get(i).getName());
			}
			
			System.out.println("수정/삭제할 게시물을 선택해주세요.");

			int temp = scan.nextInt();
			if(boardList.size() >= temp && temp >= 1) {
				System.out.println(temp + "번 게시물을 선택했습니다.");
				System.out.println("제목 : " + boardList.get(temp - 1).getName());
				System.out.println();
				return boardList.get(temp - 1);
			}
		}
		
		else {
			System.out.println("게시물이 없습니다.");
			System.out.println();
		}
		
		return null;
	}
	*/
}

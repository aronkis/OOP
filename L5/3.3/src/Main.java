public class Main {
    public static void main(String[] args) {
        TablaSah board = new TablaSah();
        
        Pawn whitePawn = new Pawn("white", 1, 1);
        board.PlacePiece("WP", 1, 1, 1, 1);  
        Rook whiteRook = new Rook("white", 0, 0);
        board.PlacePiece("WR", 0, 0, 0, 0);  
        Knight whiteKnight = new Knight("white", 0, 1);
        board.PlacePiece("WK", 0, 1, 0, 1);  
        Queen whiteQueen = new Queen("white", 3, 3);
        board.PlacePiece("WQ", 3, 3, 3, 3);  
        King whiteKing = new King("white", 4, 4);
        board.PlacePiece("WK", 4, 4, 4, 4);  

        System.out.println("Initial Board:");
        board.PrintBoard();

        System.out.println("\nMoving white pawn from (1,1) to (3,1):");
        if (whitePawn.IsValidMove(3, 1, board)) 
        {
            board.PlacePiece("WP", 1, 1, 3, 1); 
            board.PrintBoard();
        } 
        else 
        {
            System.out.println("Invalid move for white pawn.");
        }

        System.out.println("\nMoving white rook from (0,0) to (0,5):");
        if (whiteRook.IsValidMove(0, 5, board)) 
        {
            board.PlacePiece("WR", 0, 0, 0, 5); 
            board.PrintBoard();
        } 
        else 
        {
            System.out.println("Invalid move for white rook.");
        }

        System.out.println("\nMoving white knight from (0,1) to (2,2):");
        if (whiteKnight.IsValidMove(2, 2, board)) 
        {
            board.PlacePiece("WK", 0, 1, 2, 2);
            board.PrintBoard();
        } 
        else 
        {
            System.out.println("Invalid move for white knight.");
        }

        System.out.println("\nMoving white queen from (3,3) to (5,5):");
        if (whiteQueen.IsValidMove(5, 5, board)) 
        {
            board.PlacePiece("WQ", 3, 3, 5, 5);
            board.PrintBoard();
        } 
        else 
        {
            System.out.println("Invalid move for white queen.");
        }

        System.out.println("\nMoving white king from (4,4) to (5,5):");
        if (whiteKing.IsValidMove(5, 5, board)) 
        {
            board.PlacePiece("WK", 4, 4, 5, 5); 
            board.PrintBoard();
        } 
        
        else 
        {
            System.out.println("Invalid move for white king.");
        }
    }
}

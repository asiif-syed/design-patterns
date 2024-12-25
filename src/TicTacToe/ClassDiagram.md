# Tic-Tac-Toe
Requirements
- What is the size of the board? - nxn
- How many number of players? - n-1
- Each player has a symbol assigned
- What moves are illegal? - Can't place beyond the board size, can't place in a filled cell
- Can there be bots? - Yes
- What can be the difficulty of bot? - Easy, medium, hard
- Who will start the game? - Randomly
- How to decide the winner - Have to complete one row, one column, or one diagonal to win
- Can there be a draw? - No
- Is undo allowed? - Yes

## Class Diagram

```
class Game {
    Board board;
    List<Players> players;
    Player winner;
    WinningStrategy winningStategy;
    int currentPlayerIdx;
    List<Move> moves;
    GameState currentState;
}

enum GameState{
    IN_PROGRESS,
    COMPLETED,
    YET_TO_START
}
class Board{
    int size;
    List<Cell> grid;
}

class Move{
    Player player;
    Cell cell;
}
abstract Player{
    int id;
    String name;
    Symbol symbol;
    PlayerType playerType;
}
enum PlayerType{
    HUMAN_PLAYER;
    BOT_PLAYER
}
HumanPlayer extends Player{
    
}

BotPlayer extends Player{
    BotDifficulty botDifficulty;
}
enum BotDifficulty{
    EASY,
    MEDIUM,
    HARD
}
class Cell {
    int row;
    int col;
    Player player;
    CellState cellState;
}
enum CellState{
    FILLED,
    EMPTY
}
enum Symbol {
    CIRCLE,
    CROSS, 
}


```

## Design Patterns
- Builder pattern to configure the game with validations
- Strategy pattern for winning strategy and bot difficulty
- Factory design pattern to create players
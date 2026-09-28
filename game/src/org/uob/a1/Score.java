package org.uob.a1;


public class Score {
    private int roomsVisited;
    private int score;
    private int puzzlesSolved;
    private final int PUZZLE_VALUE = 10;

    public Score(int startingScore) {
        this.roomsVisited = 0;
        this.score = startingScore;
    }

    public void visitRoom() {
        this.roomsVisited = this.roomsVisited + 1;
    }

    public void solvePuzzle() {
        this.puzzlesSolved = this.puzzlesSolved + 1;
    }

    public double getScore() {
        return (score - roomsVisited + puzzlesSolved*PUZZLE_VALUE);
    }
}
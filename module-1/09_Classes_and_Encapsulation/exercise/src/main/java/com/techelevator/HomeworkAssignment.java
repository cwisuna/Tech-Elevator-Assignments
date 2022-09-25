package com.techelevator;

public class HomeworkAssignment {
    private int earnedMarks;
    private int possibleMarks;
    private String submitterName;


    public HomeworkAssignment(int possibleMarks, String submitterName) {
        this.possibleMarks = possibleMarks;
        this.submitterName = submitterName;
    }

    public int getEarnedMarks() {
        return this.earnedMarks;
    }

    public int getPossibleMarks() {
        return this.possibleMarks;
    }

    public String getSubmitterName() {
        return this.submitterName;
    }

    public void setEarnedMarks(int earnedMarks) {
        this.earnedMarks = earnedMarks;
    }

    public String getLetterGrade(){
        double percentage = (double) this.earnedMarks/this.possibleMarks;
        if(percentage >= 0.9){
            return "A";
        }else if(percentage >= 0.8){
            return "B";
        }else if(percentage >= 0.7) {
            return "C";
        }else if(percentage >= 0.6){
            return "D";
        } else {
            return "F";
        }
    }

}

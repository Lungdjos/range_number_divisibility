public class UserInput {
    // class attributes
    private final int startRange;
    private final int endRange;

    public UserInput(int startRange, int endRange) {
        this.startRange = startRange;
        this.endRange = endRange;
    }
    public UserInput() {
    }
    

    /**
     * @return int return the startRangeNumber
     */
    public int getStartRangeNumber() {
        return startRangeNumber;
    }

    

    /**
     * @return int return the endRangeNumber
     */
    public int getEndRangeNumber() {
        return endRangeNumber;
    }

    /**
     * @param endRangeNumber the endRangeNumber to set
     */
    public void setEndRangeNumber(int endRangeNumber) {
        this.endRangeNumber = endRangeNumber;
    }

}

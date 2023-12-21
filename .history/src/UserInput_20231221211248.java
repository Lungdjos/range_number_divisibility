public class UserInput {
    // class attributes
    private final int startRangeNumber;
    private final int endRangeNumber;

    public UserInput(int startRangeNumber, int endRange) {
        this.startRangeNumber = startRangeNumber;
        this.endRangeNumber = endRangeNumber;
    }

    /**
     * @return int return the startRangeNumber
     */
    public int getStartRangeNumber() {
        return startRangeNumber;
    }

    /**
     * @param startRangeNumber the startRangeNumber to set
     */
    public void setStartRangeNumber(int startRangeNumber) {
        this.startRangeNumber = startRangeNumber;
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

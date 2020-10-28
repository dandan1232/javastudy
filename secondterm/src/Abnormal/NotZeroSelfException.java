package Abnormal;

class NotZeroSelfException extends Exception{
    private int devidedNum;

    public int getDevidedNum() {
        return devidedNum;
    }

    public void setDevidedNum(int devidedNum) {
        this.devidedNum = devidedNum;
    }

    public NotZeroSelfException() {
    }

    public NotZeroSelfException(String message) {
        super(message);
    }
}

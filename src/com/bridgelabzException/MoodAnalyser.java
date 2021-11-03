package com.bridgelabzException;

public class MoodAnalyser {
    private String message;

    public MoodAnalyser(String message) throws MoodAnalyserException {
        this.message = message;
    }

    public MoodAnalyser() {

    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String analyseMood() throws MoodAnalyserException {
        try {
            if (message == "")
                throw new MoodAnalyserException("Entered Invalid Mood",
                        MoodAnalyserException.ExceptionType.ENTRY_IS_EMPTY);
            if (message.contains("Sad")) {
                return "SAD";
            } else
                return "HAPPY";
        } catch (NullPointerException e) {
            throw new MoodAnalyserException("Entered Invalid Mood",
                    MoodAnalyserException.ExceptionType.ENTRY_IS_NULL);
        }
    }
}
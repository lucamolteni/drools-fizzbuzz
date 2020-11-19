package org.kie.fizzbuzz;

public class FizzBuzzEvaluation implements Comparable<FizzBuzzEvaluation> {

    private int number;
    private String command;

    public FizzBuzzEvaluation(int number, String command) {
        this.number = number;
        this.command = command;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    @Override
    public int compareTo(FizzBuzzEvaluation o) {
        int compare = Integer.compare(o.getNumber(), this.number);
        if(compare == 0) {
            return o.getCommand().compareTo(this.getCommand());
        }
        return compare;
    }

    @Override
    public String toString() {
        return "{" +
                "number=" + number +
                ", command='" + command + '\'' +
                '}';
    }
}

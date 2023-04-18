package _11;

import java.math.BigInteger;

public class Main {
    private double x = Math.random() * 100;
    private String result = (x >= 50) ? "x is greater than or equal to 50" : "x is less than 50";
    private BigInteger grande;

    public Main() {};

    public Main(BigInteger grande) {
        this.grande = grande;
    }

    public BigInteger getGrande() {
        return grande;
    }

    public void setGrande(BigInteger grande) {
        this.grande = grande;
    }

    public void printResult() {
        System.out.println(result);
    }



}

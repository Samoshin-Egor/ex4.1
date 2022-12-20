package ex4_1_10;

public abstract class transport {
    protected double timeP;
    protected double priceP;
    protected double timeG;
    protected double priceG;
    public abstract double getTimeP();
    public abstract double getPriceP();
    public abstract double getTimeG();
    public abstract double getPriceG();
    public abstract void setTimeP(double timeP);
    public abstract void setPriceP(double priceP);
    public abstract void setTimeG(double timeG);
    public abstract void setPriceG(double priceG);
}

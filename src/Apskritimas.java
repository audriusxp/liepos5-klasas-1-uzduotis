public class Apskritimas {
   private double spindulys;

    public Apskritimas() {
    }

    public Apskritimas(double spindulys) {
        this.spindulys = spindulys;
    }
    public double skersmuo(){
    return spindulys/2 ;
    }
    public double plotas(){
        return skersmuo()*skersmuo()*Math.PI;
    }
    public double perimetras(){
        return 2*Math.PI*spindulys;
    }
    public double getSpindulys() {
        return spindulys;
    }

    public void setSpindulys(double spindulys) {
        this.spindulys = spindulys;
    }

    @Override
    public String toString() {
        return "Apskritimas{" +
                "spindulys=" + spindulys +
                '}';
    }
}


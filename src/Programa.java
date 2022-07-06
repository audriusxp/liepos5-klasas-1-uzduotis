public class Programa {

    public static void main(String[] args) {
       Apskritimas Aps1 = new Apskritimas(  4);
        System.out.println("Aps1 = " + Aps1);
        Aps1 =new Apskritimas(Aps1.skersmuo());
        System.out.println("Aps1 = " + Aps1);
       Aps1 = new Apskritimas(Aps1.perimetras());
        System.out.println("perimetras = " + Aps1);
        Aps1=new Apskritimas(Aps1.plotas());
        System.out.println("Aps1 = " + Aps1);
      
    }
}






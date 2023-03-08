public class aksisepeda {
    public static void main(String[] args){
        Sepeda sepedabalap = new Sepeda();
        Sepeda sepedatidakbalap = new Sepeda();

        sepedabalap.Sepeda(2, "BUtut", "Honda");
        sepedatidakbalap.Sepeda(4, "manuk", "United");
        int gearsepeda = sepedabalap.gear;
        System.out.println("Jumlah gear "+gearsepeda);
        sepedabalap.ngerem();

    }
    
}

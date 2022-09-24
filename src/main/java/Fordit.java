public class Fordit {
    String nev;
    String nyelv;

    public void fordit() {
        if(nyelv.equals("HUN")) {
            System.out.println("Szia " + nev);
        }
        if(nyelv.equals("ESP")) {
            System.out.println("Buenos dias " + nev);
        }
        if(nyelv.equals("JAP")) {
            System.out.println("Hikaroto okachihi " + nev);
        }
        else System.out.println("Szia " + nev);
    }
}

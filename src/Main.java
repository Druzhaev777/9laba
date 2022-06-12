public class Main {

    public static void main(String[] args) {

        Mag tint = new Mag("shop", 15, 9);
        pokypatel nnn = new pokypatel("tint", 150, 15, "Jams", "123");
        nnn.pokkk();
        pocupatel2 mmm=new pocupatel2("palto",1500,25,"Andrew","1434");
        mmm.pokkk2();
        pocupatel3 ppp=new pocupatel3("air",1000,5,"Soup","53647586");
        ppp.pok3();
    }
}
interface tovar{
    void tovarName();
    void price();
    void raiting();

}

class Mag implements tovar{
    String tea;
    int cena;
    int rait;
    Mag(String tea, int cena, int rait){
        this.tea=tea;
        this.cena=cena;
        this.rait=rait;
    }

    public void tovarName(){
        System.out.println(tea);
    }

    public void price(){
        System.out.println(cena);
    }


    public void raiting(){
        System.out.println(rait);
    }
}
class odejda implements tovar{
    String palto;
    int cena1;
    int raiti1;
    odejda( String palto,int cena1,int raiti1){
        this.palto=palto;
        this.cena1=cena1;
        this.raiti1=raiti1;
    }
    public void tovarName(){
        System.out.println(palto);
    }

    public void price(){
        System.out.println(cena1);
    }


    public void raiting(){
        System.out.println(raiti1);
    }
}
class Obuv implements tovar{
    String nike;
    int cena2;
    int raiti2;
    Obuv(String nike,int cena2,int raiti2){
        this.nike=nike;
        this.cena2=cena2;
        this.raiti2=raiti2;
    }
    public void tovarName(){
        System.out.println(nike);
    }

    public void price(){
        System.out.println(cena2);
    }


    public void raiting(){
        System.out.println(raiti2);
    }
}
interface userss{
    void loginn();
    void passs();
}

class pokypatel implements userss, tovar{
    String tea;
    int cena1;
    int rait1;
    String logg;
    String pass;

    pokypatel(String tea1, int cena1, int rait1, String logg, String pass){
        this.tea=tea1;
        this.cena1=cena1;
        this.rait1=rait1;
        this.logg=logg;
        this.pass=pass;
    }

    public void tovarName(){
        System.out.println(tea);
    }
    public void raiting(){
        System.out.println(rait1);
    }
    public void price(){
        System.out.println(cena1);
    }

    public void loginn(){
        System.out.println(logg);
    }
    public void passs(){
        System.out.println(pass);
    }
    public void pokkk(){
        System.out.println("User name: "+logg + " pokupaet " + tea);
    }
}
class pocupatel2 implements userss,tovar{
    String palto;
    int cena1;
    int raiti1;
    String logg;
    String pass;
    pocupatel2(String palto,int cena1,int raiti1,String logg,String pass){
        this.palto=palto;
        this.cena1=cena1;
        this.raiti1=raiti1;
        this.logg=logg;
        this.pass=pass;
    }
    public void tovarName(){
        System.out.println(palto);
    }

    public void price(){
        System.out.println(cena1);
    }


    public void raiting(){
        System.out.println(raiti1);
    }
    public void loginn(){
        System.out.println(logg);
    }
    public void passs(){
        System.out.println(pass);
    }
    public void pokkk2(){
        System.out.println("User name: "+logg + " pokupaet " + palto);
    }
}
class pocupatel3 implements userss,tovar{
    String nike;
    int cena2;
    int raiti2;
    String logg;
    String pass;
    pocupatel3(String nike, int cena2,int raiti2,String logg,String pass){
        this.nike=nike;
        this.cena2=cena2;
        this.raiti2=raiti2;
        this.logg=logg;
        this.pass=pass;
    }
    public void tovarName(){
        System.out.println(nike);
    }

    public void price(){
        System.out.println(cena2);
    }
    public void raiting(){
        System.out.println(raiti2);
    }
    public void loginn(){
        System.out.println(logg);
    }
    public void passs(){
        System.out.println(pass);
    }
    public void pok3(){
        System.out.println("User: "+logg + " pokupaet " + nike);
    }
}
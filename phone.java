package ex4_1_2;
public class phone {
    String number;
    String model;
    double weight;
   //phone(String m, String n,double w){
       /* number=n;
        model = m;*/
      /*  this(n,m);
        weight = w;
    }
    phone(String m, String n){
        model = m;
        number=n;
    }
    phone(){}*/

    public phone(String model, String number, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public phone(String model, String number) {
        this.number = number;
        this.model = model;
    }

    public phone() {
    }

    void receiveCall(String name){
     System.out.println("Звонит "+name);
    }
    void receiveCall(String name,String number){
        System.out.println("Звонит "+name+"номер "+number);
    }
    String getNumber(){
     return number;
    }

package ex4_1_2;
public class phone1 {
    public static void main(String[]args){
        phone myphone1 = new phone("Nokia","89774356612",1500.12);
        phone myphone2 = new phone("Samsung","89651541478");
        phone myphone3 = new phone();
        System.out.println("phone1: " + myphone1.model + ", " + myphone1.getNumber()+", "+myphone1.weight+" g");
      //  myphone2.weight=1290.00;
        System.out.println("phone2: " + myphone2.model + ", " + myphone2.getNumber()+", "+myphone2.weight+" g");
       /* myphone3.model="Honor";
        myphone3.number="89457777777";
        myphone3.weight=850.00;*/
        System.out.println("phone3: " + myphone3.model + ", " + myphone3.getNumber()+", "+myphone3.weight+" gramms");
        System.out.println();
      myphone1.receiveCall("Мама");
      myphone2.receiveCall("Братишка");
      myphone3.receiveCall("Любимка");
        myphone3.receiveCall("Любимка " ,"89456451122");
    }
}

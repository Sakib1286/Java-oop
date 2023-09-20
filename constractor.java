class Car{

String model;
int carNum;
int numWheel;

  public void getInfo() {
       System.out.println("The name of car is " + this.model);
       System.out.println("The num of car is " + this.carNum);
   }
public void getInfo2() {
       System.out.println("The  name of car is " + this.model);
       System.out.println("The num of car is " + this.carNum);
        System.out.println("The num of wheel is " + this.numWheel);
   }
//Non-peramiterize constractor
 /*Car() {
       System.out.println("I am form non peramiter ");
   } */
//peramiterize constractor
Car (String model , int carNum){
    this.model= model;
    this.carNum= carNum;
}
//copy constractor
Car (Car car2){
    this.model= car2.model;
    this.carNum= car2.carNum;
    this.numWheel= car2.numWheel;
}
//for copy constractor we need a non-peramitar constractor
Car() {
    
}
}
public class constractor {
    public static void main(String[] args) throws Exception {
    Car car0 = new Car();
        car0.model= "toyota";
        car0.carNum= 1012;
         car0.getInfo();
         //premitarize constractor
        Car car1 = new Car("BMW", 1234);
        car1.getInfo();
        //copy constractor
        Car car2 = new Car();
     car2.model= "mazda";
         car2.carNum= 334; 
         car2.numWheel = 3;
        Car car3 = new Car(car2);
           car3.getInfo2();
}
}
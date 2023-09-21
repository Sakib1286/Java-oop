class Car{

String model;
int carNum;
int numofGear;

 //first pholimorphism
public void printCarInfo(String model){
 System.out.println("This car name model is :  "+model+"\n");
}
//Second  pholimorphism
public void printCarInfo(String model, int carNum){
 System.out.println("This car name model is :  "+model+ "\n This car Number is: "+carNum+"\n");
}


 //Third pholimorphism
public void printCarInfo(String model, int carNum,int numofGear){
 System.out.println("This car name model is :  "+model+ "\n This car Number is: "+carNum);
 System.out.println("This are made with Gear of: "+numofGear);
}
}
//main class
public class polimorphism {
    public static void main(String[] args) throws Exception {
     
        Car car1= new Car();
        car1.model = "Lamborghini-Evo";
        car1.carNum= 2233;
        car1.numofGear = 6;
        //first pholimorphism print
        car1.printCarInfo(car1.model);
        //Second  pholimorphism print
        car1.printCarInfo(car1.model,car1.carNum);
        //Third pholimorphism print
        //sakib
        car1.printCarInfo(car1.model,car1.carNum, car1.numofGear);
    }
}
//done

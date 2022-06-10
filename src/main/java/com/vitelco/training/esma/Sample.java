package com.vitelco.training.esma;

import com.vitelco.training.model.*;
import com.vitelco.training.model.Math;

public class Sample {

    public  void myMethod2(){
        // create two object of two type Car
        Car porsche1 = new Car();
        porsche1.color = "RED";
        porsche1.model = "Cayman GT4 RS";

        Car porsche2 = new Car();
        porsche2.color = "BLUE";
        porsche2.model = "Cayman GT4 RS";

        //porsche1.start();

        porsche1.drive(200); //kodun yazarken (speed:200) argüman
        porsche2.drive(250);

    }


/*
    public void myMethod1(){
        Math math = new Math();
        int result = math.timeThree(6);
        System.out.println(result);

        math.showResult();
    }

    void myMethod(){
        //variable Declaration
        Customer customer;

        //create object(Object instantiation)
        customer = new Customer();

        //variable allocation
        customer.firstName = "Esma";
        customer.lastName = "Koc";
        customer.age = 23;
    }
*/

/*


    void myMethod1 (){

        //variable Declaration
        Triangle t;
        t = new Triangle(); // object is an instance of a class

        int i;
        long j;
    }

package
import
class   = Sample
method  = myMethod
object  = t
variable= t, i, j
dot     = .
semicolon=
*/



}

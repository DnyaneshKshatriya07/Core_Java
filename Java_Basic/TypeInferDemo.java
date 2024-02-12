//Type inference using var

import java.util.ArrayList;

public class TypeInferDemo {

    //static var counter;    //not allowed, cannot use var in a field.

	/*static void printFunction(var printLine)  // not allowed, cannot use as a parameter
	{

	}
	*/

	/*static var getNumberofRecords()  // cannot return var type from method
	{
		return true;
	}*/

    public static void main(String[] args) {

        var a = 2.0;
        var b = 1;
        var c = "java programming";

        //var testValues = {2.33,15.21,18.10,1,"test value"};  //not allowed in array initializer
        double[] testValue = {2.33,15.33,17.99,1};

        //var initValue; // without initial value
        //var total = null; // cannot infer type

        for(var i : testValue)  //replace double with var
        {
            System.out.println(i);
        }

        var myarrList = new ArrayList<String>();



        var myarrLst = new ArrayList<String>();





    }

}

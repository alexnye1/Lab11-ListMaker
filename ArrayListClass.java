

import java.util.ArrayList; // required for using
import java.util.Scanner;

public class ArrayListClass {

    public static void main(String[] args) {

        String str;
        Scanner sc = new Scanner(System.in);

        ArrayList<String> myArrList = new ArrayList<>();


        System.out.println("Enter list of names one per line(\"Quit\" to exit): ");
        str = sc.nextLine();


        while(!str.equalsIgnoreCase("quit"))
        {

            if(str.length() > 0)
            {
                myArrList.add(str);
            }

            str = sc.nextLine();
        }

        System.out.println("You entered "+myArrList.size()+" names:");
        System.out.println(myArrList.toString());
    }

}


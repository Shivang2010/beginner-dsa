package com.shivang;
import java.util.*;
public class Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.next();
        switch (fruit) {
            case "mango":
                System.out.println("KING OF THE FRUIT");
                break;
            case "apple":
                System.out.println("AN APPLE A DAY KEEPS DOCTOR AWAY");
                break;
            case "orange":
                System.out.println("ORANGE IN COLOR");
                break;
            default:
                System.out.println("enter valid fruit");
        }
    }
}

// import java.util.*;    }
//   public class Switch{
//       public static void main(String[] args) {
//           Scanner in = new Scanner (System.in);
//           String fruit = in.next();
//           if (fruit.equals("mango")) {
//               System.out.println("king of fruit");
//           } else if (fruit.equals("apple")) {
//               System.out.println(" an apple a day keeps doctor away");
//           } else if (fruit.equals("orange")) {
//               System.out.println("round in shape");
//           } else {
//               System.out.println("invalid ");
//           }
//       }
//   }
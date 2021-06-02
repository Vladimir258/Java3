package ru.geekbrains;

public class Lesson1 {
    public static void l1() {
        printMe pMe = new printMe();

        Integer[] array1 = {1, 2, 3, 4, 5, 6, 7};
        String[] array2 = {"T", "O", "K"} ;

        System.out.println();
        System.out.println("============================================== Задани 1");
        ArrayOperation.swapElementArray(array1,1,4);
        System.out.println();
        ArrayOperation.swapElementArray(array2,0,2);

        System.out.println();
        System.out.println("============================================== Задани 2");
        ArrayOperation.arrayToList(array1);
        ArrayOperation.arrayToList(array2);

        System.out.println();
        System.out.println("============================================== Задани 3");

        Box<Orange> orangeBox1 = new Box<>();
        Box<Orange> orangeBox2 = new Box<>();
        Box<Apple> appleBox1 = new Box<>();
        Box<Apple> appleBox2 = new Box<>();

        orangeBox1.addFruit(new Orange(),12);
        orangeBox2.addFruit(new Orange(),10);
        appleBox1.addFruit(new Apple(),8);
        appleBox2.addFruit(new Apple(),15);

        pMe.printText(orangeBox1,2,1);
        pMe.printText(orangeBox2,2,2);
        pMe.printText(appleBox1,2,3);
        pMe.printText(appleBox2,2,4);

        System.out.println();
        System.out.println("Box 1 equals Box 3: " + orangeBox1.compare(appleBox1));
        System.out.println("Box 2 equals Box 4: " + orangeBox2.compare(appleBox2));
        System.out.println("Box 1 equals Box 2: " + orangeBox2.compare(orangeBox1));
        System.out.println();
        System.out.println("Pour it over Box1 in Box2 and Box3 in Box4: ");
        orangeBox1.pourOver(orangeBox2);
        appleBox1.pourOver(appleBox2);
        pMe.printText(orangeBox1,1,1);
        pMe.printText(orangeBox2,1,2);
        pMe.printText(appleBox1,1,3);
        pMe.printText(appleBox2,1,4);
    }
    static class printMe {
        public void printText(Box box,int whoPrint, int numberBox){
            switch(whoPrint) {
                case 1:
                    System.out.println(("Box " + numberBox + ": " + box.getWeight()));
                    break;
                case 2:
                    System.out.println(("Weight Box " + numberBox + " with " + box.getInfo() + " : " + box.getWeight()));
                    break;
                default:
                    System.out.println("");
                    break;
            }
        }
    }
}

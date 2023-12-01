public class Main {
    public static void main(String[] args) {

                         // МАССИВЫ:

       /* int size = 10;
        int [] array = new int[size];

        System.out.println(array.length);

        size = 20;

        System.out.println(array.length); */

        //int [] array = new int[]{1,2,3,4,5};
        //int [] array = {1,2,3,4,5}; - можно упростить заполнение таким образом

        //System.out.println(array.length);

        /*int [] array = new int[5];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        array[4] = 5;

        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);*/


        /*int [] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }*/

        int [] array = new int[10];                //Заполнение массива случайными числами (точка Math)
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random()*100);
        }

        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }




    }
}
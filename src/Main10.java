public class Main10 {
    public static void main(String args[]) {
        int value = 65;
        int[] myArray = {41, 52, 63, 74, 85, 96 };
        System.out.println("Элементы массива, которые меньше заданного значения, являются::");
        for(int i = 0; i<myArray.length; i++) {
            if(value>=myArray[i]) {
                System.out.println("Индекс ::"+i+" Элемент::"+myArray[i]);
            }
        }
    }
}

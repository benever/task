package Main;

public class Main {
    public static void main(String[] args) {
        int[] array = {4,5,6,7,8,9,1,2,3};
        System.out.println(min(array));
    }
    public static int min(int[] array){
        int minNum = 0;
        if(array[0]<array[array.length-1]){
            minNum = array[0];
        }
        else{

            int comparativeNumber = array[0];
            int index = array.length/2;
            while (true) {
                if (array[index] > comparativeNumber) {
                    comparativeNumber = array[index];
                    index += (array.length-index)/2;
                }
                else{
                    if(array[index]<array[index-1]){
                        minNum = array[index];
                        break;
                    }
                    else{
                        index -= index/2;
                    }
                }

            }
        }
        return minNum;
    }
}
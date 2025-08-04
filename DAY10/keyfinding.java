package DAY10;
public class keyfinding{
        public static int linerSearch(int numbers[], int key){
            for(int i =0;i<numbers.length;i++){
                if(numbers[i]==key){
                    return i;
                }
            }
            return -1;
        }
        public static void main(String[] args){
        int numbers[] = {1,2,3,4,5,10,6,7,8,9};
        int key = 10;
        int index = linerSearch(numbers, key);
        if(index==-1){
            System.out.println("NOT found");
        }
        else{
        System.out.println("Key is at index : " + index);
        }

    }
}
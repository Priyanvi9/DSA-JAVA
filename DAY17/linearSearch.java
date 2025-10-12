package DAY17;
public class linearSearch {
    public static void main(String[] args) {
        linearSearch ls = new linearSearch();
        ls.search();
    }
    int key = 10;
    int arr[] = {2,4,6,8,10,12,14,16};
    boolean flag = false;
    public void search(){
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == key){
                System.out.println("Key found at index " + i);
                flag = true;
                break;
            }
        }
        if(flag == false){
            System.out.println("Key not found");
        }
    }
}

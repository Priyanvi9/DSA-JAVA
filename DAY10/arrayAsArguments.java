package DAY10;

public class arrayAsArguments{
    public static void update(int marks[]){
        for(int i  = 0;i<marks.length;i++){
            marks[i]+=1;
        }
    }
    public static void main(String[] args) {
        int marks[] = {10,11,12,13};
        update(marks);
        for(int i =0;i<marks.length;i++){
            System.out.print(marks[i] + " ");
        }
        System.out.println();
    }
}
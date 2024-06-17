package oop_6;

class oop6_20 {

    public static int max(int[] arr){

        if(arr==null||(arr.length==0)){
            return -9999999;
        }
        int max_num=arr[0];
        for (int i=0;i<arr.length;i++){
            if(arr[i]>max_num){
                max_num=arr[i];
            }
            else{
                continue;
            }
        }
        return max_num;
    }

    public static void main(String[] args) {
        int[] data={3,2,9,4,7};
        System.out.println(java.util.Arrays.toString(data));
        System.out.println("최대값:"+max(data));
        System.out.println("최대값:"+max(null));
        System.out.println("최대값:"+max(new int[] {}));
    }
}

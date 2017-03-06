public class InserstionSort {
                                                                                                  
    public static int[] Sort(int[] list) {

        int i, j, key, temp;

        for (i = 1; i < list.length; i++) {
            key = list[i];
            j = i - 1;
            while (j >= 0 && key < list[j]) {
                temp = list[j];
                list[j] = list[j + 1];
                list[j + 1] = temp;
                j--;

            }
        }


        return list;
    }

    public static void main(String[] args) {

        int []list = {2, 5, 1, 8, 12, 3, 7};
        Sort(list);

        for (int i =0; i < list.length;i ++) {
            System.out.print(list[i]+" ");
        }


    }
}

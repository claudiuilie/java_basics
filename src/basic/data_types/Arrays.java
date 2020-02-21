package basic.data_types;

public class Arrays {
    public static void main(String [] args){
        int[] values = {1,2,3,4,5};
        String[] strings = {"first","second","last" };

        int[][] array2D = {
                {1,2,3},
                {4,5,6}
        };
        int[][][] array3D = {
                {
                        {1, -2, 3},
                        {2, 3, 4}
                },
                {
                        {-4, -5, 6, 9},
                        {1},
                        {2, 3}
                }
        };

        System.out.println(values[1]);
        System.out.println(array2D[0][0]);
    }
}

public class pattern_8
{
    public static void main(String args[])
    {
        int c = 0, count = 0, i = 2, j;
        int arr[] = new int [11];
        int pos = 0;
        while(count <= 10)
        {
            for(j = 1; j <= i; j++)
            {
                if(i % j == 0)
                {
                    c += 1;
                }
            }
            if(c == 2)
            {
                arr[pos] = i;
                pos++;
                count++;
            }
            i = i + 1;
            c = 0;
        }
        int k = 0, s = 3, l;
        for (i = 1; i <= 4; i++) {
            for(l = 1; l <= s; l++){
                System.out.print("    ");
            }
            s--;
            for (j = 1; j <= i; j++) {
                System.out.print(arr[k]+ "  ");
                k++;
            }
            System.out.println();
        }
    }
}
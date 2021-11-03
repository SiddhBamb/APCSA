public class test1{
public static void main(String[] args)
{
int[] arrNums = {3, 10, 11, 7, 5, 0, 6, 9, 4, 1, 2};
int sum = 0;
int i = 0;
while (i < arrNums.length) {
  sum += arrNums[i];
  i = arrNums[i];
}
System.out.println("Sum: " + sum);
}
}
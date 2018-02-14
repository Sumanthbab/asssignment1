class ma{
  public static void main(string args[])
  {
     int arr1[]=new int[100000];
     int arr2[]=new int[100000];
                                //array input can be added here
     n1 = arr1.length;
     n2 = arr2.length;
     mergeArrays(int[] arr1, int[] arr2, int n1,int n2);
  }
  public static void mergeArrays(int[] arr1, int[] arr2, int n1,int n2)
  {
   int i = 0, j = 0, k = 0;
   int arr3[]=new int[];
   while (i<n1 && j <n2)
   {
     if (arr1[i] < arr2[j])
       arr3[k++] = arr1[i++];
     else
      arr3[k++] = arr2[j++];
   }
    while (i < n1)
      arr3[k++] = arr1[i++];
    while (j < n2)
      arr3[k++] = arr2[j++];
  }
}

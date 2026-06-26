//design a program to remove duplicate from and array without using collection 

//program to group by employee objects according to their age by using map


class RemoveDuplicate {
public static int removeDuplicates(int arr[]) {
 int n = arr.length;
if (n == 0 || n == 1){
   return n;
}
   int j = 0;

 for (int i = 0; i < n - 1; i++) {

  if (arr[i] != arr[i + 1]) {
     arr[j] = arr[i];
    j++;
            }
        }

   arr[j] = arr[n - 1];

    return j + 1;
    }

 public static void main(String[] args) {

    int arr[] = {1, 1, 2, 2, 3, 4, 4, 5};

  int size = removeDuplicates(arr);

     for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
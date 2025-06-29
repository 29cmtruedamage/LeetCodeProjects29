package JavaCode;

public class searchInsert {
    // #35 -> search Insert Problem

    static int searchInsert(int[] nums, int target){

        int s = 0                           ;
        int e = nums.length - 1             ;
        int m = (s + e) / 2                 ;

        while ( s <= e)                     {
            if(nums[m] == target)           {
                return m;
                                            }
            if(nums[m] > target)            {
                e = m - 1                   ;
                m = (s + e) / 2             ;
                                            }
            if(nums[m] < target)            {
                s = m + 1                   ;
                m = (s + e) / 2             ;
                                            }}

        if(nums[m] < target)                {
            return m + 1                    ;}
        else                                {
            return m                        ;
                                            }}





    public static void main(String[] args){
        int[] arr1 = {1, 3, 5, 6};
        int[] arr2 = {1, 3, 5, 6};
        int[] arr3 = {1, 3, 5, 6};
        int[] arr4 = {1, 3, 5, 6};

        System.out.println(searchInsert(arr1, 5));  // Ausgabe: 2 (gefunden)
        System.out.println(searchInsert(arr2, 2));  // Ausgabe: 1 (zwischen 1 und 3)
        System.out.println(searchInsert(arr3, 7));  // Ausgabe: 4 (am Ende einfügen)
        System.out.println(searchInsert(arr4, 0));  // Ausgabe: 0 (am Anfang einfügen)
    }
}

class Q3 {

    static int reverseDigits(int num)
    {
        int rev_num = 0;
        while (num > 0) {
            rev_num = rev_num * 10 + num % 10;
            num = num / 10;
        }
        return rev_num;
    }

    public static void main(String[] args)
    {
        int num = 1234;
        System.out.println("Reverse is = "
                           + reverseDigits(num));
    }
}
//Time Complexity: O(log(n)), where n is the input number. 
//Auxiliary Space: O(1)
c class FizzBuzz {

    public static void main(String[] args) {
            // count from 1 to 100 (loop?)
            // check if divisible by 3 -- print Fizz
            // check if divisible by 5 -- print Buzz

        for(int i = 0; i <= 100; i++){
            if ((i % 3 == 0) && (i % 5 == 0)){
            System.out.println("FizzBuzz");
            }else if(i % 3 == 0){
                System.out.println("Fizz");
            }else if (i % 5 == 0){
                System.out.println("Buzz");

            }
//            System.out.println(i);
        }

    }

}


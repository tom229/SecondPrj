class FirstJavaProgram
{
    public static void main(String[] args)
    {
//        System.out.println("Welcome to Java");
//        System.out.println("First Java program");
//        System.out.println("2+5= " + (2 + 5));
        
        /* 1부터 100까지 수 중에서 짝수 합과 홀수합을 모두 출력한다.
         * 짝수의 합은 evenSum에 담아 출력한다
         * 홀수의 합은 oddSum에 담아 출력한다
         * 
         */
    	
    	int evenSum = 0;
    	int oddSum = 0;
    	int num=1;
    	
    	while(num<=100) {
    		if(num%2==0) {
    			evenSum += num;
    		}
    		if(num%2==1) {
    			oddSum += num;
    		}
    		num++;
    	}
    	System.out.println("홀수의 합은 : " + evenSum);
    	System.out.println("짝수의 합은 : " + oddSum);
    	
    	   	
    	
    	
    	
    	
    }
}

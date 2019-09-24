 Scanner input = new Scanner(System.in);
        //in psedocode : Declare a As Integer
        int a ;
          //in psedocode : Declare b As Integer
        int b ;
        //in psedocode : Write "Please enter the first value"
        System.out.println("Please enter the first value");
        a = input.nextInt();
        System.out.println("Please enter the second value");
        
        b = input.nextInt();
        
        int sum = a + b;
        System.out.println("The sum of " + a + " and " + b +" is " +sum);
    }

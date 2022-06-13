package com.company;

public class Loops {

    static void loops(){
        int[] example_arrey = {4,2,4,5,34,123,424,123,445};
        int spookyNumber = 1;

        //for loop - first need var declaration, second need condition , third need to know how to react

        for(int i=0;i<100;i++){
            System.out.println("FOR LOOP TEST: "+i);
        }


        // FOR EACH LOOP - first need var declaration, second need sth to go through
        for (int i:example_arrey) {
            System.out.println("FOREACH LOOP TEST: "+i);
        }

        //WHILE LOOP - first condition when it's passed it will run loop once.
        while (spookyNumber<=10){
            spookyNumber+=1;
            System.out.println("WHILE LOOP TEST (spookyNumber value): "+spookyNumber);
        }

        // DO WHILE LOOP
        do{
            System.out.println("LOOP IN PROGRESS");
            spookyNumber++;
        }
        while (spookyNumber<100);
            System.out.println("END OF DO_WHILE LOOP");


        // INFINITE LOOP (uncomment to test)

       /* for(;;){
            System.out.println("I will go forever (or when you run out of memory)");
        }*/



        // NESTED LOOPS

        //outer loop
        for( int i = 1 ; i <= 10 ; ++i)
        {
            System.out.println();
            //inner loop
            for( int j = 1 ; j <= i ; ++j)
                System.out.print( "* " );

        }

    }
}

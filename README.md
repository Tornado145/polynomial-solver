# polynomial-solver
READ THIS IN THE RAW FORMAT
Varun:    
    The class is a bit complicated.
    I see what you're getting at with the String polynomial, but I'm not sure how you plan to break it up into the coefficients for each        degree.
    Also, I'd like to know what the highest degree will be for this solver before we get on with it. Are we going to do something like       this?(Given String polynomial and int[] coefficients) (Obviously not refined): 
    
    
    while(polynomial.indexOf("^") != -1) {
        
        int index = 0;
        coefficient[ ] = Integer.parseInt(polynomial.substring(index, polynomial.indexOf("^"));
        index = polynomial.indexOf("^")+3;
        polynomial = polynomial.substring(index);
    }


Vatsal:
    We are trying to make a solver that can solve any degree polynomials. And as to the code, it works for the beginning but I was             thinking of reading the String itself and creating an Integer[] from the string.
        
        "12x^2 + 5x^1 + 4" would yield an Integer[] {+12,+5,+4}. 
    
    This would make it easier for the user to read and implement this class.

Varun:
    Does the class need a constructor?

Vatsal: Yes.

Varun: Should we use the loop I wrote?

Vatsal: We need a loop that can handle any size integer, this loop is efficient but will not work with a monomial with a coefficient greater than nine. We need a loop that can read a string like this:
     "12x^2 + 5x^1 + 4"
 to make an array like {12, 5, 4}.
Varun: But an array has set limits so how would we make the program work for any polynomial?
        Are ArrayLists elastic?
Vatsal: The loop is incorrect, and will go on forever since we arent modifying the string itself(The "^" character will always be there), We need to think of another way to read the string polynomial. Maybe we could use spaces. And as for arrays we can use normal arrays as long as their size hasnt been preset.
        A loop like this might work:
           
           String reader;
           for(int i = 0; i < polynomial.length(); i++){
                if(polynomial.charAt(i) == ' '){
                    doSomething();
                }
                
                reader += polynomial.charAt(i);
           }
        
It would read 12x^2 then 5x^1, then 4 and we can have a separate loop to determine the coefficients.
        
        
Varun: But I am changing Polynomial. I am doing this: polynomial = polynomial.substring(index); every time the loop runs.
Vatsal: Then it might work, i'll try it out on eclipse.
Vatsal: The loop doesnt work, but the principle is solid. We could work on a loop that searches for the index of the plus and minus signs, then reads the integer from there adding the plus or minus back to the integer as it goes.

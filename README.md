# polynomial-solver
READ THIS IN THE RAW FORMAT
Varun:    
    The class is a bit complicated.
    I see what you're getting at with the String polynomial, but I'm not sure how you plan to break it up into the coefficients for each        degree.
    Also, I'd like to know what the highest degree will be for this solver before we get on with it. Are we going to do something like          this?
    (Given String polynomial and int[] coefficients) (Obviously not refined)
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

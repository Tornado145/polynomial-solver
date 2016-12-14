# polynomial-solver
READ THIS IN THE RAW FORMAT
The class is a bit complicated.
I see what you're getting at with the String polynomial, but I'm not sure how you plan to break it up into the coefficients for each degree.
Also, I'd like to know what the highest degree will be for this solver before we get on with it. Are we going to do something like this?
(Given String polynomial and int[] coefficients)
while(polynomial.indexOf("^") != -1) {
    int index = 0;
    coefficient[ ] = Integer.parseInt(polynomial.substring(index, polynomial.indexOf("^"));
    index = polynomial.indexOf("^")+3;
    polynomial = polynomial.substring(index);
}

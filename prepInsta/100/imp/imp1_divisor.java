//Write a program to count Number of integers which has exactly X divisors using Java
import java.util.*;
 
class imp1_divisor{

static void sieve(boolean[] primes, int x)
{
    primes[1] = true;
 
    for (int i=2; i*i <= x; i++)
    {
        if (primes[i] == false)
        {
            for (int j=2; j*i <= x; j++)
                primes[i*j] = true;
        }
    }
}

static int nDivisors(boolean[] primes, int x, int a, int b, int n)
{
    int result = 0;
 
    ArrayList<Integer> v=new ArrayList<>();
    for (int i = 2; i <= x; i++)
        if (primes[i] == false)
            v.add(i);
     
    
    for (int i=a; i<=b; i++)
    {
        int temp = i;
 
        int total = 1;
        int j = 0;
 
        for (int k = v.get(j); k*k <= temp; k = v.get(++j))
        {

            int count = 0;
 
            while (temp%k == 0){
                count++;
                temp = temp/k;
            }
 
            total = total*(count+1);
             
        }
 
        if (temp != 1)
            total = total*2;
 
        if (total == n)
            result++;
    }
    return result;
}
 
static int countNDivisors(int a, int b, int n)
{
    int x = (int)Math.sqrt(b) + 1;
 
    boolean[] primes=new boolean[x+1];
 
    sieve(primes, x);
 
    return nDivisors(primes, x, a, b, n);
}
 
// driver code
public static void main(String[] args)
{
    int  n = 7, x = 2 ;
    System.out.println(countNDivisors(1, n, x));
  
}
}

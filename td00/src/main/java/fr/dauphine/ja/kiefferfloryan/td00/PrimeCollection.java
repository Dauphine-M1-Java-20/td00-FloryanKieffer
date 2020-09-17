package fr.dauphine.ja.kiefferfloryan.td00;

import java.util.ArrayList;
import java.util.Random;

/**
 * Bonjour!
 *
 */
public class PrimeCollection 
{
	ArrayList<Integer> numbers;
	
	public PrimeCollection() {
		this.numbers = new ArrayList<Integer>();
	}
	
	public void initRandom(int n, int m) {
		for(int i = 0; i<n;i++) {
			int alea = (int)(Math.random()*m);
			System.out.println(alea);
			this.numbers.add(alea);
		}
	}
	
	public boolean isPrime(int p) {
		for(int i = 2; i<p/2;i++) {
			if(p%i==0) {
				return false;
			}
		}
		return true;
	}
	
	public void printPrime() {
		for(int i = 0; i<this.numbers.size();i++) {
			if(this.isPrime(this.numbers.get(i))==true) {
				System.out.println(this.numbers.get(i));
			}
		}
	}
	
    public static void main( String[] args )
    {
        PrimeCollection a = new PrimeCollection();
        a.initRandom(100, 2000);
        a.printPrime();
    }
}

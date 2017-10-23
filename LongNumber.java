import java.util.*;

class LongNumber extends Number {
	protected long nb;

	public LongNumber(long nb){
		this.nb = nb;
	}

	public int typeOf(){
		return 1;
	}

	public static LongNumber add(LongNumber nb, LongNumber nb2){
		return new LongNumber(nb.nb+nb2.nb);
	}

	public static LongNumber substract(LongNumber nb, LongNumber nb2){
		return new LongNumber(nb.nb-nb2.nb);
	}

	public static LongNumber multiplicate(LongNumber nb, LongNumber nb2){
		return new LongNumber(nb.nb*nb2.nb);
	}

	public static Number divide(LongNumber nb, LongNumber nb2){
		if(nb.nb%nb2.nb == 0)
			return new LongNumber(nb.nb/nb2.nb);
		long divisor = pgcd(absoluteValue(nb.nb), absoluteValue(nb2.nb));
		if(nb.nb<0 && nb2.nb<0){
			nb.nb = -nb.nb;
			nb2.nb = -nb2.nb;
		}else if(nb2.nb<0){
			nb.nb = -nb.nb;
			nb2.nb = -nb2.nb;
		}
		return new RationalNumber(nb.nb/divisor, nb2.nb/divisor);
	}

	public static LongNumber opposite(LongNumber nb){
		return new LongNumber(-nb.nb);
	}

	public static RationalNumber reverse(LongNumber nb){
		return new RationalNumber(1, nb.nb);
	}

	public String getString(){
		return " "+Long.toString(nb)+" ";
	}
}
import java.util.*;

class LongNumber extends Number {
	protected long nb;

	public LongNumber(long nb){
		this.nb = nb;
	}

	public int typeOf(){
		return 1;
	}

	static public LongNumber add(LongNumber nb, LongNumber nb2){
		return new LongNumber(nb.nb+nb2.nb);
	}

	static public LongNumber substract(LongNumber nb, LongNumber nb2){
		return new LongNumber(nb.nb-nb2.nb);
	}

	static public LongNumber multiplicate(LongNumber nb, LongNumber nb2){
		return new LongNumber(nb.nb*nb2.nb);
	}

	static public Number divide(LongNumber nb, LongNumber nb2){
		if(nb.nb%nb2.nb == 0)
			return new LongNumber(nb.nb/nb2.nb);
		long divisor = pgcd(valeurAbsolue(nb.nb), valeurAbsolue(nb2.nb));
		if(nb.nb<0 && nb2.nb<0){
			nb.nb = -nb.nb;
			nb2.nb = -nb2.nb;
		}else if(nb2.nb<0){
			nb.nb = -nb.nb;
			nb2.nb = -nb2.nb;
		}
		return new RationalNumber(nb.nb/divisor, nb2.nb/divisor);
	}
}
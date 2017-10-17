public class Multiplication extends OperationBinaire {

	public Multiplication(int nb1, int nb2){
		super(nb1, nb2);
	}

	public Number getNumber(){
		if (self.type == 1){

		}else if (self.type == 2){

		}else {
			return (FloatNumber)nb1 * (Float)nb2;
		}

	}
	
}
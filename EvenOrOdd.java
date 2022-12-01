package lab12;

class EvenOrOdd {
	int value;
	public EvenOrOdd(int value) {
		this.value=value;
	}

	public static void main(String[] args) {
		EvenOrOdd[] arr={ 
			new EvenOrOdd(0),new EvenOrOdd(1),new EvenOrOdd(2),
			new EvenOrOdd(3),new EvenOrOdd(4),new EvenOrOdd(5),
			new EvenOrOdd(6),new EvenOrOdd(7),new EvenOrOdd(8),
			new EvenOrOdd(9),new EvenOrOdd(10),
		};
		for(int i=0;i<arr.length;i++) {
			if(i%2==0) {
				System.out.println("Even Value : "+i);
			}
			else {
				System.out.println("Odd Value : "+i);
			}
		}

	}

}

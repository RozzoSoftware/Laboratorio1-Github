public class Dividir {
    public static int dividirnum(int a, int b){
	int rta =1;
	if(a>b){
		rta = a/b;
	}
	if(a<b){
		rta = b/a;
	}
	return rta;

    }
    public static void main(String[] args) {
        System.out.println(dividirnum(1, 3));
    }
}
package cl.praxis.models;


public class Calculadora {
    private int valor1;
    private int valor2;

    
    public String sumar(int valor1, int valor2) {
        return "el resultado de la suma es: " + Integer.toString(valor1 + valor2);
    }

    public String restar(int valor1, int valor2 ){
    	return "el resultado de la resta es: " + Integer.toString(valor1 - valor2);
    }

    public String multiplicar(int valor1, int valor2) {
    	return "el resultado de la multiplicacion es: " + Integer.toString(valor1 * valor2);
    }

    public String dividir(int valor1, int valor2) {
            	return "el resultado de la division es: " + Integer.toString(valor1 / valor2);
        }
    

    public  String ordenarNumero(int valor1, int valor2) {
    	if (valor1<valor2) {
    		return "los numeros ordenados son: " + valor1 + " - " + valor2;
		}else {
			return "los numeros ordenados son: " + valor2+ " - " + valor1;
		}    	
     }
    
    public String parOImpar(int valor1, int valor2) {
    	if (valor1 %2==0 && valor2 %2==0) {
    		
    		return "Ambos numeros son pares: " + valor1+ " " + valor2;
    		
		}else if (valor1 %2==0) {
			return "El numero " +valor1 +" Es par y el numero "+valor2+ " Es impar" ;
		} 
    	return "El numero " +valor2 +" Es par y el numero "+valor1+ " Es impar" ;
     }
    
    public boolean esCero (int valor2) {
    	if(valor2==0) {
    		return true;
    	} return false;
		
		
    }
    public boolean validarEnteros (String valor1, String valor2 ) {
    	
    	boolean resultado;

		try {
			Integer.parseInt(valor1);
			Integer.parseInt(valor2);
			resultado = true;
		} catch (NumberFormatException excepcion) {
			System.out.println("entrando..cal");
			resultado = false;
		}

		return resultado;
    	 
    }
    
    
    public Calculadora() {
    }

    public Calculadora(int valor1, int valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    public int getValor1() {
        return valor1;
    }

    public void setValor1(int valor1) {
        this.valor1 = valor1;
    }

    public int getValor2() {
        return valor2;
    }

    public void setValor2(int valor2) {
        this.valor2 = valor2;
    }



}
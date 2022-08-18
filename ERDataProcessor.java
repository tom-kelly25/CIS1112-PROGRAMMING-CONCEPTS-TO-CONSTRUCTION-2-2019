
public class ERDataProcessor {

public double data[];
public double averageRate = 0;


public void process (String data) {
	
	String[] data = data.split("");
	

}
public double poundToDollar (double p) {
	//Pound to dollar
	averageRate = 1.29;
	double p = p*averageRate;
	return p;
}
public double dollarToPound (double p) {
	//Dollar to Pond
	averageRate = 0.77;
	double p = p*averageRate;
	return p;            
}
public double getData(){
	return  this.data;
}
public void setData(double[]data){
	this.data = data;
}
public double getAverageRate(){
	return this.averageRate;
}
public void setAverageRate(double averageRate){
	this.averageRate = averageRate; 

}

}
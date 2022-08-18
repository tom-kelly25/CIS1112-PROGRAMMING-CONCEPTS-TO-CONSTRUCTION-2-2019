public class CoordPoint {


public double x;
public double y;

public void CoordPoint(double nx, double ny){
nx = x;
ny = y;

}
public void CoordPoint(CoordPoint p){
x = p.x;
y = p.y;
}

public void setLocation(double nx, double ny){
this.x = nx;
this.y = ny;
}
public float getDistance(double nx, double ny){
return (float)Math.sqrt(Math.pow((nx-x),2)+(Math.pow((ny-y),2)));
}
public double getX(){
return x;
}
public double getY(){
return y;
}


}
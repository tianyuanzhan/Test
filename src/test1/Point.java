package test1;

public class Point {
	double x,y,z;
	
	Point(double _x,double _y,double _z){
		x=_x;
		y=_y;
		z=_z;
	}
	
	void setX(double _x){
		x=_x;		
	}
	
	double getX(){
		return x;
	}
	
	
	void setY(double _y){
		y=_y;		
	}
	
	void setZ(double _z){
		z=_z;		
	}
	
	double getDistance(Point p){
		double d;
		d=(x-p.x)*(x-p.x)+(y-p.y)*(y-p.y)+(z-p.z)*(z-p.z);
		return d;
	}
	

}

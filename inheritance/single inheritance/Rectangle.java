class Shape{
double length=3;
double width=4;
 void displayDimensions(){
System.out.println("length: "+length+","+"width="+ width);
}
}
calss Rectangle extends Shape{
void calculateArea(){
double area= length*width;
System.out.println("area="= area);
}
public static void main(String[]args){
Rectangle rect=new Rectangle();
rect.displayDimensions();
rect.calculateArea();
}
}



class Animal{
void sound(){
System.out.println("animal makes sound");
}
}
class Dog extends Animal{
void bark(){
System.out.println("dog barks");
}

public static void main(String[]args){
Dog d=new Dog();
d.bark();
d.sound();
}


}
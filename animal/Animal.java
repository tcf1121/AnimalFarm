package animal;

public abstract class Animal {
    abstract void speak();
    public String name;
    public int weight;
    public String color;
    
    public Animal(String name, int weight, String color) {
    	this.name = name;
    	this.weight = weight;
    	this.color = color;
    }
    
    public void information() {
    	System.out.printf("이름 : "+ "%5s" + " | 무개 : " + "%5s" + 
    " | 색깔 : "+ "%5s\n" , this.name, this.weight, this.color);
    }
}

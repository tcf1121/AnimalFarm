package animal;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	String str;
    	String name;
    	int weight;
    	String color;
    	int select=0;
    	AnimalFarm animalfarm = new AnimalFarm();
        Animal cat = new Cat("나비", 3, "검정색");
        Animal dog = new Dog("초코", 4, "갈색");
        Animal chicken = new Chicken("꼬꼬", 2, "흰색");
        
        animalfarm.add(cat);
        animalfarm.add(dog);
        animalfarm.add(chicken);
        while(select != 6) {
        	System.out.println("1. 새로운 동물 객체 추가");
        	System.out.println("2. 이름으로 동물 객체 찾기");
        	System.out.println("3. 특정 동물에 대해 소리를 내기");
        	System.out.println("4. 모든 동물에 대해 소리내기");
        	System.out.println("5. 농장 안에 있는 모든 동물의 이름/무게/색깔 표로 출력");
        	System.out.println("6. 종료");
        	select = scan.nextInt();
        	scan.nextLine();
        	switch(select) {
        	case 1:
        		System.out.printf("동물 종류 입력 (개, 고양이, 닭) : ");
        		str = scan.nextLine();
    			System.out.printf("이름 : ");
    			name = scan.nextLine();
    			System.out.printf("무게 : ");
    			weight = scan.nextInt();
    			scan.nextLine();
    			System.out.printf("색깔 : ");
    			color = scan.nextLine();
        		switch(str) {
        		case "개":
        			animalfarm.add(new Dog(name, weight, color));
        			break;
        		case "고양이":
        			animalfarm.add(new Cat(name, weight, color));
        			break;
        		case "닭":
        			animalfarm.add(new Chicken(name, weight, color));
        			break;
        		}
        		break;
        	case 2:
        		System.out.printf(" 동물의 이름을 입력 : ");
        		str = scan.nextLine();
        		animalfarm.find(str);
        		break;
        	case 3:
        		System.out.printf(" 특정 동물 입력 (개, 고양이, 닭) : ");
        		str = scan.nextLine();
        		switch(str) {
        		case "개":
        			animalfarm.speakone(dog);
        			break;
        		case "고양이":
        			animalfarm.speakone(cat);
        			break;
        		case "닭":
        			animalfarm.speakone(chicken);
        			break;
        		}
        		break;
        	case 4:
        		animalfarm.speak();
        		break;
        	case 5:
        		animalfarm.allinfo();
        		break;
        	}
        }
    }
}

package animal;

import java.util.ArrayList;

public class AnimalFarm {
	public ArrayList<Animal> farm = new ArrayList<Animal>();
	
	public void add(Animal animal) {
		farm.add(animal);
	}
	
	public void find(String name) {
		int find = 0;
		if(farm.isEmpty()) {
			System.out.println("동물이 없습니다.");
		}
		else {
			for(int i=0;i<farm.size();i++) {
				if(name.equals(farm.get(i).name)) {
					System.out.println("찾은 동물의 정보");
					farm.get(i).information();
					find = 1;
				}
			}
			if(find == 0) {
				System.out.println("해당 동물이 없습니다.");
			}
		}
	}
	
	public void speakone(Animal animal) {
		farm.get(farm.indexOf(animal)).speak();
	}
	
	public void speak() {
		if(farm.isEmpty()) {
			System.out.println("동물이 없습니다.");
		}
		else {
			for(int i=0;i<farm.size();i++) {
				farm.get(i).speak();
			}
		}
	}
	
	public void allinfo() {
		if(farm.isEmpty()) {
			System.out.println("동물이 없습니다.");
		}
		else {
			System.out.println("----------------------------------------");
			for(int i=0;i<farm.size();i++) {
				farm.get(i).information();
			}
			System.out.println("----------------------------------------");
		}
	}
}

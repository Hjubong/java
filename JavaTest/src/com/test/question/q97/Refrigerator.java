package com.test.question.q97;


public class Refrigerator {

	private int index = 0;

	private Item[] items = new Item[100];

	public void add(Item item) {

		if (this.index < this.items.length) {

			this.items[this.index] = item;

			this.index++;
			
			System.out.printf("'%s'를 냉장고에 넣었습니다.\n", item.getName());

		} else {
			
			System.out.println("냉장고가 꽉 찼습니다.");
			
		}
	}

	public Item get(String name) {

		Item item = null;
		int itemIndex = -1;
		
		for(int i=0; i<this.index; i++) {
			if(this.items[i].getName().equals(name)) {
				
				item= this.items[i];
				itemIndex = i;
				this.index--;
				break;
			}
		}
		
		if(item != null) {
			
			for(int i=itemIndex; i<this.index; i++) {
				this.items[i] = this.items[i+1];
			}
		}
		
		return item;
	}

	public int count() {
		return this.index;
	}

	public void listItem() {
		System.out.println("[냉장고 아이템 목록]");
		
		for(int i=0; i<index; i++) {
			
			Item item = this.items[i];
			
			System.out.printf("%s(%s)\n", item.getName(), item.getExpiration());
		}
	}
}

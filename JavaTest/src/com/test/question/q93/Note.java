package com.test.question.q93;

class Note  {
	   private String size = "";
	   private String color;
	   private int page;
	   private String owner;
	   private int price = 500;
	   //setter, getter 구현

	   public String info() {
		   
		   String temp = "";
		   
		   if(owner == null) {
			  temp += "■■■■■■ 노트 정보 ■■■■■■\n";
			  temp +=  "      주인 없는 노트\n";
			  temp += "■■■■■■■■■■■■■■■■■■■■■■";
			   return temp;
		   }
		   
		   System.out.print("■■■■■■ 노트 정보 ■■■■■■\n");
		   System.out.print("소유자:" + owner + "\n");
		   System.out.print("특성: " + color + thickness() + size +"노트\n" );
		   System.out.printf("가격: %,d원\n", this.price);
		   System.out.print("■■■■■■■■■■■■■■■■■■■■■■" );
		   
		   
	         return "";
	   }

	   
	   
	public void setSize(String size) {
		
		if (size.equals("A3") 
				|| size.equals("A4") 
				|| size.equals("A5") 
				|| size.equals("B3") 
				|| size.equals("B4") 
				|| size.equals("B5")) {
		    
			this.size = size;
		    
		    if(size.equals("A3")) {
		    	this.price +=400;
		    } else if (size.equals("A4")) {
				this.price += 200;
			} else if (size.equals("B3")) {
				this.price += 500;
			} else if (size.equals("B4")) {
				this.price += 300;
			} else if (size.equals("B5")) {
				this.price += 100;
			} 

		
		}
	}
	public void setColor(String color) {
		if (color.equals("검정색") 
				|| color.equals("흰색") 
				|| color.equals("노란색") 
				|| color.equals("파란색")) {
		    this.color = color;
		} else {
			System.out.println("올바른 컬러가 아닙니다.");
		} 
		
		if (color.equals("검정색")) {
			this.price += 100;
		} else if (color.equals("노란색")) {
			this.price += 200;
		} else if (color.equals("파란색")) {
			this.price += 200;
		}
	}

	public void setPage(int page) {
		
		if(page >= 10 && page <=200) {
			this.page = page;
		} else {
			System.out.println("올바른 페이지수가 아닙니다.");
		}
		
		this.price += (page - 10) * 10;
		
	}

	public void setOwner(String owner) {
		
		if(owner.length() < 2 || owner.length() >5) {
			return;
		}
		
		for(int i=0; i<owner.length(); i++) {
			
			char c = owner.charAt(i);
			
			if(c < '가' || c >'힣') {
				return;
			}
				
		}
		
		this.owner = owner;
		
		
		/*
		if(owner.length() >= 2 && owner.length() <= 5) {
			
			boolean result = false;
			
			for(int i=0; i<owner.length(); i++) {
				
				char c = owner.charAt(i);
				
				if(c >= '가' && c<= '힣') {
					result = true;
				} else {
					result = false;
					break;
				}
			}
			
			if(result) {
				this.owner = owner;
			}
		}
		*/
		
		
		
//	    if (owner.matches("[가-힣]{2,5}")) {
//	        this.owner = owner;
//	    } else {
//	        System.out.println("주인 없는 노트");
//	    }
	}
	
	//메소드 매개변수값을 설정하지 않아도 됨
	public String thickness() {
		
		if(this.page>=10 && this.page <=50 ) {
			return "얇은";
		} else if(this.page >= 51 &&this. page <=100 ) {
			return "보통";
		} else {
			return "두꺼운";
		}
	}
	
	}

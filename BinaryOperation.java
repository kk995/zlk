
public class BinaryOperation{
	private int leftOperand=0;
	private int rightOperand=0;
	private int value=0;
	private char operator;
	
	public int getLeft(){
		return leftOperand;
	}
	public int getRight(){
		return rightOperand;
	}
	public int getValue(){
		return value;
	}
	public char getOperator(){
		return operator;
	}
	public boolean equals(BinaryOperation anOperation){
		return leftOperand == anOperation.getLeft() &&
				rightOperand == anOperation.getRight() &&
				operator == anOperation.getOperator() ;
	}
	public int construct(int left, int right,char op) {
		int result=0;
    	if (!(0 <= left && left <= 100)){
    		throw new RuntimeException("左运算数不在0~100的范围");
    	}
    	if (!(0 <= right && right <= 100)){
    		throw new RuntimeException("右运算数不在0~100的范围");
    	}
    	if (op == '+'){		
    		result = left+right;
    		if (!(0 <= result && result <= 100)){
    			throw new RuntimeException("加法运算结果不在0~100的范围");
    		}
    	} else if (op == '-'){
    		result = left-right;
    		if (!(0 <= result && result <= 100)){
    			throw new RuntimeException("减法运算结果不在0~100的范围");
    		}
    	} else {
    		throw new RuntimeException(op+"不是加号或减号运算符！");
    	}
    	leftOperand = left;
		rightOperand = right;
		operator = op;  
		value = result;
		return value;
    }
	
	// 希望显示运算式，如23+65=88.代码有错误： 等号左边显示的是值
	/*
	 * public String toString(){
		return leftOperand+operator+rightOperand+"="+value;
	}
	*/
	public String toString(){
		return ""+leftOperand+operator+rightOperand+"="+value;
	}
}

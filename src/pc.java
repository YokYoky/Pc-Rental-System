public class pc {
	String[] pc = {"PC1", "PC2", "PC3", "PC4", "PC5", "PC6", "PC7", "PC8", "PC9", "PC10"};

	pc(){
		this.pc = pc;
	}
	
	String[] getPC() {
		return pc;
	}
	
	void setPC(String[] pc) {
		this.pc = pc;
	}
	
	void pclist() {
		for(int i = 0; i<pc.length; i++) {
			System.out.println(pc[i]);
		}
	}
	
}

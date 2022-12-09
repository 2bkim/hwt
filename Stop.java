public class Stop implements State {
	public Stop() {
	System.out.println("<<현재 상태: 정지>>");
	}
	
	public void on_button(ElectricFan EF) {
	System.out.println("\n***on 버튼 눌림***\n" +"정지에서 송풍 상태로 바뀜\n");
	EF.setState(new Wind());
	}
	
	public void off_button(ElectricFan EF) {
	System.out.println("\n***off 버튼 눌림***\n" +"상태 변화 없음\n");
	}
}
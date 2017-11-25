package File;
class Message<T>{
	private T msg;
	public void setMsg(T msg){
		this.msg = msg;
	}
	public T getMsg(){
		return msg;
	}
}
public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Message<String> m = new Message<String>();
		m.setMsg("����һ��������");
		fun(m);
	}
	public static void fun(Message<String> temp){
		System.out.println(temp.getMsg());
	}

}

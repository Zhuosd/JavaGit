package File;


interface IMessage<T>{
	public void print(T t);
}
class MessageImpl<S> implements IMessage<S>{
	public void print(S t){
		System.out.println(t);
	} 
}
public class Inter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IMessage<String> msg = new MessageImpl<String>();
		msg.print("��ע�����עÿһʱ��");
	}

}

//未完待续

class Book1 {
	private String title ;
	private double price ;
	
	public Book1(String title, double price) {
		this.title = title ;
		this.price = price ;
	}
	/**
	* 进行本类对象的比较操作，在比较过程中首先会判断传入的对象是否为null，而后判断地址是否相同
	* 如果都不相同则进行对象内容的判断，由于compare()方法接收了本类引用，所以可以直接访问私有属性
	*  @param book 要进行判断的数据
	*  @return 内存地址相同或属性完全相同返回true，否则返回false
	*/
	public  boolean compare(Book1 book) {
		if (book ==  null) {  // 传入数据为null
			return  false ;  // 没有必要进行具体的判断
		}
	// 执行“b1.compare(b2)”代码时会有两个对象
	// 当前对象this（调用方法对象，就是b1引用）
	// 传递的对象book（引用传递，就是b2引用）
	if ( this == book) {  // 内存地址相同
		return  true ;  // 避免进行具体细节的比较，节约时间
	}
	if ( this.title.equals(book.title)
			&&  this.price == book.price) {  // 属性判断
		return true ;
	} else {
		return false ;
	}
}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getInfo() {
		return "图书名称：" +  this.title + "，图书价格：" +  this.price ;
	}
}

class Link{

	private class Node{
		private Book1 data;
		private Node next;
		public Node(Book1 data) {
			super();
			this.data = data;
	}
	/**
	* 设置新节点的保存，所有的新节点保存在最后一个节点之后
	*  @param newNode 新节点对象
	*/
	public void addNode(Node newNode){
		if(this.next == null){
			this.next = newNode;
		}else {
			this.next.addNode(newNode);
		}
	}
	/**
	* 数据检索操作，判断指定数据是否存在
	* 第一次调用（Link）：this = Link.root
	* 第二次调用（Node）：this = Link.root.next
	*  @param data 要查询的数据
	*  @return 如果数据存在返回true，否则返回false
	*/
	public boolean containsNode(Book1 data){
		if(data.compare(this.data)){
			return true;
		}else{
			if(this.next != null){
				return this.next.containsNode(data)
			}else{
				return false;
			}
		}
	}
	/**
	* 根据索引取出数据，此时该索引一定是存在的
	*  @param index 要取得数据的索引编号
	*  @return 返回指定索引节点包含的数据
	*/
	public Book1 getNode(int index){
		if(Link.this.foot++ == index){
			return this.data;
		}else {
			return this.next.getNode(index);
		}
	}
	
	public void setNode(int index,Book1 data){
		if(Link.this.foot++ = index){
			this.data = data;
		}else{
			this.next.setNode(index, data);
		}
	} 
	/**
	* 节点的删除操作，匹配每一个节点的数据，如果当前节点数据符合删除数据，
	* 则使用“当前节点上一节点.next = 当前节点.next”方式空出当前节点
	* 第一次调用（Link）：previous = Link.root、this = Link.root.next
	* 第二次调用（Node）：previous = Link.root.next、this = Link.root.next.next
	*  @param previous 当前节点的上一个节点
	*  @param data 要删除的数据
	*/
	public void removeNode(Node previous,Book1 data){
		if(data.compare(this.data)){
			previous.next = this.next;
		}else{
			this.next.removeNode(this, data);
		}
	}
	public void toArrayNode(){
		Link.this.
	}
	}
}
	

public class LInkLian {
	public static void main(String[] args) {
		
	}
}

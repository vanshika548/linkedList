package LinkedList;

public class MyMapNode<K,V> implements INode{
	
	K key;
	V value;
	MyMapNode<K, V >next;
	
	public MyMapNode(K key, V value) {
		this.key=key;
		this.value=value;
	}

	@Override
	public K getKey() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setKey(Object key) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public INode<K> getNext() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setNext(INode next) {
		// TODO Auto-generated method stub
		
	}
	
}

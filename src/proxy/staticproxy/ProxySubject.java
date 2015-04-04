package proxy.staticproxy;

public class ProxySubject implements Subject {
	private RealSubject realsubject;

	public void request() {
		this.preRequest();
		if(realsubject ==null){
			realsubject = new RealSubject();
		}
		realsubject.request();
		this.postRequest();
	}
	
	private void preRequest(){
		System.out.println("ProxySubject method preRequest...");
	}
	
	private void postRequest(){
		System.out.println("ProxySubject method postRequest...");
	}

}

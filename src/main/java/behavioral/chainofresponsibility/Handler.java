package behavioral.chainofresponsibility;

public abstract class Handler {
	protected Handler m_successor;

	public void setSuccessor(Handler successor) {
		m_successor = successor;
	}

	public void handleRequest(Request request) {
		m_successor.handleRequest(request);
	}
}

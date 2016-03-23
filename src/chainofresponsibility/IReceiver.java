package chainofresponsibility;

interface IReceiver {
	Boolean ProcessMessage(Message msg);
}

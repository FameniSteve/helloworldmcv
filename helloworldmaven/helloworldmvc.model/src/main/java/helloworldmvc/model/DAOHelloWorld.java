package helloworldmvc.model;


public class DAOHelloWorld {
	

	private String FileName= HelloWorld.txt;
	private DAOHelloWorld instance=null;
	private String helloWorldMessage= null;
	
	private DAOHelloWorld(){
		this.FileName=FileName;
		this.helloWorldMessage=helloWorldMessage;
		this.instance=instance;
	}

	public DAOHelloWorld getInstance() {
		return instance;
	}

	private void setInstance(DAOHelloWorld instance) {
		this.instance = instance;
	}

	public String getHelloWorldMessage() {
		return helloWorldMessage;
	}

	public void setHelloWorldMessage(String helloWorldMessage) {
		this.helloWorldMessage = helloWorldMessage;
	}

	private void readFile() {
		System.out.println(FileName);
	}
		
	
	
	}

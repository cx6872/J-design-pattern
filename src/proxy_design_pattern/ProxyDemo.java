package proxy_design_pattern;

interface Network { // ����Network�ӿ�
	public void browse(); // ��������ĳ��󷽷�
}

class Real implements Network { // ��ʵ����������
	public void browse() { // ��д���󷽷�
		System.out.println("���������Ϣ��");
	}
}

class Proxy implements Network { // ��������
	private Network network;

	public Proxy(Network network) {// ���ô������ʵ����
		this.network = network; // ���ô��������
	}

	public void check() { // �����֤����
		System.out.println("����û��Ƿ�Ϸ���");
	}

	public void browse() {
		this.check(); // ���þ���Ĵ���ҵ�����
		this.network.browse(); // ������ʵ����������
	}
}

public class ProxyDemo {
	public static void main(String args[]) {
		Network net = null; // ����ӿڶ���
		net = new Proxy(new Real()); // ʵ��������ͬʱ����������ʵ����
		net.browse(); // ���ô������������
	}
}
/*
    �������ģʽ��
    ָ��һ������������������ʵ���⣬��ʵ����ִ�о����ҵ����������������⸺���������ҵ��Ĵ���
    ���������е�ͨ������������磬�ͻ�ͨ����������������磨����ҵ�񣩣��ɴ������������û�Ȩ��
    �ͷ������Ƶ���������ص��������������ҵ�񣩡�


 
 */

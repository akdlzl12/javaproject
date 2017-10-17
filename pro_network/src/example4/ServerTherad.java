package example4;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class ServerTherad extends Thread {
	
	
	private Socket socket;
	private Job job = new Job();
	public ServerTherad(Socket socket) {
		this.socket = socket;
	}
	public void run() {
		try {
			DataInputStream in = new DataInputStream(socket.getInputStream());
			DataOutputStream out = new DataOutputStream(socket.getOutputStream());
			
			String jobType = in.readUTF();
			if("U".equals(jobType)) {
				try {
					job.fileupload(in, out);
					
					out.writeUTF("M");
					out.writeUTF("Success");
					
				}catch(IOException e) {
					out.writeUTF("M");
					out.writeUTF("Fail");
					out.writeUTF("Server known Error");
				}
				
			}else if("D".equals(jobType)) {
				
				try {
					job.fileDownload(in, out);
				}catch (IOException e) {
					out.writeUTF("M");
					out.writeUTF("Fail");
					out.writeUTF("Server known Error");
				}
				
				
				
			}else if("L".equals(jobType)) {
				String[] filenames = job.filelist();
				
				StringBuffer sb = new StringBuffer();
				for (String filename : filenames) {
					sb.append(filename);
					sb.append(System.lineSeparator());
				}
				
				out.writeUTF("F");
				out.writeUTF("Success");
				out.writeUTF(sb.toString());
				
			}else {
				out.writeUTF("M");
				out.writeUTF("Fail");
				out.writeUTF("Invalid jobtype");
			}
		} catch (IOException e) {
			// TODO: handle exception
		}
	}
}

package org.dimigo.io;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

public class SaveImageFromUrl {
	
	public static void main(String[] args) {
		
		String imageUrl = "http://cfile3.uf.tistory.com/image/2244D44F527B493117443E";
		
		try {
			URL url = new URL(imageUrl);
			
			try(InputStream is = url.openStream();
				OutputStream os = new FileOutputStream("files/ramsey.jpg")){
				
				byte[] buf = new byte[100];
				int result = 0;
				
				while((result = is.read(buf)) != -1) {
					os.write(buf, 0, result);
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}

package com.oversea.task.util;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public class GZIPUtil {

	/***
	 * 压缩GZip
	 * 
	 * @param data
	 * @return
	 * @throws IOException 
	 */
	public static byte[] gZip(byte[] data) throws IOException {
		byte[] b = null;
	
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		GZIPOutputStream gzip = new GZIPOutputStream(bos);
		gzip.write(data);
		gzip.finish();
		gzip.close();
		b = bos.toByteArray();
		
		return b;
	}

	/***
	 * 解压GZip
	 * 
	 * @param data
	 * @return
	 * @throws IOException 
	 */
	public static byte[] unGZip(byte[] data) throws IOException {
		byte[] b = null;
		
		ByteArrayInputStream bis = new ByteArrayInputStream(data);
		GZIPInputStream gzip = new GZIPInputStream(bis);
		byte[] buf = new byte[1024];
		int num = -1;
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		while ((num = gzip.read(buf, 0, buf.length)) != -1) {
			baos.write(buf, 0, num);
		}
		b = baos.toByteArray();
		baos.flush();
		baos.close();
		gzip.close();
		return b;
	}
	
	public static Object unGzipToObject(byte[] data) throws IOException, ClassNotFoundException {
		byte[] objData = unGZip(data);
		ByteArrayInputStream inData = new ByteArrayInputStream(objData);
		ObjectInputStream ois = new ObjectInputStream(inData);
		return ois.readObject();
	}

	/**
	 * @param value
	 * @return
	 * @throws IOException 
	 */
	public static Object gZip(Object value) throws IOException {
		ByteArrayOutputStream data = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(data);
		oos.writeObject(value);
		return gZip(data.toByteArray());
	}
}

package ch19;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

public class DownloadImage {
	public static void main(String[] args) throws Exception {
		String webSite = "https://campaign.naver.com/n1-de-chanel/img/spot_bg_pc.jpg";
		
		System.out.println("다운로드를 시작합니다.");
		// url 생성
		URL url = new URL(webSite); 
		// 버퍼용 바이트 배열[2mb]
		byte[] buffer = new byte[2048];
		// 파일로 저장 <== 프로그램 <== 서버의 이미지 파일
		
		// try ~ with문 (Java1.7부터 도입)
		// try(리소스선언부){}catch(Exception e){}
		// finally가 없어도 리소스를 자동으로 종료시킴
		try(InputStream in = url.openStream(); 
				OutputStream out = new FileOutputStream("c:\\test\\test.jpg")) {
			// 읽은 바이트수 리턴
			int length = 0;
			// 읽은 바이트수 = 스트림.read(버퍼)
			// 더이상 읽을 내용이 없으면 -1
			while ((length = in.read(buffer)) != -1) {
				System.out.println(length+"바이트 읽음");
				// 출력스트림.write(버퍼, 시작인덱스, 길이)
				out.write(buffer, 0, length);
			}
			System.out.println("다운로드가 완료되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

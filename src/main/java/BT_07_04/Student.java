package BT_07_04;

import java.sql.Date;

public class Student {

	public Student() {
		
	}
	private int id;
	private String hoten;
	private Date ngaysinh ;
	private String dienthoai,gioitinh;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getHoten() {
		return hoten;
	}
	public void setHoten(String hoten) {
		this.hoten = hoten;
	}
	public Date getNgaysinh() {
		return ngaysinh;
	}
	public void setNgaysinh(Date ngaysinh) {
		this.ngaysinh = ngaysinh;
	}
	public String getDienthoai() {
		return dienthoai;
	}
	public void setDienthoai(String dienthoai) {
		this.dienthoai = dienthoai;
	}
	public String getGioitinh() {
		return gioitinh;
	}
	public void setGioitinh(String gioitinh) {
		this.gioitinh = gioitinh;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", hoten=" + hoten + ", ngaysinh=" + ngaysinh + ", dienthoai=" + dienthoai
				+ ", gioitinh=" + gioitinh + "]";
	}
	

}

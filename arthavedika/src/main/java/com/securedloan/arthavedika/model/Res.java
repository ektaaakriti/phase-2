package com.securedloan.arthavedika.model;

import java.util.List;

public class Res {
	
	private double distance;
	private boolean face_result;
	private List<String> detail;
	public Res() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Res(double distance, boolean face_result, List<String> detail) {
		super();
		this.distance = distance;
		this.face_result = face_result;
		this.detail = detail;
	}
	public double getDistance() {
		return distance;
	}
	public void setDistance(double distance) {
		this.distance = distance;
	}
	public boolean isFace_result() {
		return face_result;
	}
	public void setFace_result(boolean face_result) {
		this.face_result = face_result;
	}
	public List<String> getDetail() {
		return detail;
	}
	public void setDetail(List<String> detail) {
		this.detail = detail;
	}

}

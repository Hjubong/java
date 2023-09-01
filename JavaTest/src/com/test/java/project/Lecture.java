package com.test.java.project;

public class Lecture {

	private String lectureNum;
	private String teacherNum;
	private String lecutreName;
	private String category;
	private String dayOfWeek;
	private String time;
	private String target;
	private String content;
	private String numberOfPeople;
	private String tuition;
	private String startDate;
	private String roomNum;

	public Lecture(String lectureNum, String teacherNum, String lectureName, String category, String dayOfWeek,
			String time, String tuition, String content, String numberOfPeople, String target, String startDate,
			String roomNum) {
		this.lectureNum = lectureNum;
		this.teacherNum = teacherNum;
		this.lecutreName = lectureName;
		this.category = category;
		this.dayOfWeek = dayOfWeek;
		this.time = time;
		this.target = target;
		this.content = content;
		this.numberOfPeople = numberOfPeople;
		this.tuition = tuition;
		this.startDate = startDate;
		this.roomNum = roomNum;
	}

	

	public Lecture(String category, String lectureName,String time,String dayOfWeek,String target, String tuition, String numberOfPeople) {
		this.lecutreName = lectureName;
		this.dayOfWeek = dayOfWeek;
		this.time = time;
		this.tuition = tuition;
		this.category = category;
		this.target = target;
		this.numberOfPeople = numberOfPeople;
	}
	
	
	

	@Override
	public String toString() {
		return "Lecture [lectureNum=" + lectureNum + ", teacherNum=" + teacherNum + ", lecutreName=" + lecutreName
				+ ", category=" + category + ", dayOfWeek=" + dayOfWeek + ", time=" + time + ", target=" + target
				+ ", content=" + content + ", numberOfPeople=" + numberOfPeople + ", tuition=" + tuition
				+ ", startDate=" + startDate + ", roomNum=" + roomNum + "]";
	}



	public String getLectureNum() {
		return lectureNum;
	}

	public void setLectureNum(String lectureNum) {
		this.lectureNum = lectureNum;
	}

	public String getTeacherNum() {
		return teacherNum;
	}

	public void setTeacherNum(String teacherNum) {
		this.teacherNum = teacherNum;
	}

	public String getLecutreName() {
		return lecutreName;
	}

	public void setLecutreName(String lecutreName) {
		this.lecutreName = lecutreName;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDayOfWeek() {
		return dayOfWeek;
	}

	public void setDayOfWeek(String dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getTarget() {
		return target;
	}

	public void setTarget(String target) {
		this.target = target;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getNumberOfPeople() {
		return numberOfPeople;
	}

	public void setNumberOfPeople(String numberOfPeople) {
		this.numberOfPeople = numberOfPeople;
	}

	public String getTuition() {
		return tuition;
	}

	public void setTuition(String tuition) {
		this.tuition = tuition;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getRoomNum() {
		return roomNum;
	}

	public void setRoomNum(String roomNum) {
		this.roomNum = roomNum;
	}

//	강좌번호(k)
//	강사번호(f)
//	강좌명
//	카테고리
//	교육요일
//	시간
//	교육대상
//	강좌내용
//	신청인원수
//	수강료
//	시작날짜(년월)
//	강의실번호(f)
}

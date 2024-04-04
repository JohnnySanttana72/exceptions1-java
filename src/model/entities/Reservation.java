package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {
	private Integer roomNumber;
	private Date checkIn;
	private Date checOut;
	
	private static SimpleDateFormat sdj = new SimpleDateFormat("dd/MM/YYYY");
	
	public Reservation(Integer roomNumber, Date checkIn, Date checOut) {
		this.roomNumber = roomNumber;
		this.checkIn = checkIn;
		this.checOut = checOut;
	}
	public Integer getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}
	public Date getCheckIn() {
		return checkIn;
	}
	
	public Date getChecOut() {
		return checOut;
	}
	
	public long duration() {
		long diff = checOut.getTime()- checkIn.getTime();
		return TimeUnit.DAYS.convert(diff,TimeUnit.MILLISECONDS);
	}
	public void updadeDates(Date checkIn, Date checkOut ) {
		this.checkIn = checkIn;
		this.checOut = checkOut;
	}
	@Override
	public String toString() {
		return "Room "
				+roomNumber
				+", check-in: "
				+sdj.format(checkIn)
				+", check-out: "
				+sdj.format(checOut)
				+", "
				+duration()
				+" nights";
		
	}
	
	
	
}

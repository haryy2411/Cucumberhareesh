package com.pagemanager;

import com.pages.BookAHotel;
import com.pages.BookingConfirmation;
import com.pages.CancelBooking;
import com.pages.LoginPage;
import com.pages.SearchHotel;
import com.pages.SelectHotel;
/**
 * 
 * @author Hareesh K
 * @Description Creating object for all classes
 * @Date 08/07/2022
 *
 */
public class PageObjectManager {

	private LoginPage loginPage;
	private SearchHotel searchHotel;
	private SelectHotel selectHotel;
	private BookAHotel bookAHotel;
	private BookingConfirmation bookingConfirmation;
	private CancelBooking cancelBooking;
	
	/**
	 * @Description Creating object for LoginPage 
	 * @return
	 * Date 08/07/2022
	 */
	public LoginPage getLoginPage() {
		return (loginPage==null)?loginPage = new LoginPage(): loginPage;
	}
	/**
	 * @Description Creating object for SearchHotel 
	 * @return
	 * Date 08/07/2022
	 */
	public SearchHotel getSearchHotel() {
		return (searchHotel==null)?searchHotel = new SearchHotel():searchHotel;
	}
	/**
	 * @Description Creating object for SelectHotel 
	 * @return
	 * Date 08/07/2022
	 */
	public SelectHotel getSelectHotel() {
		return (selectHotel==null)?selectHotel=new SelectHotel():selectHotel;
	}
	/**
	 * @Description Creating object for BookAHotel 
	 * @return
	 * Date 08/07/2022
	 */
	public BookAHotel getBookAHotel() {
		return (bookAHotel==null)?bookAHotel=new BookAHotel():bookAHotel;
	}
	/**
	 * @Description Creating object for BookingConfirmation 
	 * @return
	 * Date 08/07/2022
	 */
	public BookingConfirmation getBookingConfirmation() {
		return (bookingConfirmation==null)?bookingConfirmation= new BookingConfirmation():bookingConfirmation;
	}
	/**
	 * @Description Creating object for CancelBooking 
	 * @return
	 * Date 08/07/2022
	 */
	public CancelBooking getCancelBooking() {
		return (cancelBooking==null)?cancelBooking=new CancelBooking():cancelBooking;
	}



}

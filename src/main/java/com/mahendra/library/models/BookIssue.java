package com.mahendra.library.models;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.*;

import io.swagger.v3.oas.annotations.media.Schema;



@Entity
@Table(name="book_issues")
public class BookIssue implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Schema(description="Issue ID", example="101")
	@Column(name="issue_id",scale = 5, precision = 0)
	private Integer id;

	@Schema(description="Book ID", example="101")
	@Column(name="book_id",scale = 5, precision = 0)
	private Integer bookId;

	@Schema(description="Member ID", example="101")
	@Column(name="member_id",scale = 5, precision = 0)
	private Integer memberId;

	@Temporal(TemporalType.DATE)
	@Column(name="issue_date")
	@Schema(description="Date of Issue", example="2022-01-02")
	private Date issueDate;

	@Column(name="return_date_exp")
	@Temporal(TemporalType.DATE)
	@Schema(description="Estimated Return date", example="2022-01-07")
	private Date estimatedReturnDate;
	// actualReturnDate = NULL  Book not returned yet  
	// actualReturnDate != NULL, Book is returned

	@Column(name="return_date_actual")
	@Temporal(TemporalType.DATE)
	@Schema(description="Actual date of return", example="2022-01-05")
	private Date actualReturnDate;
	//STATUS = 'P' Book not returned
	//STATUS = 'R' Book has been returned

	@Column(name="issue_status",length = 1)
	@Schema(description="Issue Status ( 'P' => Pending, 'R' => Returned )", example="P")
	private char status;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getBookId() {
		return bookId;
	}
	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}
	public Integer getMemberId() {
		return memberId;
	}
	public void setMemberId(Integer memberId) {
		this.memberId = memberId;
	}
	public Date getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
	}
	public Date getEstimatedReturnDate() {
		return estimatedReturnDate;
	}
	public void setEstimatedReturnDate(Date estimatedReturnDate) {
		this.estimatedReturnDate = estimatedReturnDate;
	}
	public Date getActualReturnDate() {
		return actualReturnDate;
	}
	public void setActualReturnDate(Date actualReturnDate) {
		this.actualReturnDate = actualReturnDate;
	}
	public char getStatus() {
		return status;
	}
	public void setStatus(char status) {
		this.status = status;
	}
	public BookIssue(Integer bookId, Integer memberId, Date issueDate, Date estimatedReturnDate,
			Date actualReturnDate, char status) {
		super();
		this.bookId = bookId;
		this.memberId = memberId;
		this.issueDate = issueDate;
		this.estimatedReturnDate = estimatedReturnDate;
		this.actualReturnDate = actualReturnDate;
		this.status = status;
	}
	public BookIssue() {
		super();
	}
	
}

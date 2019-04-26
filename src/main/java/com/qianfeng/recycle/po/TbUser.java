package com.qianfeng.recycle.po;


public class TbUser {

  private long userId;
  private String username;
  private String password;
  private String mailbox;
  private String tel;
  private String address;
  private long balance;
  private long frozenBalance;
  private String alipayInfo;
  private String payPassword;
  private String grade;


  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }


  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }


  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  public String getMailbox() {
    return mailbox;
  }

  public void setMailbox(String mailbox) {
    this.mailbox = mailbox;
  }


  public String getTel() {
    return tel;
  }

  public void setTel(String tel) {
    this.tel = tel;
  }


  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }


  public long getBalance() {
    return balance;
  }

  public void setBalance(long balance) {
    this.balance = balance;
  }


  public long getFrozenBalance() {
    return frozenBalance;
  }

  public void setFrozenBalance(long frozenBalance) {
    this.frozenBalance = frozenBalance;
  }


  public String getAlipayInfo() {
    return alipayInfo;
  }

  public void setAlipayInfo(String alipayInfo) {
    this.alipayInfo = alipayInfo;
  }


  public String getPayPassword() {
    return payPassword;
  }

  public void setPayPassword(String payPassword) {
    this.payPassword = payPassword;
  }


  public String getGrade() {
    return grade;
  }

  public void setGrade(String grade) {
    this.grade = grade;
  }

}

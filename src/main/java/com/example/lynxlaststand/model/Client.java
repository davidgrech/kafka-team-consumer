package com.example.lynxlaststand.model;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


public class Client {

	private long id;

	private String maritalStatus;

	private double income;

	private double mntWines;

	private double mntFruits;

	private double mntMeatProducts;

	private double mntFishProducts;

	private double mntSweetProducts;

	private double mntGoldProducts;

	private String date;

	private boolean atRisk;

	public Client() {
		super();
	}

	public Client(String maritalStatus, double income, double mntWines, double mntFruits, double mntMeatProducts,
                  double mntFishProducts, double mntSweetProducts, double mntGoldProducts,
                  String date, boolean atRisk) {
		this.maritalStatus = maritalStatus;
		this.income = income;
		this.mntWines = mntWines;
		this.mntFruits = mntFruits;
		this.mntMeatProducts = mntMeatProducts;
		this.mntFishProducts = mntFishProducts;
		this.mntSweetProducts = mntSweetProducts;
		this.mntGoldProducts = mntGoldProducts;
		this.date = date;
		this.atRisk = atRisk;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public double getIncome() {
		return income;
	}

	public void setIncome(double income) {
		this.income = income;
	}

	public double getMntWines() {
		return mntWines;
	}

	public void setMntWines(double mntWines) {
		this.mntWines = mntWines;
	}

	public double getMntFruits() {
		return mntFruits;
	}

	public void setMntFruits(double mntFruits) {
		this.mntFruits = mntFruits;
	}

	public double getMntMeatProducts() {
		return mntMeatProducts;
	}

	public void setMntMeatProducts(double mntMeatProducts) {
		this.mntMeatProducts = mntMeatProducts;
	}

	public double getMntFishProducts() {
		return mntFishProducts;
	}

	public void setMntFishProducts(double mntFishProducts) {
		this.mntFishProducts = mntFishProducts;
	}

	public double getMntSweetProducts() {
		return mntSweetProducts;
	}

	public void setMntSweetProducts(double mntSweetProducts) {
		this.mntSweetProducts = mntSweetProducts;
	}

	public double getMntGoldProducts() {
		return mntGoldProducts;
	}

	public void setMntGoldProducts(double mntGoldProducts) {
		this.mntGoldProducts = mntGoldProducts;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public boolean isAtRisk() {
		return atRisk;
	}

	public void setAtRisk(boolean atRisk) {
		this.atRisk = atRisk;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Client client = (Client) o;

		if (id != client.id) return false;
		if (Double.compare(client.income, income) != 0) return false;
		if (Double.compare(client.mntWines, mntWines) != 0) return false;
		if (Double.compare(client.mntFruits, mntFruits) != 0) return false;
		if (Double.compare(client.mntMeatProducts, mntMeatProducts) != 0) return false;
		if (Double.compare(client.mntFishProducts, mntFishProducts) != 0) return false;
		if (Double.compare(client.mntSweetProducts, mntSweetProducts) != 0) return false;
		if (Double.compare(client.mntGoldProducts, mntGoldProducts) != 0) return false;
		if (atRisk != client.atRisk) return false;
		if (maritalStatus != null ? !maritalStatus.equals(client.maritalStatus) : client.maritalStatus != null)
			return false;
		return date != null ? date.equals(client.date) : client.date == null;
	}

	@Override
	public int hashCode() {
		int result;
		long temp;
		result = (int) (id ^ (id >>> 32));
		result = 31 * result + (maritalStatus != null ? maritalStatus.hashCode() : 0);
		temp = Double.doubleToLongBits(income);
		result = 31 * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(mntWines);
		result = 31 * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(mntFruits);
		result = 31 * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(mntMeatProducts);
		result = 31 * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(mntFishProducts);
		result = 31 * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(mntSweetProducts);
		result = 31 * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(mntGoldProducts);
		result = 31 * result + (int) (temp ^ (temp >>> 32));
		result = 31 * result + (date != null ? date.hashCode() : 0);
		result = 31 * result + (atRisk ? 1 : 0);
		return result;
	}


	@Override
	public String toString() {
		return "Client{" +
				"id=" + id +
				", maritalStatus='" + maritalStatus + '\'' +
				", income=" + income +
				", mntWines=" + mntWines +
				", mntFruits=" + mntFruits +
				", mntMeatProducts=" + mntMeatProducts +
				", mntFishProducts=" + mntFishProducts +
				", mntSweetProducts=" + mntSweetProducts +
				", mntGoldProducts=" + mntGoldProducts +
				", date='" + date + '\'' +
				", atRisk=" + atRisk +
				'}';
	}
}

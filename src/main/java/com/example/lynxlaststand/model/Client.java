package com.example.lynxlaststand.model;

import java.util.Objects;

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

	public Client() {
		super();
	}

	public Client(String maritalStatus, double income, double mntWines, double mntFruits, double mntMeatProducts,
			double mntFishProducts, double mntSweetProducts, double mntGoldProducts) {
		super();
		this.maritalStatus = maritalStatus;
		this.income = income;
		this.mntWines = mntWines;
		this.mntFruits = mntFruits;
		this.mntMeatProducts = mntMeatProducts;
		this.mntFishProducts = mntFishProducts;
		this.mntSweetProducts = mntSweetProducts;
		this.mntGoldProducts = mntGoldProducts;
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

	@Override
	public int hashCode() {
		return Objects.hash(id, income, maritalStatus, mntFishProducts, mntFruits, mntGoldProducts, mntMeatProducts,
				mntSweetProducts, mntWines);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Client other = (Client) obj;
		return id == other.id && Double.doubleToLongBits(income) == Double.doubleToLongBits(other.income)
				&& Objects.equals(maritalStatus, other.maritalStatus)
				&& Double.doubleToLongBits(mntFishProducts) == Double.doubleToLongBits(other.mntFishProducts)
				&& Double.doubleToLongBits(mntFruits) == Double.doubleToLongBits(other.mntFruits)
				&& Double.doubleToLongBits(mntGoldProducts) == Double.doubleToLongBits(other.mntGoldProducts)
				&& Double.doubleToLongBits(mntMeatProducts) == Double.doubleToLongBits(other.mntMeatProducts)
				&& Double.doubleToLongBits(mntSweetProducts) == Double.doubleToLongBits(other.mntSweetProducts)
				&& Double.doubleToLongBits(mntWines) == Double.doubleToLongBits(other.mntWines);
	}

	@Override
	public String toString() {
		return "Client [id=" + id + ", maritalStatus=" + maritalStatus + ", income=" + income + ", mntWines=" + mntWines
				+ ", mntFruits=" + mntFruits + ", mntMeatProducts=" + mntMeatProducts + ", mntFishProducts="
				+ mntFishProducts + ", mntSweetProducts=" + mntSweetProducts + ", mntGoldProducts=" + mntGoldProducts
				+ "]";
	}

}

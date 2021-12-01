package com.entity;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="furniture")
public class Furniture 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int furnitureId;
	
	private String furnitureName;
	
	private String image;

	
	private String furnitureModel;
	
	private String furnitureColor;
	
	
	private int price;
	
	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}


	public int getFurnitureId() {
		return furnitureId;
	}

	public void setFurnitureId(int furnitureId) {
		this.furnitureId = furnitureId;
	}

	public String getFurnitureName() {
		return furnitureName;
	}

	public void setFurnitureName(String furnitureName) {
		this.furnitureName = furnitureName;
	}

	public String getFurnitureModel() {
		return furnitureModel;
	}

	public void setFurnitureModel(String furnitureModel) {
		this.furnitureModel = furnitureModel;
	}

	public String getFurnitureColor() {
		return furnitureColor;
	}

	public void setFurnitureColor(String furnitureColor) {
		this.furnitureColor = furnitureColor;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Furniture [furnitureId=" + furnitureId + ", furnitureName=" + furnitureName + ", image=" + image
				+ ", furnitureModel=" + furnitureModel + ", furnitureColor=" + furnitureColor + ", price=" + price
				+ "]";
	}

	
	
	

}

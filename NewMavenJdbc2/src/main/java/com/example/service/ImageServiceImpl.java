package com.example.service;

import java.sql.SQLException;
import java.util.List;

import com.example.dao.ImageDaoImpl;
import com.example.dao.ImageDaoInterface;
import com.example.model.Image;

public class ImageServiceImpl implements ImageServiceInterface {

	private ImageDaoInterface dao;
	{
		dao = new ImageDaoImpl();
	}
	public void addImage(Image image) throws SQLException {
		
		dao.addImage(image);
	}

	public List<Image> getAllImage() throws SQLException {
		return dao.getAllImage();
	}

	public Image getImageByImageUrl(String imageUrl) throws SQLException {
		return dao.getImageByImageUrl(imageUrl);
	}

	public void deleteImage(String imageUrl) throws SQLException {
		dao.deleteImage(imageUrl);
		
	}

	public void updateImage(String imageUrl, boolean isAvailable) throws SQLException {
		dao.updateImage(imageUrl, isAvailable);
		
	}

	

}

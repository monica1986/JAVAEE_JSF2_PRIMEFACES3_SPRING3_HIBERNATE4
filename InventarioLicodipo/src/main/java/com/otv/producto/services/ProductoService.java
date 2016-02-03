package com.otv.producto.services;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.otv.model.Producto;
import com.otv.producto.dao.IProductoDAO;

@Transactional(readOnly = true)
public class ProductoService implements IProductoService {

	// ProductoDAO is injected...
	IProductoDAO productoDAO;

	@Transactional(readOnly = false)
	@Override
	public void addProducto(Producto producto) {
		getProductoDAO().addProducto(producto);
	}

	@Transactional(readOnly = false)
	@Override
	public void deleteProducto(Producto producto) {
		getProductoDAO().deleteProducto(producto);
	}

	@Transactional(readOnly = false)
	@Override
	public void updateProducto(Producto producto) {
		getProductoDAO().updateProducto(producto);
	}

	@Override
	public Producto getProductoById(int codigo) {
		return getProductoDAO().getProductoById(codigo);
	}

	@Override
	public List<Producto> getProductos() {
		return getProductoDAO().getProductos();
	}

	public IProductoDAO getProductoDAO() {
		return productoDAO;
	}

	public void setProductoDAO(IProductoDAO productoDAO) {
		this.productoDAO = productoDAO;
	}
}
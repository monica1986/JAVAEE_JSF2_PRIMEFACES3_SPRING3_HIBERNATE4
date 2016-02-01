package com.otv.producto.dao;

import java.util.List;
 
import com.otv.model.Producto;
 
import org.hibernate.SessionFactory;
 
/**
 * DAO Productos
 */
 
public class ProductoDAO implements IProductoDAO {
     
    private SessionFactory sessionFactory;
 

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }
 

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
 

    @Override
    public void addProducto(Producto producto) {
        getSessionFactory().getCurrentSession().save(producto);
    }
 

    @Override
    public void deleteProducto(Producto producto) {
        getSessionFactory().getCurrentSession().delete(producto);
    }
 

    @Override
    public void updateProducto(Producto producto) {
        getSessionFactory().getCurrentSession().update(producto);
    }
 

    @Override
    public Producto getProductoById(int codigo) {
        List list = getSessionFactory().getCurrentSession()
                                            .createQuery("from Productos where id=?")
                                            .setParameter(0, codigo).list();
        return (Producto)list.get(0);
    }


	@Override
	public List<Producto> getProductos() {
		List list = getSessionFactory().getCurrentSession().createQuery("from Productos").list();
      return list;
		
	}
 

}